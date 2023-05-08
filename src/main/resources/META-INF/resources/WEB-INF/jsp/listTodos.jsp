
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>Todo list</title>
	</head>
	<body>
		<h1>Welcome to the Todos manager, ${name}:</h1>
		<hr>
		<h1>Your todos are:</h1>
		<table>
		    <thead>
		        <tr>
		            <th>Todo Id</th>
		            <th>Description</th>
		            <th>Target date</th>
		            <th>Is done?</th>
		        </tr>
		    </thead>
		<tbody>
		    <c:forEach items="${todos}" var="todo">
		        <tr>
		            <td>${todo.id}</td>
		            <td>${todo.description}</td>
		            <td>${todo.targetDate}</td>
		            <td>${todo.done}</td>
		        </tr>
		</c:forEach>
	    </tbody>
		</table>
	</body>
</html>