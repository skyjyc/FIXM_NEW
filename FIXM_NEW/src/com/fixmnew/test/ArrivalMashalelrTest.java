package com.fixmnew.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.cfar.swim.fixm.bind.FixmMarshaller;
import com.fixmnew.bean.Arrival;
import com.fixmnew.bean.ArrivalDAO;

import aero.fixm.base.BearingType;
import aero.fixm.base.DesignatedPointOrNavaidType;
import aero.fixm.base.DistanceType;
import aero.fixm.base.GeographicalPositionType;
import aero.fixm.base.IcaoAerodromeReferenceType;
import aero.fixm.base.OtherReferenceType;
import aero.fixm.base.PositionPointType;
import aero.fixm.base.RelativePointType;
import aero.fixm.base.TimeType;
import aero.fixm.base.UomLengthType;
import aero.fixm.base.ZeroBearingTypeType;
import aero.fixm.flight.ArrivalType;
import aero.fixm.flight.ObjectFactory;

public class ArrivalMashalelrTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object aircraftRegistration="B-2213";
		//从DAO类创建实例，得到相应主键的Aircraft实体
				ArrivalDAO arrivalDAO= new ArrivalDAO();
				List list =arrivalDAO.findByAircraftRegistration("B-2213");
				String buf=null;
				for(int i=0;i<list.size();i++) {
					Arrival arrival=(Arrival)list.get(i);
					ObjectFactory off=new ObjectFactory();
					ArrivalType arrivalType=off.createArrivalType();
					
					arrivalType.setRunwayDirection(arrival.getRunwayDirection());
					//新建aero.fixm.base.ObjectFactory工厂类，生产base中AerodromeReferenceType的子类各类型实例,并设置取值
					aero.fixm.base.ObjectFactory ofb= new aero.fixm.base.ObjectFactory();
					IcaoAerodromeReferenceType icaoAerodromeReferenceType =ofb.createIcaoAerodromeReferenceType();
					icaoAerodromeReferenceType.setLocationIndicator(arrival.getLocationIndicator());
					OtherReferenceType otherreferencetype=ofb.createOtherReferenceType();
					otherreferencetype.setIataDesignator(arrival.getIataDesignator());
					otherreferencetype.setName(arrival.getName());
					
					PositionPointType positionPointType=ofb.createPositionPointType();
					GeographicalPositionType geographicalPositionType=ofb.createGeographicalPositionType();
					geographicalPositionType.setSrsName(arrival.getSrsName());
					geographicalPositionType.getPos().add(arrival.getLatitude());
					geographicalPositionType.getPos().add(arrival.getLongitude());
					positionPointType.setPosition(geographicalPositionType);
					RelativePointType relativePointType=ofb.createRelativePointType();
					BearingType bearingType=ofb.createBearingType();
					bearingType.setZeroBearingType(ZeroBearingTypeType.fromValue(arrival.getZeroBearingType()));
					//bearingType.setValue(arrival.getLenthValue());
					//bearingType.setUom(UomAngleType.DEG);
					//LengthType lengthType=ofb.createLengthType();
					DistanceType distanceType=ofb.createDistanceType();
					//lengthType.setUom(UomLengthType.fromValue(arrival.getUomlenth()));
					//lengthType.setValue(arrival.getLenthValue());
					distanceType.setUom(UomLengthType.fromValue(arrival.getUomlenth()));
					distanceType.setValue(arrival.getLenthValue());
					DesignatedPointOrNavaidType designatedPointOrNavaidType=ofb.createDesignatedPointOrNavaidType();
					designatedPointOrNavaidType.setDesignator(arrival.getDesignator());
					relativePointType.setBearing(bearingType);
					relativePointType.setDistance(distanceType);
					relativePointType.setReferencePoint(designatedPointOrNavaidType);
					otherreferencetype.setReferencePoint(positionPointType);
					arrivalType.setAerodrome(icaoAerodromeReferenceType);
					
					//TimeType的设置，置值
					TimeType timeType= ofb.createTimeType();
					XMLGregorianCalendar xt;
					try {
						xt = DatatypeFactory.newInstance().newXMLGregorianCalendar(arrival.getYear(), arrival.getMonth(), arrival.getDate(), arrival.getHour(), arrival.getMinute(), arrival.getSecond(), arrival.getMillisecond(), arrival.getTimezone());
						timeType.setValue(xt);
					} catch (DatatypeConfigurationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					timeType.setTimeReference(arrival.getTimeReference());
					arrivalType.setActualTimeOfArrival(timeType);
					//RunWayDirectionType的设置,置值
					arrivalType.setRunwayDirection(arrival.getRunwayDirection());
					arrivalType.setAerodrome(otherreferencetype);
					
					
					//创建JAXBElement，序列化arrivalType
					ByteArrayOutputStream bytearrayoutputstream=new ByteArrayOutputStream();
					JAXBElement<ArrivalType>jaxbElement_arrivaltype=off.createArrival(arrivalType);
					FixmMarshaller fixmMarshaller;
					try {
						fixmMarshaller = new FixmMarshaller();
						fixmMarshaller.marshal(jaxbElement_arrivaltype,bytearrayoutputstream);
					} catch (JAXBException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					//每个arrival的序列化暂时缓存数组
					String outString=bytearrayoutputstream.toString();
//					byte[] buf1=bytearrayoutputstream.toByteArray();
//					for(int i1=0;i1<=buf1.length;i1++)
//					{
//					  System.out.println(buf1);
//					}
					try {
						bytearrayoutputstream.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//将每个序列化的数组结果放进外层buf
					//System.arraycopy(buf1, 0, buf, 0, buf1.length);
					buf=buf+outString;
				} 
				System.out.println(buf);
			  }
	}
	
