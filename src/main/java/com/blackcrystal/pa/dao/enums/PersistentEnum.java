package com.blackcrystal.pa.dao.enums;

/**
 * 
 * @author j
 *
 * @param <T>
 */
public interface PersistentEnum<T> {
	
	T getValue();
	
	String name();
}
