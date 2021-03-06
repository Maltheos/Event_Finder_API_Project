<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body>
	<div class = "container">
		<h1>Results</h1>
		<table class= "table-striped">
			<tr><th>Name</th><th>Date</th><th>Url</th></tr>
				<c:forEach var = "variable" items = "${ list }">
					<tr>
						<form action = "/eventdetail">
							<td>${variable.name}</td>
							<td>${variable.sales.publicSales.startDateTime}</td>
							<td><a href = ${variable.url}>${variable.url}</a></td>
							<td><button name = "id" value = "${variable.id}">Event details</button>
						</form>
					</tr>
				</c:forEach>
		</table>
	</div>
</body>
</html>