
<%--
  Created by IntelliJ IDEA.
  User: nicholasdiazjr
  Date: 2/4/22
  Time: 2:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
    <h1>Pizza Order Form</h1>
    <form action="/pizza-order" method="post">
        <label for="name">Name</label>
        <input name="name" id="name" type="text" size="30" >
<br>
<br>
        <label for="address">Address</label>
        <input  name="address" id="address" type="text" size="30">
<br>
<br>
        <label for="phone">Phone</label>
        <input name="phone" id="phone" type="text" size="30" >
        <br>
        <br>

        <label for="crust">Select pizza crust:</label>
        <select name="crust" id="crust" >
            <option value="thin">Thin</option>
            <option value="hand-tossed">Hand-tossed</option>
            <option value="pan">Pan</option>
        </select>

        <label for="size-menu">Select pizza crust size</label>
        <select name="size" id="size-menu" >
            <option value="personal">Personal</option>
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
        </select>

        <label for="sauce-menu">Select pizza crust size</label>
        <select name="sauce" id="sauce-menu" >
            <option value="classic">Classic Marinara</option>
            <option value="sriracha">Honey Sriracha</option>
            <option value="parmesan">Creamy Garlic Parmesan</option>
        </select>

        <h3>Pizza Toppings</h3>
            <input name="toppings" id="pepperoni" type="checkbox" value="pepperoni">
            <label for="pepperoni">Pepperoni</label>

            <input name="toppings" id="sausage" type="checkbox" value="italian sausage">
            <label for="sausage">Italian Sausage</label>

            <input name="toppings" id="ham" type="checkbox" value="ham">
            <label for="ham">Ham</label>

            <input name="toppings" id="mushroom" type="checkbox" value="mushroom">
            <label for="mushroom">Mushroom</label>

            <input name="toppings" id="black" type="checkbox" value="black olives">
            <label for="black">Black Olives</label>

            <input name="toppings" id="green" type="checkbox" value="green peppers">
            <label for="green">Green Peppers</label>

            <input name="toppings" id="onion" type="checkbox" value="onion">
            <label for="onion">Onion</label>
            <input type="submit" value="Submit Order">
<%--        <button type="submit">Submit</button>--%>
    </form>

<%--<c:choose>--%>
<%--    <c:when test="${param.sauce != null && param.crust != null && param.size != null && param.toppings != null}">--%>
<%--        <% response.sendRedirect("/pizza-order"); %>--%>
<%--        <p>Order successful!</p>--%>
<%--    </c:when>--%>
<%--        <c:otherwise>--%>
<%--            <h2>Please complete all fields to complete your order.</h2>--%>
<%--        </c:otherwise>--%>
<%--</c:choose>--%>
</body>
</html>
