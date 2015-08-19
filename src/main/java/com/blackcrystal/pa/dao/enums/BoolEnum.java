package com.blackcrystal.pa.dao.enums;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author j
 * 
 */
public enum BoolEnum implements PersistentEnum<Integer> {

	NO(0) // 否
	, YES(1) // 是
	;

	private final Integer value;

	private BoolEnum(int value) {
		this.value = value;
	}

	public static BoolEnum getEnum(Number value) {
		if (value == null)
			return null;
		return PersistentEnums.parse(BoolEnum.class, value.intValue());
	}

	public static BoolEnum getEnum(Integer value) {
		if (value == null)
			return null;
		return PersistentEnums.parse(BoolEnum.class, value.intValue());
	}

	public Integer getValue() {
		return value;
	}

	public static BoolEnum getEnum(String name) {
		return BoolEnum.valueOf(name);
	}

	public String getName() {
		return name();
	}

	public static List<BoolEnum> getEnumList() {
		List<BoolEnum> r = new ArrayList<BoolEnum>();
		for (BoolEnum e : BoolEnum.values()) {
			r.add(e);
		}
		return r;
	}

	public static BigDecimal active() {
		return BigDecimal.valueOf(YES.getValue());
	}

}
