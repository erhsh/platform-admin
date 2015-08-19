package com.blackcrystal.pa.vo;

public class TestVO {
	private String id;
	private String name;
	private String desc;

	public TestVO() {
	}

	public TestVO(String id) {
		this.id = id;
		this.name = "name_" + id;
		this.desc = "desc_" + id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "TestVO [id=" + id + ", name=" + name + ", desc=" + desc + "]";
	}

}
