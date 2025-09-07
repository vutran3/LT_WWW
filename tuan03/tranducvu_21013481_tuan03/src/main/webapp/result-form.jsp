<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="student" scope="request" type="entities.Student" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Result submit</title>
    <style>
        body { font-family: Arial, sans-serif; line-height: 1.5; }
        table { border-collapse: collapse; margin-top: 8px; }
        td, th { border:1px solid #ccc; padding:6px 8px; }
    </style>
</head>
<body>
<jsp:include page="topbar.jsp"/>

<h2>Registration Result</h2>

<p><b>First name:</b> <jsp:getProperty name="student" property="firstName"/></p>
<p><b>Last name:</b> <jsp:getProperty name="student" property="lastName"/></p>
<p><b>Email:</b> <jsp:getProperty name="student" property="email"/></p>
<p><b>Gender:</b> <jsp:getProperty name="student" property="gender"/></p>
<p><b>Birthday:</b> <jsp:getProperty name="student" property="birthdayStr"/></p>
<p><b>Mobile:</b> <jsp:getProperty name="student" property="mobile"/></p>
<p><b>Address:</b> <jsp:getProperty name="student" property="address"/></p>
<p><b>City/State/Country:</b>
    <jsp:getProperty name="student" property="city"/> /
    <jsp:getProperty name="student" property="state"/> /
    <jsp:getProperty name="student" property="country"/>
</p>
<p><b>Pin code:</b> <jsp:getProperty name="student" property="pinCode"/></p>
<p><b>Hobbies:</b> <jsp:getProperty name="student" property="hobbiesCsv"/></p>
<p><b>Course applies for:</b> <jsp:getProperty name="student" property="course"/></p>

<h3>Qualifications</h3>
<table>
    <tr><th>#</th><th>Examination</th><th>Board</th><th>Percentage</th><th>Year</th></tr>
    <%
        int i = 1;
        for (entities.Qualification q : student.getQualifications()) {
    %>
    <tr>
        <td><%=i++%></td>
        <td><%=q.getExamination()%></td>
        <td><%=q.getBoard()%></td>
        <td><%=q.getPercentage()%></td>
        <td><%=q.getYearOfPassing()%></td>
    </tr>
    <% } %>
</table>
</body>
</html>
