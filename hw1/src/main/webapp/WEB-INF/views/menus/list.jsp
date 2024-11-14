<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List of Menus</title>
</head>
<body>
<c:forEach items="${menus}" var="menu">
    <p>Type: ${menu.type}, Restaurant: ${menu.restaurant} <a href="/dishes?menu=${menu.id}">[dishes]</a> </p>
</c:forEach>
</body>
</html>