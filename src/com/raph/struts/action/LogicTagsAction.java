/**
 *
 */
package com.raph.struts.action;

import org.apache.struts.action.Action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.raph.struts.pojo.User;

/**
 * @author Raphael
 *
 */
public class LogicTagsAction extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) 
	        throws Exception {
	 
		//下面展示了如何在页面上获取request里的集合属性值
		// you can use <logic:iterate> tag to iterate over collections
			List<String> listMsg = new ArrayList<String>();
			listMsg.add("Message A");
			listMsg.add("Message B");
			listMsg.add("Message C");
			listMsg.add("Message D");
			request.setAttribute("listMsg", listMsg);
			
			List<User> listUsers = new ArrayList<User>();
			for(int i=0;i<4;i++){
				User user=new User();
				user.setUrl("http://www.user"+i+".com");
				user.setUsername("user"+i);
				listUsers.add(user);
			}
			request.setAttribute("listUsers", listUsers);
			
			
		//end 	
			
		//下面展示了如何在页面上判断是否为空值
		// <logic:empty> is execute only if the specified property is null, zero-length String or doesn’t exists
			List<String> listMsgWithValues = new ArrayList<String>();
			listMsgWithValues.add("Value A");
			listMsgWithValues.add("Value B");
			listMsgWithValues.add("Value C");
			listMsgWithValues.add("Value D");
			
			request.setAttribute("listMsg1", listMsgWithValues);
			
			//no value inside
			List<String> listMsgWithoutValues = new ArrayList<String>();
			request.setAttribute("listMsg2", listMsgWithoutValues);
			
			return mapping.findForward("success");
			
			
		}
}
