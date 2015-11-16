<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html"; charset=UTF-8">
		<title>JSP Page</title>
	</head>
	<body>
		<h1>Welcome to my Home !</h1>
		<br/>
		<div id="content">
			<jsp:include page="/sucesso.html"></jsp:include>
		</div>
		<div id="footer">
			<% out.print ("This is my Footer!!!"+"<br/>" + new Date()); %>
			1+1 = {1+1}
		</div>
	</body>
</html>
