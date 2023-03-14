    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    <!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Customer Form</title>
<link rel="stylesheet" href="style.css">
<style type="text/css">
.errors{ color: red}</style>
</head>
<body>
	<h1>Customer  Form</h1>
	
	<form:form modelAttribute="customer" action="processForm">
	
		First Name : <form:input path="firstName"/>
		<br> <br>
		Last Name (*): <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="errors"></form:errors>
		<br> <br>
		Free passes (*): <form:input path="freePasses"/>
		<form:errors path="freePasses" cssClass="errors"></form:errors>
		<br> <br>
		<br> <br>
		PostalCode (*): <form:input path="postalCode"/>
		<form:errors path="postalCode" cssClass="errors"></form:errors>
		<br> <br>
		<form:button name="submit" value="Submit">Submit</form:button>
		
	</form:form>
	
	
</body>
</html>