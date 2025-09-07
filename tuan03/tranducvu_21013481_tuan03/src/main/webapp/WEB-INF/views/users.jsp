<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %><%-- đổi sang java.sun.com nếu bạn dùng JSTL 1.2 --%>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Users</title>
    <style>
        body{font-family:Arial, sans-serif;background:#f5f7fb}
        .wrap{width:820px;margin:40px auto;background:#fff;padding:18px 22px;border-radius:8px;box-shadow:0 2px 10px #0001}
        table{width:100%;border-collapse:collapse}
        th,td{padding:10px;border-bottom:1px solid #eee;text-align:left}
        th{background:#f0f3f7}
        .msg{color:#2e7d32;margin-bottom:10px}
        a.btn{display:inline-block;margin-top:10px;padding:8px 12px;background:#234a86;color:#fff;text-decoration:none;border-radius:6px}
    </style>
</head>
<body>
<div class="wrap">
    <h2>Danh sách tài khoản</h2>
    <c:if test="${not empty message}">
        <div class="msg">${message}</div>
    </c:if>

    <table>
        <thead>
        <tr>
            <th>#</th>
            <th>First name</th>
            <th>Last name</th>
            <th>Email</th>
            <th>Birthday</th>
            <th>Gender</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="u" items="${users}" varStatus="st">
            <tr>
                <td>${st.index + 1}</td>
                <td>${u.firstName}</td>
                <td>${u.lastName}</td>
                <td>${u.email}</td>
                <td>${u.birthday}</td>
                <td>${u.gender}</td>
            </tr>
        </c:forEach>
        <c:if test="${empty users}">
            <tr><td colspan="6">Chưa có tài khoản nào.</td></tr>
        </c:if>
        </tbody>
    </table>

    <a class="btn" href="${pageContext.request.contextPath}/register">← Quay lại Form</a>
</div>
</body>
</html>
