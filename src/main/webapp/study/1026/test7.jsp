<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>test7.jsp(경로 (static:정적)연습)</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <script>
    
    
    </script>
</head>
<body>
<p><br/></p> 
<div class="container"> 
	<h2>콤보상자에서 그림파일을 선택하면 선택된 그림을 화면에 출력시켜주시오.</h2>
	<form method="get" action="#">
	<select name= "pic" id="pic">
		<option value="">== 선택 ==</option>
		<option value="1.jpg">그림 1</option>
		<option value="2.jpg">그림 2</option>
		<option value="4.jpg">그림 4</option>
		<option value="5.jpg">그림 5</option>
		<option value="6.jpg">그림 6</option>
		<option value="7.jpg">그림 7</option>
		<option value="8.jpg">그림 8</option>
	</select>
	</form>
</div>
</body>
</html>