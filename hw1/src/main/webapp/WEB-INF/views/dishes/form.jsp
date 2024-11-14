<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Form</title>
</head>
<body>

<form:form action="/addDish?menu=${menu}" modelAttribute="dish">
    Name:
    <form:input path="name"/>
    <form:errors path="name"/><br/>

    Description:
    <form:input path="description"/>
    <form:errors path="description"/><br/>

    Dietary:
    <form:input path="dietary"/>
    <form:errors path="dietary"/><br/>

    Price:
    <form:input path="price"/>
    <form:errors path="price"/><br/>

    <input type="submit"/>
</form:form>
</body>
</html>
