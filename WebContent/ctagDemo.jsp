<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/MyCustomTag.tld" prefix="wave" %>
<%
	com.wavelabs.entity.Employee e = new com.wavelabs.entity.Employee(101,"Kasi Reddy Sangana",199000,20);
	request.setAttribute("e",e);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align:center;color:magenta">
		<wave:Wish message="This is an Attribute Demo"/>
	</h1> 
	<h2 style="text-align:center;color:magenta">
		<wave:Kasi/>
	</h2>
	<h2 style="text-align:center;color:magenta">
		<wave:displayEmployee emp="${e}"/>
	</h2>
	<hr>
	
	<wave:Wish1 mycolor="blue" myfont="ariel" mysize="10" repeatFor="3">
		This is my Non-Empty Body Tag
	</wave:Wish1>
	
</body>
</html>