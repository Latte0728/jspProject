<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- test13Logout.jsp -->
<%
	String name = request.getParameter("name"); // test13Res.jsp에서 로그아웃 정보를 요청하고 Query String 방식으로 넘김
	pageContext.setAttribute("name", name); // ("name=변수", name=값) 
%>

<script>
	alert("${name}님 로그아웃 되었습니다.(MVC)");
	<%-- location.herf = "<%=request.getContextPath()%>/study/1026/test13.jsp"; --%>
	<%-- location.herf = "<%=request.getContextPath()%>/study/1026/test13.jsp"; --%>
	location.herf = "${pageContext.request.contextPath}>/study/1026/test13.jsp"; // EL표기법(현재 페이지에 있는 저장소), getContextPath()에서 get을 지우고 ContextPath의 첫글자 C를 c(소문자로) ()는 삭제
	/* location.href = "test13.jsp"; */
</script>