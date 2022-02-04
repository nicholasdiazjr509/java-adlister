<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <form action="pizza-order.jsp" method="post">
        <label for="name">Name</label>
        <input id="name" type="text" size="30" data-form-type="name">
<br>
<br>
        <label for="address">Address</label>
        <input id="address" type="text" size="30" data-form-type="address">
<br>
<br>
        <label for="phone">Phone</label>
        <input id="phone" type="text" size="30" data-form-type="phone">
        <br>
        <br>

        <label for="crust-menu">Select pizza crust</label>
        <select id="crust-menu" name="crust">
            <option value="thin">Thin</option>
            <option value="hand-tossed">Hand-tossed</option>
            <option value="pan">Pan</option>
        </select>

        <label for="size-menu">Select pizza crust size</label>
        <select id="size-menu" name="size">
            <option value="personal">Personal</option>
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
        </select>

        <label for="sauce-menu">Select pizza crust size</label>
        <select id="sauce-menu" name="sauce">
            <option value="classic">Classic Marinara</option>
            <option value="sriracha">Honey Sriracha</option>
            <option value="parmesan">Creamy Garlic Parmesan</option>
        </select>

        <h3>Pizza Toppings</h3>
            <input name="toppings" id="pepperoni" type="checkbox" value="pepperoni">
            <label for="pepperoni">Pepperoni</label>

            <input name="toppings" id="sausage" type="checkbox" value="sausage">
            <label for="sausage">Italian</label>

            <input name="toppings" id="ham" type="checkbox" value="pepperoni">
            <label for="ham">Ham</label>

            <input name="toppings" id="mushroom" type="checkbox" value="mushroom">
            <label for="mushroom">Mushroom</label>

            <input name="toppings" id="black" type="checkbox" value="black">
            <label for="black">Black Olives</label>

            <input name="toppings" id="green" type="checkbox" value="green">
            <label for="green">Green Peppers</label>

            <input name="toppings" id="onion" type="checkbox" value="onion">
            <label for="onion">Onion</label>

        <button type="submit">Submit</button>
    </form>

<c:choose>
    <c:when test="${param.sauce != null && param.crust != null && param.size != null && param.toppings != null}">
        <% response.sendRedirect("partials/display-order.jsp"); %>
        <p>Order successful!</p>
    </c:when>
        <c:otherwise>
            <h2>Please complete all fields to complete your order.</h2>
        </c:otherwise>
</c:choose>
</body>
</html>
