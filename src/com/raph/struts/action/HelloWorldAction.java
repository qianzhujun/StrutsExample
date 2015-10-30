package com.raph.struts.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.raph.struts.form.HelloWorldForm;

/**
 * 
 * 2015-10-26 
 * @author Raphael
 * @version 1.0
 */
public class HelloWorldAction extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		HelloWorldForm helloWorldForm = (HelloWorldForm) form;
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sdf=new SimpleDateFormat("z yyyy-MM-dd HH:mm:ss");
		helloWorldForm.setMessage("Hello World! Struts");
		helloWorldForm.setTime(sdf.format(cal.getTime()));
		
		return mapping.findForward("success");
	}
}
