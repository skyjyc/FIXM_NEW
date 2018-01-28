package com.fixmnew.bean;

/**
 * Departure entity. @author MyEclipse Persistence Tools
 */

public class Departure implements java.io.Serializable {

	// Fields

	private Integer iddeparture;
	private Integer year;
	private Integer month;
	private Integer date;
	private Integer hour;
	private Integer minute;
	private Integer second;
	private Integer millisecond;
	private Integer timezone;
	private String locationIndicator;
	private String iataDesignator;
	private String name;
	private Double latitude;
	private Double longtitude;
	private String srsName;
	private String zeroBearingType;
	private Double lengthValue;
	private String uomLengthType;
	private String designator;
	private String runwayDirectionDesignator;
	private Integer estimateYear;
	private Integer estimateMonth;
	private Integer estimateDate;
	private Integer estimateHour;
	private Integer estimateMinute;
	private Integer estimateSecond;
	private Integer estimateMillisecond;
	private Integer estimateTimezone;
	private String alternateLocationIndicator;
	private String alternateIataDesignator;
	private String alternateName;
	private Double alternateLatitude;
	private Double alternateLongtitue;
	private String alternateSrsName;
	private String alternateZeroBearingType;
	private Double alternateLengthValue;
	private String alternateUomLengthType;
	private String alternateDesignator;
	private String aircraftRegistration;

	// Constructors

	/** default constructor */
	public Departure() {
	}

	/** full constructor */
	public Departure(Integer year, Integer month, Integer date, Integer hour, Integer minute, Integer second,
			Integer millisecond, Integer timezone, String locationIndicator, String iataDesignator, String name,
			Double latitude, Double longtitude, String srsName, String zeroBearingType, Double lengthValue,
			String uomLengthType, String designator, String runwayDirectionDesignator, Integer estimateYear,
			Integer estimateMonth, Integer estimateDate, Integer estimateHour, Integer estimateMinute,
			Integer estimateSecond, Integer estimateMillisecond, Integer estimateTimezone,
			String alternateLocationIndicator, String alternateIataDesignator, String alternateName,
			Double alternateLatitude, Double alternateLongtitue, String alternateSrsName,
			String alternateZeroBearingType, Double alternateLengthValue, String alternateUomLengthType,
			String alternateDesignator, String aircraftRegistration) {
		this.year = year;
		this.month = month;
		this.date = date;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.millisecond = millisecond;
		this.timezone = timezone;
		this.locationIndicator = locationIndicator;
		this.iataDesignator = iataDesignator;
		this.name = name;
		this.latitude = latitude;
		this.longtitude = longtitude;
		this.srsName = srsName;
		this.zeroBearingType = zeroBearingType;
		this.lengthValue = lengthValue;
		this.uomLengthType = uomLengthType;
		this.designator = designator;
		this.runwayDirectionDesignator = runwayDirectionDesignator;
		this.estimateYear = estimateYear;
		this.estimateMonth = estimateMonth;
		this.estimateDate = estimateDate;
		this.estimateHour = estimateHour;
		this.estimateMinute = estimateMinute;
		this.estimateSecond = estimateSecond;
		this.estimateMillisecond = estimateMillisecond;
		this.estimateTimezone = estimateTimezone;
		this.alternateLocationIndicator = alternateLocationIndicator;
		this.alternateIataDesignator = alternateIataDesignator;
		this.alternateName = alternateName;
		this.alternateLatitude = alternateLatitude;
		this.alternateLongtitue = alternateLongtitue;
		this.alternateSrsName = alternateSrsName;
		this.alternateZeroBearingType = alternateZeroBearingType;
		this.alternateLengthValue = alternateLengthValue;
		this.alternateUomLengthType = alternateUomLengthType;
		this.alternateDesignator = alternateDesignator;
		this.aircraftRegistration = aircraftRegistration;
	}

	// Property accessors

	public Integer getIddeparture() {
		return this.iddeparture;
	}

