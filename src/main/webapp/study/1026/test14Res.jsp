<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- <%
	 String name = request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));
	String gender = request.getParameter("gender");
	String hobby = request.getParameter("hobby");
	String job = request.getParameter("job"); 
%> 이 부분에서 500 에러 이유 : 숫자형 데이터 자료가 null이 아니라서--%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>test14Res.jsp</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
  <script>
    'use strict';
    
 		alert("'${vo.name}'님 회원가입 성공!!");  
    
    <%-- function logoutCheck() {
    	let ans = confirm("로그아웃 하시겠습니까?");
    	if(ans) {
    		alert('${vo.name}' + "님 로그아웃 되셨습니다.");
    		location.href = '<%=request.getContextPath() %>/study/1026/test13.jsp';
    	}
    } --%>
  </script>
</head>
<body>
<p><br/></p>
<div class="container">
  <h2>회원 메인창</h2>
  <p>${name}님 로그인 중이십니다.</p>
  
  <!--  예쁘게.... 회원가입 정보를 띄워준다.  -->
  <p>나이 : ${vo.age}</p>
  <p>성별 : ${vo.gender}</p>
  <p>취미 : ${vo.hobby}</p>
  <p>직업 : ${vo.job}</p>
  
  <p>
    <input type="button" value="로그아웃(button)" onclick="logoutCheck()" class="btn btn-info mr-3"/>
    <!-- <a href="javascript:logoutCheck()" class="btn btn-warning">로그아웃(a)</a> -->
    <a href="<%=request.getContextPath() %>/1026/test14Logout?name=${vo.name}" class="btn btn-warning">로그아웃(a)</a>
  </p>
</div>
<p><br/></p>
</body>
</html>