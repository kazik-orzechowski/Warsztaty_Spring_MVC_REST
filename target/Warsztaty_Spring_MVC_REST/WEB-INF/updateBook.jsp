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

 <form action="http://localhost:8080/Warsztaty_Spring_MVC_REST/books/updateBook2" method="post">

<h1>Zaktualizuj książkę SVP</h1>
	<label>
		Id:
		<input type="text" name="title" value="${bookToUpdate.id}" disabled>
	</label>
	<label>
		ISBN:
		<input type="text" name="isbn" value="${bookToUpdate.isbn}">
	</label>
	<label>
		Tytuł:
		<input type="text" name="title" value="${bookToUpdate.title}">
	</label>
	<label>
		Autor:
		<input type="text" name="author" value="${bookToUpdate.author}">
	</label>
	<label>
		Wydawca:
		<input type="text" name="publisher" value="${bookToUpdate.publisher}">
	</label>
	<label>
		Gatunek:
		<input type="text" name="type" value="${bookToUpdate.type}">
	</label>
	<br>
	<input type="submit" value="Wyslij">
</form>



</body>
</html>