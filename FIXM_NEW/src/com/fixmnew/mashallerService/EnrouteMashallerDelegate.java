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

@javax.jws.WebService(targetNamespace = "http://mashallerService.fixmnew.com/", serviceName = "EnrouteMashallerService", portName = "EnrouteMashallerPort", wsdlLocation = "WEB-INF/wsdl/EnrouteMashallerService.wsdl")

public class EnrouteMashallerDelegate {

	com.fixmnew.mashallerService.EnrouteMashaller enrouteMashaller = new com.fixmnew.mashallerService.EnrouteMashaller();

	public String enroutemashaller(String aircraftRegistration) {
		return enrouteMashaller.enroutemashaller(aircraftRegistration);
	}

}