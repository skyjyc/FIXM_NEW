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

@javax.jws.WebService(targetNamespace = "http://mashallerService.fixmnew.com/", serviceName = "AircraftMashallerService", portName = "AircraftMashallerPort", wsdlLocation = "WEB-INF/wsdl/AircraftMashallerService.wsdl")

public class AircraftMashallerDelegate {

	com.fixmnew.mashallerService.AircraftMashaller aircraftMashaller = new com.fixmnew.mashallerService.AircraftMashaller();

	public String aircraftmashaller(String id) {
		return aircraftMashaller.aircraftmashaller(id);
	}

}