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
import com.fixmnew.bean.Enroute;
import com.fixmnew.bean.EnrouteDAO;

import aero.fixm.base.*;
import aero.fixm.flight.*;
import aero.fixm.flight.ObjectFactory;
public class EnrouteMashaller {
  public String enroutemashaller(String aircraftRegistration){
	  String buf=null;
	//从DAO类创建实例，得到相应主键的enroute实体
			EnrouteDAO enroutedao=new EnrouteDAO();
			List<Enroute> enrouteList=enroutedao.findByAircraftRegistration(aircraftRegistration);
			for(int i=0;i<enrouteList.size();i++){
				Enroute enroute=enrouteList.get(i);
				//创建根元素 
				ObjectFactory off=new ObjectFactory();
				EnRouteType enRouteType=off.createEnRouteType();
				//从自建类AerodromeReferenceReturn中获得返回类型AerodromeReferenceType的子类，并针对字段是否为空的不同情况，进行根元素添加子类
				AerodromeReferenceReturn aerodromeReferenceReturn=new AerodromeReferenceReturn();
				if(!enroute.getLocationIndicator().equals(null)){
					AerodromeReferenceType aerodromeReferenceType=aerodromeReferenceReturn.icaoAerodromeReferenceSettion(enroute.getLocationIndicator());
					enRouteType.getAlternateAerodrome().add(aerodromeReferenceType);
					
				}else{
					AerodromeReferenceType aerodromeReferenceType=aerodromeReferenceReturn.otherReferenceSetting(enroute);
					enRouteType.getAlternateAerodrome().add(aerodromeReferenceType);
				}
				//currentSsrCode置值，加入enRoute
				aero.fixm.base.ObjectFactory ofb=new aero.fixm.base.ObjectFactory();
				SsrCodeType ssrCodeType=ofb.createSsrCodeType();
				ssrCodeType.setValue(enroute.getValue());
				ssrCodeType.setSsrMode(SsrModeType.fromValue(enroute.getSsrModeType()));
				enRouteType.setCurrentSsrCode(ssrCodeType);
				//BoundaryCrossingType置值，并加入enroute
				BoundaryCrossingType boundaryCrossingType=off.createBoundaryCrossingType();
					//FlightLevelOrAltitude置值，加入boundaryCrossingType
					FlightLevelOrAltitudeType flightLevelOrAltitudeType=ofb.createFlightLevelOrAltitudeType();
						//AltitudeType置值，加入flightLevelOrAltitudeType
						AltitudeType altitudeType=ofb.createAltitudeType();
						altitudeType.setUom(UomAltitudeType.fromValue(enroute.getUomAltitudeType()));
						flightLevelOrAltitudeType.setAltitude(altitudeType);
						//FlightLevelType置值，加入flightLevelOrAltitudeType
						FlightLevelType FlightLevelType =ofb.createFlightLevelType();
						FlightLevelType.setUom(UomFlightLevelType.fromValue(enroute.getUomFlightLevelType()));
						flightLevelOrAltitudeType.setFlightLevel(FlightLevelType);
					boundaryCrossingType.setClearedLevel(flightLevelOrAltitudeType);
					
					
				//SignificantPointType置值，并加入;借助自建类AerodromeReferenceReturn
					AerodromeReferenceReturn aerodromeReferenceReturn1=new AerodromeReferenceReturn();
					if(!String.valueOf(enroute.getSpointLatitude()).equals(null)&&!String.valueOf(enroute.getSpointLongtitude()).equals(null)){
						SignificantPointType significantPointType=aerodromeReferenceReturn1.positionPointTypeReturn(enroute);
						boundaryCrossingType.setCrossingPoint(significantPointType);
					}else{
						SignificantPointType significantPointType=aerodromeReferenceReturn1.RelativePointTypeReturn(enroute);
						boundaryCrossingType.setCrossingPoint(significantPointType);
					}
					
				//TimeType置值，并加入boundaryCrossingType
					TimeType timeType= ofb.createTimeType();
					XMLGregorianCalendar xt;
					try {
						xt = DatatypeFactory.newInstance().newXMLGregorianCalendar(enroute.getYear(), enroute.getMonth(), enroute.getDate(), enroute.getHour(), enroute.getMinute(), enroute.getSecond(), enroute.getMillisecond(), enroute.getTimezone());
						timeType.setValue(xt);
					} catch (DatatypeConfigurationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					timeType.setTimeReference("UTC");
					boundaryCrossingType.setCrossingTime(timeType);
				//AltitudeInTransitionType置值，并加入boundaryCrossingType
					AltitudeInTransitionType AltitudeInTransitionType=off.createAltitudeInTransitionType();
						//BoundaryCrossingConditionType置值，并加入altitudeInTransitionType
					AltitudeInTransitionType.setCrossingCondition(BoundaryCrossingConditionType.fromValue(enroute.getBoundaryCrossingConditionType()));
				boundaryCrossingType.setAltitudeInTransition(AltitudeInTransitionType);
			enRouteType.setBoundaryCrossingCoordination(boundaryCrossingType);
			//JAXB序列化
			JAXBElement<EnRouteType> EnRouteTypeJAXBElement =off.createEnRoute(enRouteType) ;
			FixmMarshaller fixmMarshaller;
			ByteArrayOutputStream bytearrayoutputstream=new ByteArrayOutputStream();
			try {
				fixmMarshaller = new FixmMarshaller();
				fixmMarshaller.marshal(EnRouteTypeJAXBElement, bytearrayoutputstream);
			
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
	  return buf;
  }
}

class AerodromeReferenceReturn{
	aero.fixm.base.ObjectFactory ofb=new aero.fixm.base.ObjectFactory();
	
	public AerodromeReferenceType icaoAerodromeReferenceSettion(String locationindicator){
		IcaoAerodromeReferenceType icaoAerodromeReferenceType=ofb.createIcaoAerodromeReferenceType();
		icaoAerodromeReferenceType.setLocationIndicator(locationindicator);
		return icaoAerodromeReferenceType;
	}
	public AerodromeReferenceType otherReferenceSetting(Enroute enroute){
		OtherReferenceType otherReferenceType=ofb.createOtherReferenceType();
		otherReferenceType.setName(enroute.getName());
		otherReferenceType.setIataDesignator(enroute.getIataDesignator());
		if(!String.valueOf(enroute.getLatitude()).equals(null)&&!String.valueOf(enroute.getLongtitude()).equals(null)){
			otherReferenceType.setReferencePoint(this.positionPointTypeReturn(enroute));
		return otherReferenceType;
		}else{
			otherReferenceType.setReferencePoint(this.RelativePointTypeReturn(enroute));
		return otherReferenceType;
		}
	}
	public SignificantPointType positionPointTypeReturn(Enroute enroute){
		PositionPointType positionPointType=ofb.createPositionPointType();
		GeographicalPositionType geographicalPositionType =ofb.createGeographicalPositionType();
		geographicalPositionType.getPos().add(enroute.getLatitude());
		geographicalPositionType.getPos().add(enroute.getLongtitude());
		geographicalPositionType.setSrsName(enroute.getSrsName());
		positionPointType.setPosition(geographicalPositionType);
		return positionPointType;
	}
	public SignificantPointType RelativePointTypeReturn(Enroute enroute){
		RelativePointType relativepointType=ofb.createRelativePointType();
		BearingType bearingType=ofb.createBearingType();
		bearingType.setZeroBearingType(ZeroBearingTypeType.fromValue(enroute.getZeroBearingType()));
		DistanceType distanceType=ofb.createDistanceType();
		distanceType.setUom(UomLengthType.fromValue(enroute.getUomLengthType()));
		distanceType.setValue(enroute.getLengthValue());
		DesignatedPointOrNavaidType designatedPointOrNavaidType=ofb.createDesignatedPointOrNavaidType();
		designatedPointOrNavaidType.setDesignator(enroute.getDesignator());
		relativepointType.setBearing(bearingType);
		relativepointType.setDistance(distanceType);
		relativepointType.setReferencePoint(designatedPointOrNavaidType);
		return relativepointType; 
	}
}
