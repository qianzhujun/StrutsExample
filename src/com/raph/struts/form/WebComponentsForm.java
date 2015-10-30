package com.raph.struts.form;

import org.apache.struts.action.ActionForm;

public class WebComponentsForm extends ActionForm {
	
	private String sex;
	private String address;
	private String checkboxValue;
	private String year;
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCheckboxValue() {
		return checkboxValue;
	}
	public void setCheckboxValue(String checkboxValue) {
		this.checkboxValue = checkboxValue;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	
	

}
