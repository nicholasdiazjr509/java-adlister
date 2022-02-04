<%--
  Created by IntelliJ IDEA.
  User: nicholasdiazjr
  Date: 2/4/22
  Time: 9:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp"/>
    <title>Login</title>
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>
<div class="container">
    <form method="post" action="/login.jsp">
        <div class="form-group">
            <label for="username">Email</label>
            <input type="text" class="form-control" id="username" name="username">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" class="form-control" id="password" name="password">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>

<c:choose>
    <c:when test='${param.username.equals("admin") && param.password.equals("password")}'>
        <% response.sendRedirect("/projile.jsp"); %>
    </c:when>
</c:choose>
</div>
<jsp:include page="partials/scripts.jsp"/>
<%--<form action = "/login.jsp" method="post">--%>
<%--    <label for = "username">Email</label>--%>
<%--    <input type="text" id="username" name="username">--%>
<%--    <label for="password">Password</label>--%>
<%--    <input type="password" id="password" name="password">--%>
<%--</form>--%>
<%--<%--%>
<%--    String username = request.getParameter("username");--%>
<%--    String password = request.getParameter("password");--%>
<%--    if(username != null && password != null){--%>
<%--        if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")){--%>
<%--            response.sendRedirect(("./profile.jsp"));--%>
<%--        }--%>
<%--    }--%>
<%--%>--%>


</body>
</html>
