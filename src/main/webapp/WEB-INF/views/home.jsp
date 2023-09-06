<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<div id="map" style="width:100%;height:400px;"></div>

<!-- <a href="/guest/getList?currentPage=1">방명록가기</a>  -->
<a href="./Login/createID">회원가입</a>

id:${id} , pw:${pw}
</body>
</html>
