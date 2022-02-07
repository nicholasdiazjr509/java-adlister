<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nicholasdiazjr
  Date: 2/7/22
  Time: 1:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show all albums</title>
</head>
<body>
<h1>Here are all of the albums!</h1>
    <c:forEach var="album" items="${albums}">
        <div class="album">
            <h2>${album.name}</h2>
            <h4>BY: ${album.artist}</h4>
            <p>Year: ${album.releaseDate}; Sales in millions: ${album.sales}</p>
        </div>
    </c:forEach>
</body>
</html>