	public void setIddeparture(Integer iddeparture) {
		this.iddeparture = iddeparture;
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

	public String getUomLengthType() {
		return this.uomLengthType;
	}

	public void setUomLengthType(String uomLengthType) {
		this.uomLengthType = uomLengthType;
	}

	public String getDesignator() {
		return this.designator;
	}

	public void setDesignator(String designator) {
		this.designator = designator;
	}

	public String getRunwayDirectionDesignator() {
		return this.runwayDirectionDesignator;
	}

	public void setRunwayDirectionDesignator(String runwayDirectionDesignator) {
		this.runwayDirectionDesignator = runwayDirectionDesignator;
	}

	public Integer getEstimateYear() {
		return this.estimateYear;
	}

	public void setEstimateYear(Integer estimateYear) {
		this.estimateYear = estimateYear;
	}

	public Integer getEstimateMonth() {
		return this.estimateMonth;
	}

	public void setEstimateMonth(Integer estimateMonth) {
		this.estimateMonth = estimateMonth;
	}

	public Integer getEstimateDate() {
		return this.estimateDate;
	}

	public void setEstimateDate(Integer estimateDate) {
		this.estimateDate = estimateDate;
	}

	public Integer getEstimateHour() {
		return this.estimateHour;
	}

	public void setEstimateHour(Integer estimateHour) {
		this.estimateHour = estimateHour;
	}

	public Integer getEstimateMinute() {
		return this.estimateMinute;
	}

	public void setEstimateMinute(Integer estimateMinute) {
		this.estimateMinute = estimateMinute;
	}

	public Integer getEstimateSecond() {
		return this.estimateSecond;
	}

	public void setEstimateSecond(Integer estimateSecond) {
		this.estimateSecond = estimateSecond;
	}

	public Integer getEstimateMillisecond() {
		return this.estimateMillisecond;
	}

	public void setEstimateMillisecond(Integer estimateMillisecond) {
		this.estimateMillisecond = estimateMillisecond;
	}

	public Integer getEstimateTimezone() {
		return this.estimateTimezone;
	}

	public void setEstimateTimezone(Integer estimateTimezone) {
		this.estimateTimezone = estimateTimezone;
	}

	public String getAlternateLocationIndicator() {
		return this.alternateLocationIndicator;
	}

	public void setAlternateLocationIndicator(String alternateLocationIndicator) {
		this.alternateLocationIndicator = alternateLocationIndicator;
	}

	public String getAlternateIataDesignator() {
		return this.alternateIataDesignator;
	}

	public void setAlternateIataDesignator(String alternateIataDesignator) {
		this.alternateIataDesignator = alternateIataDesignator;
	}

	public String getAlternateName() {
		return this.alternateName;
	}

	public void setAlternateName(String alternateName) {
		this.alternateName = alternateName;
	}

	public Double getAlternateLatitude() {
		return this.alternateLatitude;
	}

	public void setAlternateLatitude(Double alternateLatitude) {
		this.alternateLatitude = alternateLatitude;
	}

	public Double getAlternateLongtitue() {
		return this.alternateLongtitue;
	}

	public void setAlternateLongtitue(Double alternateLongtitue) {
		this.alternateLongtitue = alternateLongtitue;
	}

	public String getAlternateSrsName() {
		return this.alternateSrsName;
	}

	public void setAlternateSrsName(String alternateSrsName) {
		this.alternateSrsName = alternateSrsName;
	}

	public String getAlternateZeroBearingType() {
		return this.alternateZeroBearingType;
	}

	public void setAlternateZeroBearingType(String alternateZeroBearingType) {
		this.alternateZeroBearingType = alternateZeroBearingType;
	}

	public Double getAlternateLengthValue() {
		return this.alternateLengthValue;
	}

	public void setAlternateLengthValue(Double alternateLengthValue) {
		this.alternateLengthValue = alternateLengthValue;
	}

	public String getAlternateUomLengthType() {
		return this.alternateUomLengthType;
	}

	public void setAlternateUomLengthType(String alternateUomLengthType) {
		this.alternateUomLengthType = alternateUomLengthType;
	}

	public String getAlternateDesignator() {
		return this.alternateDesignator;
	}

	public void setAlternateDesignator(String alternateDesignator) {
		this.alternateDesignator = alternateDesignator;
	}

	public String getAircraftRegistration() {
		return this.aircraftRegistration;
	}

	public void setAircraftRegistration(String aircraftRegistration) {
		this.aircraftRegistration = aircraftRegistration;
	}

}