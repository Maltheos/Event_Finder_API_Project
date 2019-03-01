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
		<table>
			<tr><th>Results</th></tr>
				<c:forEach var = "variable" items = "${ list }">
					<tr><td><u>Event Name</u>: ${variable.name}</td></tr>
					<tr><td><u>Event Start Date</u>: ${variable.dates.start.localDate}</td></tr>
					<tr><td><u>Event Description</u>: ${variable.info}</td></tr>
					<tr><td><u>Event ID</u>: ${variable.id}</td></tr>
					<tr><td><u>Event URL</u>: ${variable.url}</td></tr>
					
					
				</c:forEach>
				
		</table>
	</div>

</body>
</html>