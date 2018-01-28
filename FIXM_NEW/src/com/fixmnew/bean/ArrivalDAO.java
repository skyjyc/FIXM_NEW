package com.fixmnew.bean;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Arrival entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.fixmnew.bean.Arrival
 * @author MyEclipse Persistence Tools
 */
public class ArrivalDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ArrivalDAO.class);
	// property constants
	public static final String YEAR = "year";
	public static final String MONTH = "month";
	public static final String DATE = "date";
	public static final String HOUR = "hour";
	public static final String MINUTE = "minute";
	public static final String SECOND = "second";
	public static final String MILLISECOND = "millisecond";
	public static final String TIMEZONE = "timezone";
	public static final String TIME_REFERENCE = "timeReference";
	public static final String LOCATION_INDICATOR = "locationIndicator";
	public static final String IATA_DESIGNATOR = "iataDesignator";
	public static final String NAME = "name";
	public static final String RUNWAY_DIRECTION = "runwayDirection";
	public static final String LATITUDE = "latitude";
	public static final String LONGITUDE = "longitude";
	public static final String SRS_NAME = "srsName";
	public static final String DESIGNATOR = "designator";
	public static final String ZERO_BEARING_TYPE = "zeroBearingType";
	public static final String LENTH_VALUE = "lenthValue";
	public static final String UOMLENTH = "uomlenth";
	public static final String AIRCRAFT_REGISTRATION = "aircraftRegistration";

	public void save(Arrival transientInstance) {
		log.debug("saving Arrival instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Arrival persistentInstance) {
		log.debug("deleting Arrival instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Arrival findById(java.lang.Integer id) {
		log.debug("getting Arrival instance with id: " + id);
		try {
			Arrival instance = (Arrival) getSession().get("com.fixmnew.bean.Arrival", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Arrival instance) {
		log.debug("finding Arrival instance by example");
		try {
			List results = getSession().createCriteria("com.fixmnew.bean.Arrival").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Arrival instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Arrival as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			System.out.println(queryObject.toString());
			/*List list=queryObject.list();
			for(Object o:list){
				System.out.println(o.toString());
			}*/
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

	public List findByTimeReference(Object timeReference) {
		return findByProperty(TIME_REFERENCE, timeReference);
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

	public List findByRunwayDirection(Object runwayDirection) {
		return findByProperty(RUNWAY_DIRECTION, runwayDirection);
	}

	public List findByLatitude(Object latitude) {
		return findByProperty(LATITUDE, latitude);
	}

	public List findByLongitude(Object longitude) {
		return findByProperty(LONGITUDE, longitude);
	}

	public List findBySrsName(Object srsName) {
		return findByProperty(SRS_NAME, srsName);
	}

	public List findByDesignator(Object designator) {
		return findByProperty(DESIGNATOR, designator);
	}

	public List findByZeroBearingType(Object zeroBearingType) {
		return findByProperty(ZERO_BEARING_TYPE, zeroBearingType);
	}

	public List findByLenthValue(Object lenthValue) {
		return findByProperty(LENTH_VALUE, lenthValue);
	}

	public List findByUomlenth(Object uomlenth) {
		return findByProperty(UOMLENTH, uomlenth);
	}

	public List findByAircraftRegistration(Object aircraftRegistration) {
		return findByProperty(AIRCRAFT_REGISTRATION, aircraftRegistration);
	}

	public List findAll() {
		log.debug("finding all Arrival instances");
		try {
			String queryString = "from Arrival";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Arrival merge(Arrival detachedInstance) {
		log.debug("merging Arrival instance");
		try {
			Arrival result = (Arrival) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Arrival instance) {
		log.debug("attaching dirty Arrival instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Arrival instance) {
		log.debug("attaching clean Arrival instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}