<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<html:form action="/WebComponentsDisplay">
	<div style="padding:16px">
		<bean:message key="label.common.html.radio.sex" />:<html:radio property="sex" value="male" />
		<bean:message key="label.common.html.radio.sex.male" /><html:radio property="sex" value="female" />
		<bean:message key="label.common.html.radio.sex.female" /> 
	</div>
	<div style="padding:16px">
		<div style="float:left;padding-right:8px;">
			<bean:message key="label.common.html.textarea.address" />:
		</div>
		<html:textarea property="address" cols="50" rows="10" />
	</div>

	<div style="padding:16px">
		<bean:message key="label.common.html.checkbox.name" />:
		<html:checkbox property="checkboxValue" />
	</div>

	<div style="padding:16px">
		<bean:message key="label.common.html.select.year" />
		:
		<html:select property="year">
			<html:option value="">-- None --</html:option>
			<html:option value="1980">1980</html:option>
			<html:option value="1981">1981</html:option>
			<html:option value="1982">1982</html:option>
			<html:option value="1983">1983</html:option>
			<html:option value="1984">1984</html:option>
			<html:option value="1985">1985</html:option>
		</html:select>
	</div>


	<div style="padding:16px">
		<div style="float:left;padding-right:8px;">
			<html:submit>
				<bean:message key="label.common.html.button.submit" />
			</html:submit>
		</div>
		<html:reset>
			<bean:message key="label.common.html.button.reset" />
		</html:reset>
	</div>
</html:form>
</body>
</html>