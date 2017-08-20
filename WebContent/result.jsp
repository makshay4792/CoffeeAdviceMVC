<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function goToHome(){
		alert("Hello there!");
		window.location="/HeadFirstMVCTwo/Form.html";
	}
</script>
</head>
<body>
	<h1 align="center">Beer Recomendations JSP</h1>
	
	<p align="center">
	<%
		List styles = (List) request.getAttribute("styles");
		Iterator it=styles.iterator();
		while(it.hasNext()){
			out.print("<br>you should try:"+it.next());
		}
	%>
	<br>
	<button name="Home" type="button" onclick="goToHome()">Home</button>
</body>
</html>