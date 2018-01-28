package com.fixmnew.bean;

/**
 * Arrival entity. @author MyEclipse Persistence Tools
 */

public class Arrival implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer year;
	private Integer month;
	private Integer date;
	private Integer hour;
	private Integer minute;
	private Integer second;
	private Integer millisecond;
	private Integer timezone;
	private String timeReference;
	private String locationIndicator;
	private String iataDesignator;
	private String name;
	private String runwayDirection;
	private Double latitude;
	private Double longitude;
	private String srsName;
	private String designator;
	private String zeroBearingType;
	private Double lenthValue;
	private String uomlenth;
	private String aircraftRegistration;

	// Constructors

	/** default constructor */
	public Arrival() {
	}

	/** full constructor */
	public Arrival(Integer year, Integer month, Integer date, Integer hour, Integer minute, Integer second,
			Integer millisecond, Integer timezone, String timeReference, String locationIndicator,
			String iataDesignator, String name, String runwayDirection, Double latitude, Double longitude,
			String srsName, String designator, String zeroBearingType, Double lenthValue, String uomlenth,
			String aircraftRegistration) {
		this.year = year;
		this.month = month;
		this.date = date;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.millisecond = millisecond;
		this.timezone = timezone;
		this.timeReference = timeReference;
		this.locationIndicator = locationIndicator;
		this.iataDesignator = iataDesignator;
		this.name = name;
		this.runwayDirection = runwayDirection;
		this.latitude = latitude;
		this.longitude = longitude;
		this.srsName = srsName;
		this.designator = designator;
		this.zeroBearingType = zeroBearingType;
		this.lenthValue = lenthValue;
		this.uomlenth = uomlenth;
		this.aircraftRegistration = aircraftRegistration;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getTimeReference() {
		return this.timeReference;
	}

	public void setTimeReference(String timeReference) {
		this.timeReference = timeReference;
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

	public String getRunwayDirection() {
		return this.runwayDirection;
	}

	public void setRunwayDirection(String runwayDirection) {
		this.runwayDirection = runwayDirection;
	}

	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getSrsName() {
		return this.srsName;
	}

	public void setSrsName(String srsName) {
		this.srsName = srsName;
	}

	public String getDesignator() {
		return this.designator;
	}

	public void setDesignator(String designator) {
		this.designator = designator;
	}

	public String getZeroBearingType() {
		return this.zeroBearingType;
	}

	public void setZeroBearingType(String zeroBearingType) {
		this.zeroBearingType = zeroBearingType;
	}

	public Double getLenthValue() {
		return this.lenthValue;
	}

	public void setLenthValue(Double lenthValue) {
		this.lenthValue = lenthValue;
	}

	public String getUomlenth() {
		return this.uomlenth;
	}

	public void setUomlenth(String uomlenth) {
		this.uomlenth = uomlenth;
	}

	public String getAircraftRegistration() {
		return this.aircraftRegistration;
	}

	public void setAircraftRegistration(String aircraftRegistration) {
		this.aircraftRegistration = aircraftRegistration;
	}

}