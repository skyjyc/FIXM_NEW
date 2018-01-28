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

@javax.jws.WebService(targetNamespace = "http://mashallerService.fixmnew.com/", serviceName = "DepartureMashallerService", portName = "DepartureMashallerPort", wsdlLocation = "WEB-INF/wsdl/DepartureMashallerService.wsdl")

public class DepartureMashallerDelegate {

	com.fixmnew.mashallerService.DepartureMashaller departureMashaller = new com.fixmnew.mashallerService.DepartureMashaller();

	public String departuremashalelr(String aircraftRegistration) {
		return departureMashaller.departuremashalelr(aircraftRegistration);
	}

}