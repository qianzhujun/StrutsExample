/**
 *
 */
package com.raph.struts.action;

import org.apache.struts.actions.MappingDispatchAction;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
/**
 * 展示MappingDispatchAction根据不同配置调用不同方法
 * 2015-10-26 16:19:54
 * @author Raphael
 * @version 1.0 
 */
public class MyCustomDispatchAction extends MappingDispatchAction {
	public ActionForward generateXML(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) 
	        throws Exception {
	 		
			request.setAttribute("method", "generateXML is called");
			
		    return mapping.findForward("success");
		}
	 
		public ActionForward generateExcel(ActionMapping mapping,ActionForm form,
				HttpServletRequest request,HttpServletResponse response) 
		        throws Exception {
		 		
				request.setAttribute("method", "generateExcel is called");
				
			    return mapping.findForward("success");
		}
}
