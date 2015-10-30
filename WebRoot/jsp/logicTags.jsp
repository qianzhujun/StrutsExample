<%@ page language="java" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<html>
<head>
</head>
<body>
 下面展示怎么在request里获取集合的值 
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
 
</body>
</html>