<%@ page language="java" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<html>
<head>
</head>
<body>
 <h2>下面展示怎么在request里获取集合的值</h2> 
 <!-- name 里的值就是request的属性值 -->
<logic:iterate name="listMsg" id="listMsgId">
	<p>
	List Messages <bean:write name="listMsgId"/>
	</p>
</logic:iterate>


<logic:iterate name="listUsers" id="listUserId">
	<p>
	List Users <bean:write name="listUserId" property="username"/> , 
	<bean:write name="listUserId" property="url"/>
	</p>
</logic:iterate>
 
 
 <h2>下面展示怎么判断空值</h2> 
 <logic:empty name="listMsg1">
	<h3>listMsg1 is empty</h3>
</logic:empty>
<logic:empty name="listMsg2">
	<h3>listMsg2 is empty</h3>
</logic:empty>

<logic:notEmpty name="listMsg1">
	<h3>listMsg1 is not empty</h3>
	<logic:iterate name="listMsg1" id="listMsgId">
		<p>
		List Messages 1 - <bean:write name="listMsgId"/>
		</p>
	</logic:iterate>
</logic:notEmpty>

<logic:notEmpty name="listMsg2">
	<h3>listMsg2 is not empty</h3>
	<logic:iterate name="listMsg2" id="listMsgId">
		<p>
		List Messages 2 - <bean:write name="listMsgId"/>
		</p>
	</logic:iterate>
</logic:notEmpty>
 
  <h2>下面展示怎么判断相等</h2> 
 <logic:iterate name="listUsers" id="listUserId">
 	<logic:equal name="listUserId" property="url" value="http://www.user2.com">	
		<p>
		<bean:write name="listUserId" property="username"/>'s url is equal to 
		<bean:write name="listUserId" property="url"/>
		</p>
	</logic:equal>
	<logic:notEqual name="listUserId" property="url" value="http://www.user2.com">
		<p>
		<bean:write name="listUserId" property="username"/>'s url is not equal to 
		<bean:write name="listUserId" property="url"/>
		</p>
	</logic:notEqual>
</logic:iterate> 
  
 
</body>
</html>