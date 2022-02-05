<%--
  Created by IntelliJ IDEA.
  User: nicholasdiazjr
  Date: 2/5/22
  Time: 8:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing Game </title>
</head>
<body>
<h1>Please, pick a number.</h1>
    <form action="/guess" method="post">
        <button name="guess" value="1">Uno</button>
        <button name="guess" value="2">Dos</button>
        <button name="guess" value="3">Thres</button>
<%--        <input name="text" type="text">--%>
<%--Could use text input--%>
    </form>

</body>
</html>
