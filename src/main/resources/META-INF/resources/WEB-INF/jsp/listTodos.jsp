
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
	<link href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" type="text/css">
		<title>Todo list</title>
	</head>
	<body>
	    <div class="container">
		    <h1>Your todos are:</h1>
		    <table class="table">
                <thead>
		            <tr>
		                <th>Todo Id</th>
		                <th>Description</th>
		                <th>Target date</th>
		                <th>Is done?</th>
		                <th></th>
		            </tr>
		        </thead>
		        <tbody>
		            <c:forEach items="${todos}" var="todo">
		                <tr>
		                    <td>${todo.id}</td>
		                    <td>${todo.description}</td>
		                    <td>${todo.targetDate}</td>
		                    <td>${todo.done}</td>
		                    <td><a href="delete-todo?id=${todo.id}" class="btn btn-danger">Delete</a></td>
		                    </tr>
		            </c:forEach>
	            </tbody>
		    </table>
		    <a href="add-todo" class="btn  btn-success">Add todo</a>
		</div>
	    <script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
        <script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	</body>
</html>