package com.fixmnew.bean;

/**
 * Capability entity. @author MyEclipse Persistence Tools
 */

public class Capability implements java.io.Serializable {

	// Fields

	private Integer id;
	private String communicationCapabilityCode;
	private String dataLinkCommunicationCapbilityCode;
	private String otherCommunicationCapabilities;
	private String otherDatalinkCapabilities;
	private String selectivceCallingCode;
	private String surveillanceCapabilityCode;
	private String colourCode;
	private String otherSurveillanceCapabilities;
	private String otherColour;
	private String dinghyCoverIndicator;
	private Integer number;
	private Integer totalCapability;
	private String emergencyRadioCapabilityTypeType;
	private String lifeJacketType;
	private String survivalEquipmentType;
	private String survivalEquipmentRemarks;
	private String navigationCapabilityCode;
	private String performanceBasedNavigationCapabilityCode;
	private String otherNaviagationCapabilities;
	private String standardCapabilitiesIndicator;
	private String aircraftRegistration;

	// Constructors

	/** default constructor */
	public Capability() {
	}

	/** minimal constructor */
	public Capability(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Capability(Integer id, String communicationCapabilityCode, String dataLinkCommunicationCapbilityCode,
			String otherCommunicationCapabilities, String otherDatalinkCapabilities, String selectivceCallingCode,
			String surveillanceCapabilityCode, String colourCode, String otherSurveillanceCapabilities,
			String otherColour, String dinghyCoverIndicator, Integer number, Integer totalCapability,
			String emergencyRadioCapabilityTypeType, String lifeJacketType, String survivalEquipmentType,
			String survivalEquipmentRemarks, String navigationCapabilityCode,
			String performanceBasedNavigationCapabilityCode, String otherNaviagationCapabilities,
			String standardCapabilitiesIndicator, String aircraftRegistration) {
		this.id = id;
		this.communicationCapabilityCode = communicationCapabilityCode;
		this.dataLinkCommunicationCapbilityCode = dataLinkCommunicationCapbilityCode;
		this.otherCommunicationCapabilities = otherCommunicationCapabilities;
		this.otherDatalinkCapabilities = otherDatalinkCapabilities;
		this.selectivceCallingCode = selectivceCallingCode;
		this.surveillanceCapabilityCode = surveillanceCapabilityCode;
		this.colourCode = colourCode;
		this.otherSurveillanceCapabilities = otherSurveillanceCapabilities;
		this.otherColour = otherColour;
		this.dinghyCoverIndicator = dinghyCoverIndicator;
		this.number = number;
		this.totalCapability = totalCapability;
		this.emergencyRadioCapabilityTypeType = emergencyRadioCapabilityTypeType;
		this.lifeJacketType = lifeJacketType;
		this.survivalEquipmentType = survivalEquipmentType;
		this.survivalEquipmentRemarks = survivalEquipmentRemarks;
		this.navigationCapabilityCode = navigationCapabilityCode;
		this.performanceBasedNavigationCapabilityCode = performanceBasedNavigationCapabilityCode;
		this.otherNaviagationCapabilities = otherNaviagationCapabilities;
		this.standardCapabilitiesIndicator = standardCapabilitiesIndicator;
		this.aircraftRegistration = aircraftRegistration;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCommunicationCapabilityCode() {
		return this.communicationCapabilityCode;
	}

	public void setCommunicationCapabilityCode(String communicationCapabilityCode) {
		this.communicationCapabilityCode = communicationCapabilityCode;
	}

	public String getDataLinkCommunicationCapbilityCode() {
		return this.dataLinkCommunicationCapbilityCode;
	}

	public void setDataLinkCommunicationCapbilityCode(String dataLinkCommunicationCapbilityCode) {
		this.dataLinkCommunicationCapbilityCode = dataLinkCommunicationCapbilityCode;
	}

	public String getOtherCommunicationCapabilities() {
		return this.otherCommunicationCapabilities;
	}

	public void setOtherCommunicationCapabilities(String otherCommunicationCapabilities) {
		this.otherCommunicationCapabilities = otherCommunicationCapabilities;
	}

	public String getOtherDatalinkCapabilities() {
		return this.otherDatalinkCapabilities;
	}

	public void setOtherDatalinkCapabilities(String otherDatalinkCapabilities) {
		this.otherDatalinkCapabilities = otherDatalinkCapabilities;
	}

	public String getSelectivceCallingCode() {
		return this.selectivceCallingCode;
	}

	public void setSelectivceCallingCode(String selectivceCallingCode) {
		this.selectivceCallingCode = selectivceCallingCode;
	}

	public String getSurveillanceCapabilityCode() {
		return this.surveillanceCapabilityCode;
	}

	public void setSurveillanceCapabilityCode(String surveillanceCapabilityCode) {
		this.surveillanceCapabilityCode = surveillanceCapabilityCode;
	}

	public String getColourCode() {
		return this.colourCode;
	}

	public void setColourCode(String colourCode) {
		this.colourCode = colourCode;
	}

	public String getOtherSurveillanceCapabilities() {
		return this.otherSurveillanceCapabilities;
	}

	public void setOtherSurveillanceCapabilities(String otherSurveillanceCapabilities) {
		this.otherSurveillanceCapabilities = otherSurveillanceCapabilities;
	}

	public String getOtherColour() {
		return this.otherColour;
	}

	public void setOtherColour(String otherColour) {
		this.otherColour = otherColour;
	}

	public String getDinghyCoverIndicator() {
		return this.dinghyCoverIndicator;
	}

	public void setDinghyCoverIndicator(String dinghyCoverIndicator) {
		this.dinghyCoverIndicator = dinghyCoverIndicator;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getTotalCapability() {
		return this.totalCapability;
	}

	public void setTotalCapability(Integer totalCapability) {
		this.totalCapability = totalCapability;
	}

	public String getEmergencyRadioCapabilityTypeType() {
		return this.emergencyRadioCapabilityTypeType;
	}

	public void setEmergencyRadioCapabilityTypeType(String emergencyRadioCapabilityTypeType) {
		this.emergencyRadioCapabilityTypeType = emergencyRadioCapabilityTypeType;
	}

	public String getLifeJacketType() {
		return this.lifeJacketType;
	}

	public void setLifeJacketType(String lifeJacketType) {
		this.lifeJacketType = lifeJacketType;
	}

	public String getSurvivalEquipmentType() {
		return this.survivalEquipmentType;
	}

	public void setSurvivalEquipmentType(String survivalEquipmentType) {
		this.survivalEquipmentType = survivalEquipmentType;
	}

	public String getSurvivalEquipmentRemarks() {
		return this.survivalEquipmentRemarks;
	}

	public void setSurvivalEquipmentRemarks(String survivalEquipmentRemarks) {
		this.survivalEquipmentRemarks = survivalEquipmentRemarks;
	}

	public String getNavigationCapabilityCode() {
		return this.navigationCapabilityCode;
	}

	public void setNavigationCapabilityCode(String navigationCapabilityCode) {
		this.navigationCapabilityCode = navigationCapabilityCode;
	}

	public String getPerformanceBasedNavigationCapabilityCode() {
		return this.performanceBasedNavigationCapabilityCode;
	}

	public void setPerformanceBasedNavigationCapabilityCode(String performanceBasedNavigationCapabilityCode) {
		this.performanceBasedNavigationCapabilityCode = performanceBasedNavigationCapabilityCode;
	}

	public String getOtherNaviagationCapabilities() {
		return this.otherNaviagationCapabilities;
	}

	public void setOtherNaviagationCapabilities(String otherNaviagationCapabilities) {
		this.otherNaviagationCapabilities = otherNaviagationCapabilities;
	}

	public String getStandardCapabilitiesIndicator() {
		return this.standardCapabilitiesIndicator;
	}

	public void setStandardCapabilitiesIndicator(String standardCapabilitiesIndicator) {
		this.standardCapabilitiesIndicator = standardCapabilitiesIndicator;
	}

	public String getAircraftRegistration() {
		return this.aircraftRegistration;
	}

	public void setAircraftRegistration(String aircraftRegistration) {
		this.aircraftRegistration = aircraftRegistration;
	}

}