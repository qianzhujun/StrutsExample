
package com.raph.struts.form;

import org.apache.struts.action.ActionForm;

/**
 * 2015-10-26 11:19:05
 * @author Raphael
 * @version 1.0
 * 
 */
public class HelloWorldForm extends ActionForm {
	String message;
	String time;
	
	

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
