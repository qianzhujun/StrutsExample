/**
 *
 */
package com.raph.struts.Exception;

import org.apache.struts.action.ExceptionHandler;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.config.ExceptionConfig;
 
/**
 * @author Raphael
 *
 */
public class MyCustomExceptionHandler extends ExceptionHandler {
	@Override
	public ActionForward execute(Exception ex, ExceptionConfig ae,
			ActionMapping mapping, ActionForm formInstance,
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException {
		
		System.out.println("com.raph.struts.Exception.MyCustomExceptionHandler：进入自定义ExceptionHandler");
		return super.execute(ex, ae, mapping, formInstance, request, response);
	}
}
