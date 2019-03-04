<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Event detail</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body>

<div class = "container">
Hi you got here! This is the event details page! 
	<div class = "table">
		From here you should be able to set a favorite, look up details, and go to the url!
		<table class= "table-striped">
		<tr><th>Name</th><th>Description</th><th>Url</th><th>Favorite</th>
		<c:forEach var = "event" items = "${event}">
		<tr>
		<td>${event.name}</td><td>${event.info}</td>
		<td value = "${event.url}"><a href = "${event.url}">URL</a></td>
		<td><input type = "checkbox"></td>
		</tr>
		</c:forEach>
		</table>
	</div>
	
<a href ="/"><button class = "button">Go Home</button></a>

</div>

</body>

</html>