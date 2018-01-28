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
import com.fixmnew.bean.Arrival;
import com.fixmnew.bean.ArrivalDAO;
import aero.fixm.base.*;
import aero.fixm.flight.*;
import aero.fixm.flight.ObjectFactory;

@javax.jws.WebService(targetNamespace = "http://mashallerService.fixmnew.com/", serviceName = "ArrivalMashallerService", portName = "ArrivalMashallerPort", wsdlLocation = "WEB-INF/wsdl/ArrivalMashallerService.wsdl")

public class ArrivalMashallerDelegate {

	com.fixmnew.mashallerService.ArrivalMashaller arrivalMashaller = new com.fixmnew.mashallerService.ArrivalMashaller();

	public String arrivalmashaller(String aircraftRegistration) {
		return arrivalMashaller.arrivalmashaller(aircraftRegistration);
	}

}