package com.fixmnew.bean;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Departure entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.fixmnew.bean.Departure
 * @author MyEclipse Persistence Tools
 */
public class DepartureDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(DepartureDAO.class);
	// property constants
	public static final String YEAR = "year";
	public static final String MONTH = "month";
	public static final String DATE = "date";
	public static final String HOUR = "hour";
	public static final String MINUTE = "minute";
	public static final String SECOND = "second";
	public static final String MILLISECOND = "millisecond";
	public static final String TIMEZONE = "timezone";
	public static final String LOCATION_INDICATOR = "locationIndicator";
	public static final String IATA_DESIGNATOR = "iataDesignator";
	public static final String NAME = "name";
	public static final String LATITUDE = "latitude";
	public static final String LONGTITUDE = "longtitude";
	public static final String SRS_NAME = "srsName";
	public static final String ZERO_BEARING_TYPE = "zeroBearingType";
	public static final String LENGTH_VALUE = "lengthValue";
	public static final String UOM_LENGTH_TYPE = "uomLengthType";
	public static final String DESIGNATOR = "designator";
	public static final String RUNWAY_DIRECTION_DESIGNATOR = "runwayDirectionDesignator";
	public static final String ESTIMATE_YEAR = "estimateYear";
	public static final String ESTIMATE_MONTH = "estimateMonth";
	public static final String ESTIMATE_DATE = "estimateDate";
	public static final String ESTIMATE_HOUR = "estimateHour";
	public static final String ESTIMATE_MINUTE = "estimateMinute";
	public static final String ESTIMATE_SECOND = "estimateSecond";
	public static final String ESTIMATE_MILLISECOND = "estimateMillisecond";
	public static final String ESTIMATE_TIMEZONE = "estimateTimezone";
	public static final String ALTERNATE_LOCATION_INDICATOR = "alternateLocationIndicator";
	public static final String ALTERNATE_IATA_DESIGNATOR = "alternateIataDesignator";
	public static final String ALTERNATE_NAME = "alternateName";
	public static final String ALTERNATE_LATITUDE = "alternateLatitude";
	public static final String ALTERNATE_LONGTITUE = "alternateLongtitue";
	public static final String ALTERNATE_SRS_NAME = "alternateSrsName";
	public static final String ALTERNATE_ZERO_BEARING_TYPE = "alternateZeroBearingType";
	public static final String ALTERNATE_LENGTH_VALUE = "alternateLengthValue";
	public static final String ALTERNATE_UOM_LENGTH_TYPE = "alternateUomLengthType";
	public static final String ALTERNATE_DESIGNATOR = "alternateDesignator";
	public static final String AIRCRAFT_REGISTRATION = "aircraftRegistration";

	public void save(Departure transientInstance) {
		log.debug("saving Departure instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Departure persistentInstance) {
		log.debug("deleting Departure instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Departure findById(java.lang.Integer id) {
		log.debug("getting Departure instance with id: " + id);
		try {
			Departure instance = (Departure) getSession().get("com.fixmnew.bean.Departure", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Departure instance) {
		log.debug("finding Departure instance by example");
		try {
			List results = getSession().createCriteria("com.fixmnew.bean.Departure").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Departure instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Departure as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByYear(Object year) {
		return findByProperty(YEAR, year);
	}

	public List findByMonth(Object month) {
		return findByProperty(MONTH, month);
	}

	public List findByDate(Object date) {
		return findByProperty(DATE, date);
	}

	public List findByHour(Object hour) {
		return findByProperty(HOUR, hour);
	}

	public List findByMinute(Object minute) {
		return findByProperty(MINUTE, minute);
	}

	public List findBySecond(Object second) {
		return findByProperty(SECOND, second);
	}

	public List findByMillisecond(Object millisecond) {
		return findByProperty(MILLISECOND, millisecond);
	}

	public List findByTimezone(Object timezone) {
		return findByProperty(TIMEZONE, timezone);
	}

	public List findByLocationIndicator(Object locationIndicator) {
		return findByProperty(LOCATION_INDICATOR, locationIndicator);
	}

	public List findByIataDesignator(Object iataDesignator) {
		return findByProperty(IATA_DESIGNATOR, iataDesignator);
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByLatitude(Object latitude) {
		return findByProperty(LATITUDE, latitude);
	}

	public List findByLongtitude(Object longtitude) {
		return findByProperty(LONGTITUDE, longtitude);
	}

	public List findBySrsName(Object srsName) {
		return findByProperty(SRS_NAME, srsName);
	}

	public List findByZeroBearingType(Object zeroBearingType) {
		return findByProperty(ZERO_BEARING_TYPE, zeroBearingType);
	}

	public List findByLengthValue(Object lengthValue) {
		return findByProperty(LENGTH_VALUE, lengthValue);
	}

	public List findByUomLengthType(Object uomLengthType) {
		return findByProperty(UOM_LENGTH_TYPE, uomLengthType);
	}

	public List findByDesignator(Object designator) {
		return findByProperty(DESIGNATOR, designator);
	}

	public List findByRunwayDirectionDesignator(Object runwayDirectionDesignator) {
		return findByProperty(RUNWAY_DIRECTION_DESIGNATOR, runwayDirectionDesignator);
	}

	public List findByEstimateYear(Object estimateYear) {
		return findByProperty(ESTIMATE_YEAR, estimateYear);
	}

	public List findByEstimateMonth(Object estimateMonth) {
		return findByProperty(ESTIMATE_MONTH, estimateMonth);
	}

	public List findByEstimateDate(Object estimateDate) {
		return findByProperty(ESTIMATE_DATE, estimateDate);
	}

	public List findByEstimateHour(Object estimateHour) {
		return findByProperty(ESTIMATE_HOUR, estimateHour);
	}

	public List findByEstimateMinute(Object estimateMinute) {
		return findByProperty(ESTIMATE_MINUTE, estimateMinute);
	}

	public List findByEstimateSecond(Object estimateSecond) {
		return findByProperty(ESTIMATE_SECOND, estimateSecond);
	}

	public List findByEstimateMillisecond(Object estimateMillisecond) {
		return findByProperty(ESTIMATE_MILLISECOND, estimateMillisecond);
	}

	public List findByEstimateTimezone(Object estimateTimezone) {
		return findByProperty(ESTIMATE_TIMEZONE, estimateTimezone);
	}

	public List findByAlternateLocationIndicator(Object alternateLocationIndicator) {
		return findByProperty(ALTERNATE_LOCATION_INDICATOR, alternateLocationIndicator);
	}

	public List findByAlternateIataDesignator(Object alternateIataDesignator) {
		return findByProperty(ALTERNATE_IATA_DESIGNATOR, alternateIataDesignator);
	}

	public List findByAlternateName(Object alternateName) {
		return findByProperty(ALTERNATE_NAME, alternateName);
	}

	public List findByAlternateLatitude(Object alternateLatitude) {
		return findByProperty(ALTERNATE_LATITUDE, alternateLatitude);
	}

	public List findByAlternateLongtitue(Object alternateLongtitue) {
		return findByProperty(ALTERNATE_LONGTITUE, alternateLongtitue);
	}

	public List findByAlternateSrsName(Object alternateSrsName) {
		return findByProperty(ALTERNATE_SRS_NAME, alternateSrsName);
	}

	public List findByAlternateZeroBearingType(Object alternateZeroBearingType) {
		return findByProperty(ALTERNATE_ZERO_BEARING_TYPE, alternateZeroBearingType);
	}

	public List findByAlternateLengthValue(Object alternateLengthValue) {
		return findByProperty(ALTERNATE_LENGTH_VALUE, alternateLengthValue);
	}

	public List findByAlternateUomLengthType(Object alternateUomLengthType) {
		return findByProperty(ALTERNATE_UOM_LENGTH_TYPE, alternateUomLengthType);
	}

	public List findByAlternateDesignator(Object alternateDesignator) {
		return findByProperty(ALTERNATE_DESIGNATOR, alternateDesignator);
	}

	public List findByAircraftRegistration(Object aircraftRegistration) {
		return findByProperty(AIRCRAFT_REGISTRATION, aircraftRegistration);
	}

	public List findAll() {
		log.debug("finding all Departure instances");
		try {
			String queryString = "from Departure";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Departure merge(Departure detachedInstance) {
		log.debug("merging Departure instance");
		try {
			Departure result = (Departure) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Departure instance) {
		log.debug("attaching dirty Departure instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Departure instance) {
		log.debug("attaching clean Departure instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}