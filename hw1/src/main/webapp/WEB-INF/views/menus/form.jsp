<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Form</title>
</head>
<body>
<form:form action="/addMenu" modelAttribute="menu">
    ID:
    <form:input path="id"/>
    <form:errors path="id"/><br/>

    Type:
    <form:input path="type"/>
    <form:errors path="type"/><br/>

    Restaurant:
    <form:input path="restaurant"/>
    <form:errors path="restaurant"/><br/>

    <input type="submit"/>
</form:form>
</body>
</html>
