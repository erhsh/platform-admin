package com.blackcrystal.pa.dao.enums;

import com.blackcrystal.pa.utils.ObjectUtils;


/**
 * 
 * @author j
 *
 */
public final class PersistentEnums {
	
	/**
	 * 
	 * @param <K>
	 * @param <T>
	 * @param clazz
	 * @param value
	 * @return
	 */
	public static <T extends Enum<T> & PersistentEnum<V>, V> T parse(Class<T> clazz, V value) {
		for(T t : clazz.getEnumConstants()) {
			if(ObjectUtils.isEquals(t.getValue(), value)) {
				return t;
			}
		}
		return null;
	}
}
