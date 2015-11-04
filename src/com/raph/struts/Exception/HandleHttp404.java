/**
 *
 */
package com.raph.struts.Exception;


import org.apache.struts.action.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * @author Raphael
 *
 */
public class HandleHttp404 extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) throws Exception {
			request.setAttribute("reason", "Sorry.   The URL "+ request.getAttribute("javax.servlet.forward.request_uri") +" is no mapping.");
		 return mapping.findForward("success");
	
	}
}
