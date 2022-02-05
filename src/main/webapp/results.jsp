<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nicholasdiazjr
  Date: 2/5/22
  Time: 8:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Final Result</title>
</head>
<body>
    <c:choose>
        <c:when test="${result}">
            <h1>You WON!!</h1>
        </c:when>
        <c:otherwise>
                <h1>Sorry, you lost.</h1>
        </c:otherwise>
    </c:choose>
<a href="/guess">Like To Try Again?</a>
</body>
</html>
