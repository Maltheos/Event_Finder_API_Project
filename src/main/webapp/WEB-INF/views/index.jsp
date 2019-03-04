<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Events API - index</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body>
<div class = "container">

<h1>Welcome to the events search API Capstone Project</h1>
        
        <form action = "/eventlist">
            <div class="form-group">
                <label for="keyword">Search by keyword:</label>
                <input class= "form-control" name="keyword">
            </div>
             <div class="form-group">
                <label for="id">Search by id:</label>
                <input class= "form-control" name="id">
            </div> 
            <div class="form-group">
                <label for="start date">Search by start date:</label>
                <input class= "form-control" name="startDateTime">
            </div>
            <button action = "submit"> Search! </button>
        </form>

</div>
</body>

</html>