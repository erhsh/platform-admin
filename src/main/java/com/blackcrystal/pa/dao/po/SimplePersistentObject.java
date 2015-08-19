package com.blackcrystal.pa.dao.po;

import java.math.BigDecimal;
import java.util.Date;

public interface SimplePersistentObject extends PersistentObject {

	/**
	 * active
	 */
	BigDecimal getActiveFlag();

	void setActiveFlag(BigDecimal activeFlag);

	/**
	 * input date
	 */
	Date getInputDate();

	void setInputDate(Date date);

	/**
	 * update date
	 */
	Date getUpdateDate();

	void setUpdateDate(Date date);

}
