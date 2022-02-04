<%--
  Created by IntelliJ IDEA.
  User: nicholasdiazjr
  Date: 2/4/22
  Time: 9:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>
  <%@
  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
  %>

          <form action = "/login.jsp" method="post">
            <label for = "username">Email</label>
              <input type="text" id="username" name="username">
                <label for="password">Password</label>
                <input type="password" id="password" name="password">
          </form>
  <%
  String username = request.getParameter("username");
  String password = request.getParameter("password");
  if(username != null && password != null){
      if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")){
          response.sendRedirect(("./profile.jsp"));
      }
  }
  %>




  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
</body>
</html>
