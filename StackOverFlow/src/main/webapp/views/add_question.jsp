<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Question</title>
<style type="text/css">
body {
	font-family: Arial, Helvetica, sans-serif;
}

input[type=text], input[type=password], select {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

button {
	background-color: #07AA8D;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
}

button:hover {
	opacity: 0.8;
}

.form-content {
	background-color: #fefefe;
	margin: 5% auto 15% auto;
	border: 1px solid #888;
	width: 40%;
}

div.signup {
	float: right;
	padding-top: 16px;
}

.container {
	padding-top: 16px;
	padding-left: 16px;
	padding-right: 16px;
	padding-bottom: 50px;
}
</style>
</head>
<body>
	<sf:form action="add" modelAttribute="newQuestion" class="form-content" >
		<h2 align="center">Raise an Question</h2>
		<div class="container">
		
		<label for="question"><b>Question</b></label> 
			<sf:input type="text" placeholder="Enter question" path="question"/>
			<label for="langauge"><b>Language</b></label> 
			<sf:input type="text" placeholder="Enter language" path="langauge"/>
			<sf:button type="submit">Add</sf:button>
		</div>
	</sf:form>
</body>
</html>