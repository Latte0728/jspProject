<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>test1.jsp</title>
  <jsp:include page="/include/bs4.jsp" />
</head>
<body>
<jsp:include page="/include/header.jsp" />
<p><br/></p>
<div class="container">
	<form name="loginForm" method="post" action="loginOk.jsp">
		<table class="table table-bordered">
			<tr>
				<th colspan="2" class="text-center"><h2>회원 로그인</h2></th>
			</tr>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="mid" id="mid" value="admin" class="form-control" autofocus /></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="pwd" id="pwd" value="1234" required class="form-control" autofocus /></td>
			</tr>
				<th colspan="2" class="text-center">
					<input type="submit" value="로그인" class="btn btn-success mr-3" />
					<input type="reset" value="재입력" class="btn btn-warning" />
					<input type="button" value="돌아가기" onclick="location.href="${ctp}/guest/guestList.jsp';" class="btn btn-warning" />
					<input type="checkbox" value="idSave" class="btn btn-warning" />
				</th>
			</tr>		
		</table>
	</form>
</div>
<jsp:include page="/include/footer.jsp" />
</body>
</html>