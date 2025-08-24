<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Register</title>
  </head>
  <body>
    <h2>Register</h2>

    <c:if test="${not empty error}">
      <p style="color:red;">${error}</p>
    </c:if>

    <c:if test="${not empty success}">
      <p style="color:green;">${success}</p>
    </c:if>

    <form action="register" method="post">
      Username: <input type="text" name="username" value="${param.username}" required/><br/>
      Password: <input type="password" name="password" required/><br/>
      <button type="submit">Register</button>
    </form>
  </body>
</html>
