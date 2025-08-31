<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Login</title>
    <style>
        body { font-family: system-ui, Arial; background: #f6f7fb; }
        .card { width: 360px; margin: 10vh auto; background: white; padding: 24px; border-radius: 12px; box-shadow: 0 10px 30px rgba(0,0,0,.06); }
        .row { margin-bottom: 12px; }
        input { width: 100%; padding: 10px 12px; border: 1px solid #ddd; border-radius: 8px; }
        button { width: 100%; padding: 10px 12px; border: 0; border-radius: 8px; cursor: pointer; }
        .btn { background: #4f46e5; color: white; }
        .error { color: #b91c1c; background: #fee2e2; padding: 8px 10px; border-radius: 6px; margin-bottom: 12px; }
    </style>
</head>
<body>
<div class="card">
    <h2>Login</h2>

    <%
        String error = (String) request.getAttribute("error");
        if (error != null) {
    %>
    <div class="error"><%= error %></div>
    <%
        }
    %>

    <form method="post" action="<%= request.getContextPath() %>/login">
        <div class="row">
            <label>Username</label>
            <input name="username" required />
        </div>
        <div class="row">
            <label>Password</label>
            <input name="password" type="password" required />
        </div>
        <button class="btn" type="submit">Sign in</button>
    </form>
</div>
</body>
</html>
