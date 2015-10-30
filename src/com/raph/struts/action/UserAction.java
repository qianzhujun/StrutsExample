package com.raph.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

/**
 * 展示同一个action匹配不同的URL用法
 * 2015-10-26 15:13:19
 * @author Raphael
 * @version 1.0
 */
public class UserAction extends MappingDispatchAction {
	public ActionForward ListUser(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) 
	        throws Exception {
	 		
			request.setAttribute("display", "List all users");
			
		    return mapping.findForward("success");
		}
	 
		public ActionForward AddUser(ActionMapping mapping,ActionForm form,
				HttpServletRequest request,HttpServletResponse response) 
		        throws Exception {
		 		
				request.setAttribute("display", "Add user");
				
			    return mapping.findForward("success");
		}
		
		public ActionForward EditUser(ActionMapping mapping,ActionForm form,
				HttpServletRequest request,HttpServletResponse response) 
		        throws Exception {
		 		
				request.setAttribute("display", "Edit user");
				
			    return mapping.findForward("success");
		}
		
		public ActionForward DeleteUser(ActionMapping mapping,ActionForm form,
				HttpServletRequest request,HttpServletResponse response) 
		        throws Exception {
		 		
				request.setAttribute("display", "Delete user");
				
			    return mapping.findForward("success");
		}
}
