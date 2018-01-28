package com.fixmnew.bean;

/**
 * Enroute entity. @author MyEclipse Persistence Tools
 */

public class Enroute implements java.io.Serializable {

	// Fields

	private Integer idenroute;
	private String locationIndicator;
	private String iataDesignator;
	private String name;
	private Double latitude;
	private Double longtitude;
	private String srsName;
	private String zeroBearingType;
	private Double lengthValue;
	private String designator;
	private String uomLengthType;
	private String boundaryCrossingConditionType;
	private String uomAltitudeType;
	private String uomFlightLevelType;
	private Double spointLatitude;
	private Double spointLongtitude;
	private String spointSrsName;
	private String spointZeroBearingType;
	private Double spointLengthValue;
	private String spointUomLengthValue;
	private String spointDesignator;
	private Integer year;
	private Integer month;
	private Integer date;
	private Integer hour;
	private Integer minute;
	private Integer second;
	private Integer millisecond;
	private Integer timezone;
	private String value;
	private String ssrModeType;
	private String aircraftRegistration;

	// Constructors

	/** default constructor */
	public Enroute() {
	}

	/** full constructor */
	public Enroute(String locationIndicator, String iataDesignator, String name, Double latitude, Double longtitude,
			String srsName, String zeroBearingType, Double lengthValue, String designator, String uomLengthType,
			String boundaryCrossingConditionType, String uomAltitudeType, String uomFlightLevelType,
			Double spointLatitude, Double spointLongtitude, String spointSrsName, String spointZeroBearingType,
			Double spointLengthValue, String spointUomLengthValue, String spointDesignator, Integer year, Integer month,
			Integer date, Integer hour, Integer minute, Integer second, Integer millisecond, Integer timezone,
			String value, String ssrModeType, String aircraftRegistration) {
		this.locationIndicator = locationIndicator;
		this.iataDesignator = iataDesignator;
		this.name = name;
		this.latitude = latitude;
		this.longtitude = longtitude;
		this.srsName = srsName;
		this.zeroBearingType = zeroBearingType;
		this.lengthValue = lengthValue;
		this.designator = designator;
		this.uomLengthType = uomLengthType;
		this.boundaryCrossingConditionType = boundaryCrossingConditionType;
		this.uomAltitudeType = uomAltitudeType;
		this.uomFlightLevelType = uomFlightLevelType;
		this.spointLatitude = spointLatitude;
		this.spointLongtitude = spointLongtitude;
		this.spointSrsName = spointSrsName;
		this.spointZeroBearingType = spointZeroBearingType;
		this.spointLengthValue = spointLengthValue;
		this.spointUomLengthValue = spointUomLengthValue;
		this.spointDesignator = spointDesignator;
		this.year = year;
		this.month = month;
		this.date = date;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.millisecond = millisecond;
		this.timezone = timezone;
		this.value = value;
		this.ssrModeType = ssrModeType;
		this.aircraftRegistration = aircraftRegistration;
	}

	// Property accessors

	public Integer getIdenroute() {
		return this.idenroute;
	}

	public void setIdenroute(Integer idenroute) {
		this.idenroute = idenroute;
	}

	public String getLocationIndicator() {
		return this.locationIndicator;
	}

	public void setLocationIndicator(String locationIndicator) {
		this.locationIndicator = locationIndicator;
	}

	public String getIataDesignator() {
		return this.iataDesignator;
	}

	public void setIataDesignator(String iataDesignator) {
		this.iataDesignator = iataDesignator;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongtitude() {
		return this.longtitude;
	}

	public void setLongtitude(Double longtitude) {
		this.longtitude = longtitude;
	}

	public String getSrsName() {
		return this.srsName;
	}

	public void setSrsName(String srsName) {
		this.srsName = srsName;
	}

	public String getZeroBearingType() {
		return this.zeroBearingType;
	}

	public void setZeroBearingType(String zeroBearingType) {
		this.zeroBearingType = zeroBearingType;
	}

	public Double getLengthValue() {
		return this.lengthValue;
	}

	public void setLengthValue(Double lengthValue) {
		this.lengthValue = lengthValue;
	}

	public String getDesignator() {
		return this.designator;
	}

	public void setDesignator(String designator) {
		this.designator = designator;
	}

	public String getUomLengthType() {
		return this.uomLengthType;
	}

	public void setUomLengthType(String uomLengthType) {
		this.uomLengthType = uomLengthType;
	}

	public String getBoundaryCrossingConditionType() {
		return this.boundaryCrossingConditionType;
	}

	public void setBoundaryCrossingConditionType(String boundaryCrossingConditionType) {
		this.boundaryCrossingConditionType = boundaryCrossingConditionType;
	}

	public String getUomAltitudeType() {
		return this.uomAltitudeType;
	}

	public void setUomAltitudeType(String uomAltitudeType) {
		this.uomAltitudeType = uomAltitudeType;
	}

	public String getUomFlightLevelType() {
		return this.uomFlightLevelType;
	}

	public void setUomFlightLevelType(String uomFlightLevelType) {
		this.uomFlightLevelType = uomFlightLevelType;
	}

	public Double getSpointLatitude() {
		return this.spointLatitude;
	}

	public void setSpointLatitude(Double spointLatitude) {
		this.spointLatitude = spointLatitude;
	}

	public Double getSpointLongtitude() {
		return this.spointLongtitude;
	}

	public void setSpointLongtitude(Double spointLongtitude) {
		this.spointLongtitude = spointLongtitude;
	}

	public String getSpointSrsName() {
		return this.spointSrsName;
	}

	public void setSpointSrsName(String spointSrsName) {
		this.spointSrsName = spointSrsName;
	}

	public String getSpointZeroBearingType() {
		return this.spointZeroBearingType;
	}

	public void setSpointZeroBearingType(String spointZeroBearingType) {
		this.spointZeroBearingType = spointZeroBearingType;
	}

	public Double getSpointLengthValue() {
		return this.spointLengthValue;
	}

	public void setSpointLengthValue(Double spointLengthValue) {
		this.spointLengthValue = spointLengthValue;
	}

	public String getSpointUomLengthValue() {
		return this.spointUomLengthValue;
	}

	public void setSpointUomLengthValue(String spointUomLengthValue) {
		this.spointUomLengthValue = spointUomLengthValue;
	}

	public String getSpointDesignator() {
		return this.spointDesignator;
	}

	public void setSpointDesignator(String spointDesignator) {
		this.spointDesignator = spointDesignator;
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return this.month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getDate() {
		return this.date;
	}

	public void setDate(Integer date) {
		this.date = date;
	}

	public Integer getHour() {
		return this.hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public Integer getMinute() {
		return this.minute;
	}

	public void setMinute(Integer minute) {
		this.minute = minute;
	}

	public Integer getSecond() {
		return this.second;
	}

	public void setSecond(Integer second) {
		this.second = second;
	}

	public Integer getMillisecond() {
		return this.millisecond;
	}

	public void setMillisecond(Integer millisecond) {
		this.millisecond = millisecond;
	}

	public Integer getTimezone() {
		return this.timezone;
	}

	public void setTimezone(Integer timezone) {
		this.timezone = timezone;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getSsrModeType() {
		return this.ssrModeType;
	}

	public void setSsrModeType(String ssrModeType) {
		this.ssrModeType = ssrModeType;
	}

	public String getAircraftRegistration() {
		return this.aircraftRegistration;
	}

	public void setAircraftRegistration(String aircraftRegistration) {
		this.aircraftRegistration = aircraftRegistration;
	}

}