package com.sample.model;

public class Model {
	private String code;
	private String name;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Model [code=" + code + ", name=" + name + "]";
	}
	public Model() {
		super();
	}
}
