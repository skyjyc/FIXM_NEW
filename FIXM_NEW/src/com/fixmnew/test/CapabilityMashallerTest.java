package com.fixmnew.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import com.cfar.swim.fixm.bind.FixmMarshaller;
import com.fixmnew.bean.Capability;
import com.fixmnew.bean.CapabilityDAO;

import aero.fixm.base.ColourChoiceType;
import aero.fixm.base.ColourCodeType;
import aero.fixm.flight.CommunicationCapabilitiesType;
import aero.fixm.flight.CommunicationCapabilityCodeType;
import aero.fixm.flight.DatalinkCommunicationCapabilityCodeType;
import aero.fixm.flight.DinghiesType;
import aero.fixm.flight.DinghyCoverIndicatorType;
import aero.fixm.flight.EmergencyRadioCapabilityTypeType;
import aero.fixm.flight.FlightCapabilitiesType;
import aero.fixm.flight.LifeJacketTypeType;
import aero.fixm.flight.NavigationCapabilitiesType;
import aero.fixm.flight.NavigationCapabilityCodeType;
import aero.fixm.flight.PerformanceBasedNavigationCapabilityCodeType;
import aero.fixm.flight.StandardCapabilitiesIndicatorType;
import aero.fixm.flight.SurveillanceCapabilitiesType;
import aero.fixm.flight.SurveillanceCapabilityCodeType;
import aero.fixm.flight.SurvivalCapabilitiesType;
import aero.fixm.flight.SurvivalEquipmentTypeType;

