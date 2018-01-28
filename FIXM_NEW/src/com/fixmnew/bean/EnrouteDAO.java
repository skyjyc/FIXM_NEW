package com.fixmnew.bean;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Enroute entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.fixmnew.bean.Enroute
 * @author MyEclipse Persistence Tools
 */
public class EnrouteDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(EnrouteDAO.class);
	// property constants
	public static final String LOCATION_INDICATOR = "locationIndicator";
	public static final String IATA_DESIGNATOR = "iataDesignator";
	public static final String NAME = "name";
	public static final String LATITUDE = "latitude";
	public static final String LONGTITUDE = "longtitude";
	public static final String SRS_NAME = "srsName";
	public static final String ZERO_BEARING_TYPE = "zeroBearingType";
	public static final String LENGTH_VALUE = "lengthValue";
	public static final String DESIGNATOR = "designator";
	public static final String UOM_LENGTH_TYPE = "uomLengthType";
	public static final String BOUNDARY_CROSSING_CONDITION_TYPE = "boundaryCrossingConditionType";
	public static final String UOM_ALTITUDE_TYPE = "uomAltitudeType";
	public static final String UOM_FLIGHT_LEVEL_TYPE = "uomFlightLevelType";
	public static final String SPOINT_LATITUDE = "spointLatitude";
	public static final String SPOINT_LONGTITUDE = "spointLongtitude";
	public static final String SPOINT_SRS_NAME = "spointSrsName";
	public static final String SPOINT_ZERO_BEARING_TYPE = "spointZeroBearingType";
	public static final String SPOINT_LENGTH_VALUE = "spointLengthValue";
	public static final String SPOINT_UOM_LENGTH_VALUE = "spointUomLengthValue";
	public static final String SPOINT_DESIGNATOR = "spointDesignator";
	public static final String YEAR = "year";
	public static final String MONTH = "month";
	public static final String DATE = "date";
	public static final String HOUR = "hour";
	public static final String MINUTE = "minute";
	public static final String SECOND = "second";
	public static final String MILLISECOND = "millisecond";
	public static final String TIMEZONE = "timezone";
	public static final String VALUE = "value";
	public static final String SSR_MODE_TYPE = "ssrModeType";
	public static final String AIRCRAFT_REGISTRATION = "aircraftRegistration";

	public void save(Enroute transientInstance) {
		log.debug("saving Enroute instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Enroute persistentInstance) {
		log.debug("deleting Enroute instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Enroute findById(java.lang.Integer id) {
		log.debug("getting Enroute instance with id: " + id);
		try {
			Enroute instance = (Enroute) getSession().get("com.fixmnew.bean.Enroute", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Enroute instance) {
		log.debug("finding Enroute instance by example");
		try {
			List results = getSession().createCriteria("com.fixmnew.bean.Enroute").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Enroute instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Enroute as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
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

	public List findByDesignator(Object designator) {
		return findByProperty(DESIGNATOR, designator);
	}

	public List findByUomLengthType(Object uomLengthType) {
		return findByProperty(UOM_LENGTH_TYPE, uomLengthType);
	}

	public List findByBoundaryCrossingConditionType(Object boundaryCrossingConditionType) {
		return findByProperty(BOUNDARY_CROSSING_CONDITION_TYPE, boundaryCrossingConditionType);
	}

	public List findByUomAltitudeType(Object uomAltitudeType) {
		return findByProperty(UOM_ALTITUDE_TYPE, uomAltitudeType);
	}

	public List findByUomFlightLevelType(Object uomFlightLevelType) {
		return findByProperty(UOM_FLIGHT_LEVEL_TYPE, uomFlightLevelType);
	}

	public List findBySpointLatitude(Object spointLatitude) {
		return findByProperty(SPOINT_LATITUDE, spointLatitude);
	}

	public List findBySpointLongtitude(Object spointLongtitude) {
		return findByProperty(SPOINT_LONGTITUDE, spointLongtitude);
	}

	public List findBySpointSrsName(Object spointSrsName) {
		return findByProperty(SPOINT_SRS_NAME, spointSrsName);
	}

	public List findBySpointZeroBearingType(Object spointZeroBearingType) {
		return findByProperty(SPOINT_ZERO_BEARING_TYPE, spointZeroBearingType);
	}

	public List findBySpointLengthValue(Object spointLengthValue) {
		return findByProperty(SPOINT_LENGTH_VALUE, spointLengthValue);
	}

	public List findBySpointUomLengthValue(Object spointUomLengthValue) {
		return findByProperty(SPOINT_UOM_LENGTH_VALUE, spointUomLengthValue);
	}

	public List findBySpointDesignator(Object spointDesignator) {
		return findByProperty(SPOINT_DESIGNATOR, spointDesignator);
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

	public List findByValue(Object value) {
		return findByProperty(VALUE, value);
	}

	public List findBySsrModeType(Object ssrModeType) {
		return findByProperty(SSR_MODE_TYPE, ssrModeType);
	}

	public List findByAircraftRegistration(Object aircraftRegistration) {
		return findByProperty(AIRCRAFT_REGISTRATION, aircraftRegistration);
	}

	public List findAll() {
		log.debug("finding all Enroute instances");
		try {
			String queryString = "from Enroute";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Enroute merge(Enroute detachedInstance) {
		log.debug("merging Enroute instance");
		try {
			Enroute result = (Enroute) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Enroute instance) {
		log.debug("attaching dirty Enroute instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Enroute instance) {
		log.debug("attaching clean Enroute instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}