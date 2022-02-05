<%--
  Created by IntelliJ IDEA.
  User: nicholasdiazjr
  Date: 2/5/22
  Time: 7:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Color Picker</title>
</head>
<body>
    <form action="/pickcolor" method="post">
        <label for="color">What is your favorite color?</label>
        <input name="color" type="text" id="color">
        <input type="submit" value="Submit">
    </form>
</body>
</html>
