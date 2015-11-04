/**
 *
 */
package com.raph.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 * @author Raphael
 *
 */
public class MessageForm extends ActionForm {
	String email; 

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping,
	HttpServletRequest request) {
 
		//故意校验不通过，让页面显示message
	   ActionErrors errors = new ActionErrors();
 	  
	   errors.add("common.email.err",
		new ActionMessage("error.common.email.required"));
	  
	   return errors;
	  
	}
}
