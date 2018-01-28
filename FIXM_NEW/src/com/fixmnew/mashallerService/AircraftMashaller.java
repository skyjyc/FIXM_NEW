package com.fixmnew.mashallerService;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import com.cfar.swim.fixm.bind.FixmMarshaller;
import com.fixmnew.bean.Aircraft;
import com.fixmnew.bean.AircraftDAO;

import aero.fixm.base.ColourChoiceType;
import aero.fixm.base.ColourCodeType;
import aero.fixm.flight.AircraftApproachCategoryType;
import aero.fixm.flight.AircraftType;
import aero.fixm.flight.AircraftTypeType;
import aero.fixm.flight.CommunicationCapabilitiesType;
import aero.fixm.flight.IcaoAircraftTypeReferenceType;
import aero.fixm.flight.ObjectFactory;
import aero.fixm.flight.WakeTurbulenceCategoryType;
public class AircraftMashaller {
	//mashaller服务类方法
	public String aircraftmashaller(String id){
		//从DAO类创建实例，得到相应主键的Aircraft实体
		AircraftDAO aircraftdao	=new AircraftDAO();
		Aircraft aircraft=aircraftdao.findById(id);
		//各类参数（字段）实例化并取值
		ObjectFactory of=new ObjectFactory();
		AircraftType aircraftype=of.createAircraftType();
		
		ColourChoiceType colourChoiceType=new ColourChoiceType();
		
		//CommunicationCapabilitiesType communicationCapabilitiesType=new CommunicationCapabilitiesType();
		colourChoiceType.setOtherColour(aircraft.getOtherColour());
		colourChoiceType.getColourCode().add(ColourCodeType.fromValue(aircraft.getColourCode()));
		
		//AircraftType类型实例化,并设置到aircrafttype实体
		AircraftTypeType aircraftTypeType=of.createAircraftTypeType();
		aircraftTypeType.setNumberOfAircraft(aircraft.getAircraftTypeNumberofAircraft());
		IcaoAircraftTypeReferenceType icaoAircraftTypeReferenceType=new IcaoAircraftTypeReferenceType();
		icaoAircraftTypeReferenceType.setIcaoAircraftTypeDesignator(aircraft.getIcaoAircraftTypeReference());
		aircraftTypeType.setType(icaoAircraftTypeReferenceType);
		aircraftype.getAircraftType().add(aircraftTypeType);
		
		//置取值到aircrafttype实例
		aircraftype.setAircraftAddress(aircraft.getAircraftAddress());
		
		aircraftype.setAircraftApproachCategory(AircraftApproachCategoryType.fromValue(aircraft.getAircraftApproachCategory()));
		
		aircraftype.setNumberOfAircraft(aircraft.getNumberofAircraft());
		
		aircraftype.setRegistration(aircraft.getAircraftRegistration());
		
		aircraftype.setSignificantMarkings(aircraft.getSignificantMarkings());
		
		aircraftype.setWakeTurbulence(WakeTurbulenceCategoryType.fromValue(aircraft.getWakeTurbulenceCategory()));
		
		//JAXB序列化
		JAXBElement<AircraftType> atElement =of.createAircraft(aircraftype) ;
		FixmMarshaller fixmMarshaller;
		ByteArrayOutputStream bytearrayoutputstream=new ByteArrayOutputStream();
		try {
			fixmMarshaller = new FixmMarshaller();
			fixmMarshaller.marshal(atElement, bytearrayoutputstream);
		
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String outString=bytearrayoutputstream.toString();
//		byte[] buf=bytearrayoutputstream.toByteArray();
//		for(int i=0;i<=buf.length;i++)
//		{
//		  System.out.println(buf);
//		}
		System.out.println(outString);
		try {
			bytearrayoutputstream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return outString;
		
	}
}
