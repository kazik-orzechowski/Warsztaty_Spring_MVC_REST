<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

 <form action="http://localhost:8080/Warsztaty_Spring_MVC_REST/books/addBook" method="post">

<h1>Dodaj nową książkę SVP</h1>
	<label>
		Id:
		<input type="hidden" name="id" >
	</label>
	<br>
	<label>
		ISBN:
		<input type="text" name="isbn" >
	</label>
	<br>
	<label>
		Tytuł:
		<input type="text" name="title" >
	</label>
	<br>
	<label>
		Autor:
		<input type="text" name="author">
	</label>
	<br>
	<label>
		Wydawca:
		<input type="text" name="publisher" >
	</label>
	<br>
	<label>
		Gatunek:
		<input type="text" name="type" >
	</label>
	<br>
	<input type="submit" value="Wyslij">
</form>

</body>
</html>