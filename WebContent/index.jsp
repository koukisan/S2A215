<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>R4A100 入力画面</title>
	<script src="js/jquery-3.2.0.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<link rel=stylesheet href="css/bootstrap.min.css">
	<link rel=stylesheet href="css/style.css">
	<link rel="shortcut icon" href="images/favicon.ico">

<style>
body{
   background-color:blue;
}
</style>
</head>
<body>
<h1>ToDoアプリケーション</h1>
<form action="hogei" method="get">
    <%!
    int cnt=0;
    String kigu;
    %>
    <%
    cnt++;
    if(cnt%2==0){
    	kigu="偶数";
    }else{
    	kigu="奇数";
    }
    out.println("入力画面:あなたは"+ kigu+"目のお客様です("+cnt+"人目)");
    %>
    <br>
    <p>登録内容</p>
	<select name="important">
	<%! String imp; %>
			<option value="高い">高い</option>
			<option value="やや高い">やや高い</option>
			<option value="普通">普通</option>
			<option value="やや低い">やや低い</option>
			<option value="低い">低い</option>
		</select>
	<input type="text" name="naiyou" size=20>
	<input type="submit" value="呼び出し">
	</form>
</body>
</html>