<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>User Registration</title>
    <style>
        body{font-family:Arial, sans-serif;background:#f5f7fb}
        .card{width:420px;margin:40px auto;background:#fff;padding:20px 24px;border-radius:8px;box-shadow:0 2px 10px #0001}
        h2{text-align:center;margin:6px 0 16px}
        input,select{width:100%;padding:10px;margin:8px 0;border:1px solid #cdd1d6;border-radius:6px}
        .row{display:flex;gap:10px}
        .row>div{flex:1}
        .actions{margin-top:10px}
        .btn{width:100%;padding:12px;background:#234a86;color:#fff;border:none;border-radius:6px;cursor:pointer}
        .error{color:#c62828;margin:4px 0}
        .radio{display:flex;gap:16px;align-items:center;margin-top:6px}
    </style>
</head>
<body>
<div class="card">
    <h2>User Registration Form</h2>

    <c:if test="${not empty error}">
        <div class="error">${error}</div>
    </c:if>
    <%-- Nếu chưa có JSTL ở máy bạn, có thể bỏ khối c:if, thay bằng EL check đơn giản hoặc scriptlet. --%>

    <form method="post" action="${pageContext.request.contextPath}/register/bai02">
        <div class="row">
            <div><input name="firstName" placeholder="First Name" required></div>
            <div><input name="lastName" placeholder="Last Name" required></div>
        </div>
        <input type="email" name="email" placeholder="Your Email" required>
        <input type="email" name="email2" placeholder="Re-enter Email" required>
        <input type="password" name="password" placeholder="New Password" required>

        <label>Birthday</label>
        <input type="date" name="birthday" required>

        <div class="radio">
            <label><input type="radio" name="gender" value="female" required> Female</label>
            <label><input type="radio" name="gender" value="male"> Male</label>
        </div>

        <div class="actions">
            <button class="btn" type="submit">Sign Up</button>
        </div>
    </form>

    <div style="text-align:center;margin-top:10px">
        <a href="${pageContext.request.contextPath}/register/bai02?view=list">Xem danh sách tài khoản</a>
    </div>
</div>

<%-- JSTL taglib: dùng 1 trong 2 dòng dưới tùy phiên bản JSTL của bạn. Đặt ở đầu file nếu dùng. --%>
<%-- <%@ taglib prefix="c" uri="jakarta.tags.core" %> --%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
</body>
</html>
