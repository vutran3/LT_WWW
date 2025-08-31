<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Home</title>
    <style>
        body { font-family: system-ui, Arial; background: #fff; padding: 24px; }
        .tag { display:inline-block; padding:6px 10px; background:#eef2ff; border-radius:16px; }
        form { display:inline; }
        button { padding:6px 10px; border:0; border-radius:8px; background:#ef4444; color:#fff; cursor:pointer; }
    </style>
</head>
<body>
<%
    HttpSession session = request.getSession(false);
    String user = (session != null) ? (String) session.getAttribute("user") : null;
%>
<h2>Welcome, <span class="tag"><%= user %></span> 🎉</h2>

<p>You are logged in. This page is protected by <code>AuthFilter</code>.</p>

<form method="post" action="<%= request.getContextPath() %>/logout">
    <button type="submit">Logout</button>
</form>
</body>
</html>
