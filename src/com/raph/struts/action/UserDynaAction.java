/**
 *
 */
package com.raph.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.action.DynaActionForm;

/**
 * 展示动态form的用法
 * 2015-10-26 16:49:34
 * @author Raphael
 * @version 1.0
 */
public class UserDynaAction extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) 
	        throws Exception {
	 
			DynaActionForm userForm = (DynaActionForm)form;
			
			ActionMessages errors = new ActionMessages();

			//do the form validation in action class
		    if( userForm.get("username") == null || ("".equals(userForm.get("username")))) {
		       errors.add("common.name.err",
	             new ActionMessage("error.common.name.required"));
		    }
	 
		    saveErrors(request,errors);
		    
		    if(errors.isEmpty()){
		        return mapping.findForward("success");
		    }else{
		        return mapping.findForward("failed");
		    }
		   
		}
}
