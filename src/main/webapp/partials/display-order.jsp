<%--
  Created by IntelliJ IDEA.
  User: nicholasdiazjr
  Date: 2/4/22
  Time: 2:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="PizzaServlet" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
    <title>Display Order</title>
</head>
<body>
    <ul>
        <li>Crust: ${param.crust}</li>
        <li>Sauce: ${param.sauce}</li>
        <li>Size: ${param.size}</li>
        <li>Toppings: ${param.toppings}</li>
    </ul>

</body>
</html>
