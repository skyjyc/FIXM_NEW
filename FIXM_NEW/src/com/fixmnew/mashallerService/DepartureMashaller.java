package com.fixmnew.mashallerService;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.cfar.swim.fixm.bind.FixmMarshaller;
import com.fixmnew.bean.Departure;
import com.fixmnew.bean.DepartureDAO;

import aero.fixm.flight.*;
import aero.fixm.base.*;

public class DepartureMashaller {
  public String departuremashalelr(String aircraftRegistration){
	  String buf=null;
	  DepartureDAO departuredao	=new DepartureDAO();
	  List<Departure> depatureList=departuredao.findByAircraftRegistration(aircraftRegistration);
		
		for(int i=0;i<depatureList.size();i++){
			//得到每次循环的List中的仪的departure对象
			Departure departure=depatureList.get(i);
			//Flight工厂类创建根元素类型
			aero.fixm.flight.ObjectFactory off=new aero.fixm.flight.ObjectFactory();
			DepartureType departureType=off.createDepartureType();
			
			//置值TimeType（精确离场时间）
			aero.fixm.base.ObjectFactory ofb=new aero.fixm.base.ObjectFactory();
			TimeType timeType=ofb.createTimeType();
			
			XMLGregorianCalendar xt;
			try {
				xt = DatatypeFactory.newInstance().newXMLGregorianCalendar(departure.getYear(), departure.getMonth(), departure.getDate(), departure.getHour(), departure.getMinute(), departure.getSecond(), departure.getMillisecond(), departure.getTimezone());
				timeType.setValue(xt);
			} catch (DatatypeConfigurationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			timeType.setTimeReference("UTC");
			departureType.setActualTimeOfDeparture(timeType);
			//新建aero.fixm.base.ObjectFactory工厂类，生产base中AerodromeReferenceType的子类各类型实例,并设置Aerodrome取值
			IcaoAerodromeReferenceType icaoAerodromeReferenceType =ofb.createIcaoAerodromeReferenceType();
			icaoAerodromeReferenceType.setLocationIndicator(departure.getLocationIndicator());
			departureType.setAerodrome(icaoAerodromeReferenceType);
			//estimatedoffBlockTime置值与加入
			TimeType timeType1=ofb.createTimeType();
			
			XMLGregorianCalendar xt1;
			try {
				xt1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(departure.getEstimateYear(), departure.getEstimateMonth(), departure.getEstimateDate(), departure.getEstimateHour(), departure.getEstimateMinute(), departure.getEstimateSecond(), departure.getEstimateMillisecond(), departure.getEstimateTimezone());
				timeType.setValue(xt1);
			} catch (DatatypeConfigurationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			timeType.setTimeReference("UTC");
			departureType.setEstimatedOffBlockTime(timeType1);
			//新建aero.fixm.base.ObjectFactory工厂类，生产base中AerodromeReferenceType的子类各类型实例,并设置takeoffAlternateAerodrome取值
			IcaoAerodromeReferenceType icaoAerodromeReferenceType1 =ofb.createIcaoAerodromeReferenceType();
			icaoAerodromeReferenceType1.setLocationIndicator(departure.getAlternateLocationIndicator());
			departureType.setAerodrome(icaoAerodromeReferenceType1);
			departureType.setRunwayDirection(departure.getRunwayDirectionDesignator());
			//创建JAXBElement，序列化arrivalType
			ByteArrayOutputStream bytearrayoutputstream=new ByteArrayOutputStream();
			JAXBElement<DepartureType>jaxbElement_departuretype=off.createDeparture(departureType);
			FixmMarshaller fixmMarshaller;
			try {
				fixmMarshaller = new FixmMarshaller();
				fixmMarshaller.marshal(jaxbElement_departuretype,bytearrayoutputstream);
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//每个arrival的序列化暂时缓存数组
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
			//将每个序列化的数组结果放进外层buf
			//System.arraycopy(buf1, 0, buf, 0, buf1.length);
			buf=buf+buf1;
		}
	  return buf;
  }
}
