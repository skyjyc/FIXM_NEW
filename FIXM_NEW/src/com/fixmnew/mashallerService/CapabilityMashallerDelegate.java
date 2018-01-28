package com.fixmnew.mashallerService;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import com.cfar.swim.fixm.bind.FixmMarshaller;
import com.fixmnew.bean.Capability;
import com.fixmnew.bean.CapabilityDAO;
import aero.fixm.flight.*;
import aero.fixm.base.*;

@javax.jws.WebService(targetNamespace = "http://mashallerService.fixmnew.com/", serviceName = "CapabilityMashallerService", portName = "CapabilityMashallerPort", wsdlLocation = "WEB-INF/wsdl/CapabilityMashallerService.wsdl")

public class CapabilityMashallerDelegate {

	com.fixmnew.mashallerService.CapabilityMashaller capabilityMashaller = new com.fixmnew.mashallerService.CapabilityMashaller();

	public String capabilitymashaller(String aircraftRegistration) {
		return capabilityMashaller.capabilitymashaller(aircraftRegistration);
	}

}