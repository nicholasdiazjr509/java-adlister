<%--
  Created by IntelliJ IDEA.
  User: nicholasdiazjr
  Date: 2/7/22
  Time: 2:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="My Adlister."/>
    </jsp:include>
    <title>My Adlister</title>
</head>
<body>
    <jsp:include page="/partials/navbar.jsp" />
    <div class="container">
        <h1> Here are the ads.</h1>
        <c:forEach var="ad" items="${ads}">
            <div class="col-md-6">
                <h2>${ad.title}</h2>
                <p>${ad.description}</p>
            </div>
        </c:forEach>
    </div>
</body>
</html>
