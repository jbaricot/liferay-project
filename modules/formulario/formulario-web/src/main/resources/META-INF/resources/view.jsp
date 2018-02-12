<%@ include file="/init.jsp" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Form Liferay</title>
</head>
<body>
	
	<portlet:actionURL name="vizualizar" var="vizualizarURL" />
  <font size="5">Agrega dos numeros para tu SUMA:</font><br />
  <br />  
	<aui:form action="${vizualizarURL}">
		<aui:input type="textarea" name="numero1" />
		<aui:input type="textarea" name="numero2" />
		<aui:button name="enviar" type="submit" value="Enviar" />
		<aui:button type="submit" value="refrescar" onclick="javascript:window.location.reload();"/>
		
	</aui:form>	
	<br />
	
	<jsp:useBean id="variable" type="java.lang.String" scope="request" /> 
	<%= request.getAttribute("variable") %>
	<br />
	<br />
	<%= request.getAttribute("variable2") %>
			
	
</body>
</html>