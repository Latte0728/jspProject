<!-- 지시자(디렉티브(directive)) : < % @ -->
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>test1.jsp</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
		<script>
			// 이곳은 자바스크립트 1줄 주석입니다.
			/*
				 이곳은 자바스크립트 여러줄 주석입니다.
			*/
			<%-- 이곳은 JSP 주석입니다.(자바스크립트 영역) --%>
		</script>
		<style>
			/* 이곳은 스타일 시트 (여러줄)주석입니다. */
			<%-- 이곳은 JSP 주석입니다.(자바스크립트 영역) --%>
		</style>
</head>
<body>
<p><br/></p>
<div class="container">
	<h2>오늘의 날짜는?</h2>
	<%
		// new java.util.Date();
		new Date();
	%>
	<p>오늘은 <%=new Date() %> 입니다.</p>
	<% 
		LocalDate currentDate = LocalDate.now();
		LocalDateTime currentTime = LocalDateTime.now();
	%>
	<p>오늘은 <%= currentDate %> 입니다.</p>
	<p>1.현재 날짜/시간은 <%= currentTime %> 입니다.</p>
	<p>2.현재 시간은 <font color="red"><b><%= currentTime.toString().substring(11,19) %></b></font> 입니다.</p>
	<p><input type="button" value="새로고침" onclick="location.reload()" class="btn btn-success" /></p>
</div>
</body>
</html>