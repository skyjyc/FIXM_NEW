package com.fixmnew.bean;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Capability entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.fixmnew.bean.Capability
 * @author MyEclipse Persistence Tools
 */
public class CapabilityDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(CapabilityDAO.class);
	// property constants
	public static final String COMMUNICATION_CAPABILITY_CODE = "communicationCapabilityCode";
	public static final String DATA_LINK_COMMUNICATION_CAPBILITY_CODE = "dataLinkCommunicationCapbilityCode";
	public static final String OTHER_COMMUNICATION_CAPABILITIES = "otherCommunicationCapabilities";
	public static final String OTHER_DATALINK_CAPABILITIES = "otherDatalinkCapabilities";
	public static final String SELECTIVCE_CALLING_CODE = "selectivceCallingCode";
	public static final String SURVEILLANCE_CAPABILITY_CODE = "surveillanceCapabilityCode";
	public static final String COLOUR_CODE = "colourCode";
	public static final String OTHER_SURVEILLANCE_CAPABILITIES = "otherSurveillanceCapabilities";
	public static final String OTHER_COLOUR = "otherColour";
	public static final String DINGHY_COVER_INDICATOR = "dinghyCoverIndicator";
	public static final String NUMBER = "number";
	public static final String TOTAL_CAPABILITY = "totalCapability";
	public static final String EMERGENCY_RADIO_CAPABILITY_TYPE_TYPE = "emergencyRadioCapabilityTypeType";
	public static final String LIFE_JACKET_TYPE = "lifeJacketType";
	public static final String SURVIVAL_EQUIPMENT_TYPE = "survivalEquipmentType";
	public static final String SURVIVAL_EQUIPMENT_REMARKS = "survivalEquipmentRemarks";
	public static final String NAVIGATION_CAPABILITY_CODE = "navigationCapabilityCode";
	public static final String PERFORMANCE_BASED_NAVIGATION_CAPABILITY_CODE = "performanceBasedNavigationCapabilityCode";
	public static final String OTHER_NAVIAGATION_CAPABILITIES = "otherNaviagationCapabilities";
	public static final String STANDARD_CAPABILITIES_INDICATOR = "standardCapabilitiesIndicator";
	public static final String AIRCRAFT_REGISTRATION = "aircraftRegistration";

	public void save(Capability transientInstance) {
		log.debug("saving Capability instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Capability persistentInstance) {
		log.debug("deleting Capability instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Capability findById(java.lang.Integer id) {
		log.debug("getting Capability instance with id: " + id);
		try {
			Capability instance = (Capability) getSession().get("com.fixmnew.bean.Capability", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Capability instance) {
		log.debug("finding Capability instance by example");
		try {
			List results = getSession().createCriteria("com.fixmnew.bean.Capability").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Capability instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Capability as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCommunicationCapabilityCode(Object communicationCapabilityCode) {
		return findByProperty(COMMUNICATION_CAPABILITY_CODE, communicationCapabilityCode);
	}

	public List findByDataLinkCommunicationCapbilityCode(Object dataLinkCommunicationCapbilityCode) {
		return findByProperty(DATA_LINK_COMMUNICATION_CAPBILITY_CODE, dataLinkCommunicationCapbilityCode);
	}

	public List findByOtherCommunicationCapabilities(Object otherCommunicationCapabilities) {
		return findByProperty(OTHER_COMMUNICATION_CAPABILITIES, otherCommunicationCapabilities);
	}

	public List findByOtherDatalinkCapabilities(Object otherDatalinkCapabilities) {
		return findByProperty(OTHER_DATALINK_CAPABILITIES, otherDatalinkCapabilities);
	}

	public List findBySelectivceCallingCode(Object selectivceCallingCode) {
		return findByProperty(SELECTIVCE_CALLING_CODE, selectivceCallingCode);
	}

	public List findBySurveillanceCapabilityCode(Object surveillanceCapabilityCode) {
		return findByProperty(SURVEILLANCE_CAPABILITY_CODE, surveillanceCapabilityCode);
	}

	public List findByColourCode(Object colourCode) {
		return findByProperty(COLOUR_CODE, colourCode);
	}

	public List findByOtherSurveillanceCapabilities(Object otherSurveillanceCapabilities) {
		return findByProperty(OTHER_SURVEILLANCE_CAPABILITIES, otherSurveillanceCapabilities);
	}

	public List findByOtherColour(Object otherColour) {
		return findByProperty(OTHER_COLOUR, otherColour);
	}

	public List findByDinghyCoverIndicator(Object dinghyCoverIndicator) {
		return findByProperty(DINGHY_COVER_INDICATOR, dinghyCoverIndicator);
	}

	public List findByNumber(Object number) {
		return findByProperty(NUMBER, number);
	}

	public List findByTotalCapability(Object totalCapability) {
		return findByProperty(TOTAL_CAPABILITY, totalCapability);
	}

	public List findByEmergencyRadioCapabilityTypeType(Object emergencyRadioCapabilityTypeType) {
		return findByProperty(EMERGENCY_RADIO_CAPABILITY_TYPE_TYPE, emergencyRadioCapabilityTypeType);
	}

	public List findByLifeJacketType(Object lifeJacketType) {
		return findByProperty(LIFE_JACKET_TYPE, lifeJacketType);
	}

	public List findBySurvivalEquipmentType(Object survivalEquipmentType) {
		return findByProperty(SURVIVAL_EQUIPMENT_TYPE, survivalEquipmentType);
	}

	public List findBySurvivalEquipmentRemarks(Object survivalEquipmentRemarks) {
		return findByProperty(SURVIVAL_EQUIPMENT_REMARKS, survivalEquipmentRemarks);
	}

	public List findByNavigationCapabilityCode(Object navigationCapabilityCode) {
		return findByProperty(NAVIGATION_CAPABILITY_CODE, navigationCapabilityCode);
	}

	public List findByPerformanceBasedNavigationCapabilityCode(Object performanceBasedNavigationCapabilityCode) {
		return findByProperty(PERFORMANCE_BASED_NAVIGATION_CAPABILITY_CODE, performanceBasedNavigationCapabilityCode);
	}

	public List findByOtherNaviagationCapabilities(Object otherNaviagationCapabilities) {
		return findByProperty(OTHER_NAVIAGATION_CAPABILITIES, otherNaviagationCapabilities);
	}

	public List findByStandardCapabilitiesIndicator(Object standardCapabilitiesIndicator) {
		return findByProperty(STANDARD_CAPABILITIES_INDICATOR, standardCapabilitiesIndicator);
	}

	public List findByAircraftRegistration(Object aircraftRegistration) {
		return findByProperty(AIRCRAFT_REGISTRATION, aircraftRegistration);
	}

	public List findAll() {
		log.debug("finding all Capability instances");
		try {
			String queryString = "from Capability";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Capability merge(Capability detachedInstance) {
		log.debug("merging Capability instance");
		try {
			Capability result = (Capability) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Capability instance) {
		log.debug("attaching dirty Capability instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Capability instance) {
		log.debug("attaching clean Capability instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}