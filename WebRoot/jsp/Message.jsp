<%@ page language="java" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
</head>
<body>

If there is any error messages or messages exists under key “Globals.ERROR_KEY” or “Globals.MESSAGE_KEY”, the body of the tag will be execute.
<br>
<logic:messagesPresent>
	There are errors on this page!
</logic:messagesPresent>
<logic:messagesNotPresent>
	There are no errors on this page!
</logic:messagesNotPresent>

<br/><br/>

If there is any error messages or messages named “common.email.err” exists under key “Globals.ERROR_KEY”, the body of the tag will be execute.
<br>
<logic:messagesPresent property="common.email.err">
	Email address has  messages! Globals.ERROR_KEY
</logic:messagesPresent>
<logic:messagesNotPresent property="common.email.err">
	Email address has no  messages! - Globals.ERROR_KEY
</logic:messagesNotPresent>

<br/><br/>

If there is any error messages or messages named “common.email.err” exists under key “Globals.MESSAGE_KEY”, the body of the tag will be execute.
<br>
<logic:messagesPresent property="common.email.err" message="true">
	Email address has  messages! - Globals.MESSAGE_KEY
</logic:messagesPresent>
<logic:messagesNotPresent property="common.email.err" message="true">
	Email address has no  messages! - Globals.MESSAGE_KEY
</logic:messagesNotPresent>

<br/><br/>

</body>
</html>