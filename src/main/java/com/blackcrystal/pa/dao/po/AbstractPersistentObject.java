package com.blackcrystal.pa.dao.po;

import javax.persistence.MappedSuperclass;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@MappedSuperclass
public class AbstractPersistentObject implements PersistentObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1718018472495252425L;

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,
				ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