public class CapabilityMashallerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CapabilityDAO capabilitydao	=new CapabilityDAO();
		List<Capability> capabilityList=capabilitydao.findByAircraftRegistration("B-2213");
		String buf=null;
		for(int i=0;i<capabilityList.size();i++){
			//得到每次循环的List中的仪的capability对象
			Capability capability=capabilityList.get(i);
			//Flight中的工厂类
			aero.fixm.flight.ObjectFactory off=new aero.fixm.flight.ObjectFactory();
			//新建FlightCapabilities根类型
			FlightCapabilitiesType flightCapabilitiesType =off.createFlightCapabilitiesType();
			//从Flight工厂类中创建类型CommunicationCapabilitiesType
			CommunicationCapabilitiesType communicationcapabilityType=off.createCommunicationCapabilitiesType();
			//CCT置值
			communicationcapabilityType.getCommunicationCapabilityCode().add(CommunicationCapabilityCodeType.fromValue(capability.getCommunicationCapabilityCode()));
			communicationcapabilityType.getDatalinkCommunicationCapabilityCode().add(DatalinkCommunicationCapabilityCodeType.fromValue(capability.getDataLinkCommunicationCapbilityCode()));
			//communicationcapabilityType.getDatalinkCommunicationCapabilityCode().add(DatalinkCommunicationCapabilityCodeType.J_1);
			communicationcapabilityType.setOtherCommunicationCapabilities(capability.getOtherCommunicationCapabilities());
			communicationcapabilityType.setOtherDataLinkCapabilities(capability.getDataLinkCommunicationCapbilityCode());
			communicationcapabilityType.setSelectiveCallingCode(capability.getSelectivceCallingCode());
			flightCapabilitiesType.setCommunication(communicationcapabilityType);
			//从Flight工厂类创建类型SurvivalCapabilities类型
			SurvivalCapabilitiesType survivalCapabilitiesType=off.createSurvivalCapabilitiesType();
			//给SurvivalCapabilitiesType置值
			survivalCapabilitiesType.setSurvivalEquipmentRemarks(capability.getSurvivalEquipmentRemarks());
			  //创建Dinghies类型
			  DinghiesType dinghiesType=off.createDinghiesType();
			  	//创建base中的工厂类
			  	aero.fixm.base.ObjectFactory ofb=new aero.fixm.base.ObjectFactory();
			  	//ColourChoiceType置值
			  	ColourChoiceType colourChoiceType=ofb.createColourChoiceType();
			  	colourChoiceType.getColourCode().add(ColourCodeType.fromValue(capability.getColourCode()));
			  	colourChoiceType.setOtherColour(capability.getOtherColour());
			  	dinghiesType.setColour(colourChoiceType);
			  	//DinghyCoverIndicatorType置值
			  	dinghiesType.setCovered(DinghyCoverIndicatorType.fromValue(capability.getDinghyCoverIndicator()));
			  	//number和totalCapability置值
			  	dinghiesType.setNumber(capability.getNumber());
			  	dinghiesType.setTotalCapacity(capability.getTotalCapability());
			  //加入dingtiesType
			survivalCapabilitiesType.setDinghyInformation(dinghiesType);
			survivalCapabilitiesType.getEmergencyRadioCapabilityType().add(EmergencyRadioCapabilityTypeType.fromValue(capability.getEmergencyRadioCapabilityTypeType()));
			survivalCapabilitiesType.getLifeJacketType().add(LifeJacketTypeType.fromValue(capability.getLifeJacketType()));
			survivalCapabilitiesType.getSurvivalEquipmentType().add(SurvivalEquipmentTypeType.fromValue(capability.getSurvivalEquipmentType()));
			flightCapabilitiesType.setSurvival(survivalCapabilitiesType);
			//从Flight工厂类创建类型SurveillianceCapabilities类型  
			SurveillanceCapabilitiesType surveillanceCapabilitiesType=off.createSurveillanceCapabilitiesType();
			//SurveillianceCapabilities置值
			surveillanceCapabilitiesType.setOtherSurveillanceCapabilities(capability.getOtherSurveillanceCapabilities()); 
			surveillanceCapabilitiesType.getSurveillanceCapabilityCode().add(SurveillanceCapabilityCodeType.fromValue(capability.getSurveillanceCapabilityCode()));
			flightCapabilitiesType.setSurveillance(surveillanceCapabilitiesType);
			//从Flight工厂类创建NavigationCapabilitiesType
			NavigationCapabilitiesType navigationCapabilitiesType=off.createNavigationCapabilitiesType();
			//NavigationCapabilitiesType置值
			navigationCapabilitiesType.setOtherNavigationCapabilities(capability.getOtherNaviagationCapabilities());
			navigationCapabilitiesType.getNavigationCapabilityCode().add(NavigationCapabilityCodeType.fromValue(capability.getNavigationCapabilityCode()));
			navigationCapabilitiesType.getPerformanceBasedCode().add(PerformanceBasedNavigationCapabilityCodeType.fromValue(capability.getPerformanceBasedNavigationCapabilityCode()));
			flightCapabilitiesType.setNavigation(navigationCapabilitiesType);
			//StandardCapabilitiesIndicatorType加入
			flightCapabilitiesType.setStandardCapabilities(StandardCapabilitiesIndicatorType.fromValue(capability.getStandardCapabilitiesIndicator()));
			//JAXB序列化
			JAXBElement<FlightCapabilitiesType> FlightCapabilitiesTypeJAXBElement =off.createFlightCapabilities(flightCapabilitiesType) ;
			FixmMarshaller fixmMarshaller;
			ByteArrayOutputStream bytearrayoutputstream=new ByteArrayOutputStream();
			try {
				fixmMarshaller = new FixmMarshaller();
				fixmMarshaller.marshal(FlightCapabilitiesTypeJAXBElement, bytearrayoutputstream);
			
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String buf1=bytearrayoutputstream.toString();
//			for(int i1=0;i1<=buf1.length;i1++)
//			{
//			  System.out.println(buf1);
//			}
			try {
				bytearrayoutputstream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.arraycopy(buf1, 0, buf, 0, buf1.length);
			buf=buf+buf1;
		}
		System.out.println( buf);
	}

}
