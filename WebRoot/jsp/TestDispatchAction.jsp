<%@ page language="java" pageEncoding="utf-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<html>
<head>
</head>
<body>

<h2>Struts - DispatchAction Example</h2>

<h4>html:link</h4>
<p>
   <html:link action="/CustomDispatchActionXML" >
           Generate XML File
   </html:link>
   |
   <html:link action="/CustomDispatchActionExcel" >
           Generate Excel File
   </html:link>
</p> 

<h4>a href</h4>
<p>
   <a href="CustomDispatchActionXML.do">
           Generate XML File
   </a>
   |
   <a href="CustomDispatchActionExcel.do" >
           Generate Excel File
   </a>
</p> 

</body>
</html>