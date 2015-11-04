/**
 *
 */
package com.raph.struts.action;

import org.apache.struts.action.Action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * @author Raphael
 *
 */
public class ExceptionAction extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) throws Exception {
		//直接抛出异常，看看Struts的处理机制
		throw new IOException();
	
	}

}
