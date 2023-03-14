    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    <!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>HTML 5 Boilerplate</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Student Form</h1>
	
	<form:form modelAttribute="student" action="processForm">
		Student First Name : <form:input path="firstName"/>
		<br> <br>
		Student Last Name : <form:input path="lastName"/>
		<br> <br>
		<br> <br>
		<form:select path="country">
		<form:option value="India">India</form:option>
		<form:option value="Nepal">Nepal</form:option>
		<form:option value="Bhutan">Bhutan</form:option>
		</form:select>
		<br><br>
		Hindi <form:radiobutton path="favouriteLanguage" value="Hindi"/>
		English <form:radiobutton path="favouriteLanguage" value="English"/>
		Bhojpuri <form:radiobutton path="favouriteLanguage" value="Bhojpuri"/>
		<br> <br>
		MAC<form:checkbox path="OS"  value="Mac"/>
		Linux<form:checkbox path="OS" value="linux"/>
		Windows<form:checkbox path="OS" value="Windows"/>
		<br> <br>
		<form:button name="submit" value="Submit">Submit</form:button>
		
	</form:form>
	
	
</body>
</html>