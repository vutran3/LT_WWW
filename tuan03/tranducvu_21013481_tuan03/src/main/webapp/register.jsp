<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Registration</title>
    <style>
        body { font-family: Arial, sans-serif; line-height: 1.4; }
        label { display:inline-block; width:140px; }
        table { border-collapse: collapse; }
        td, th { border:1px solid #ccc; padding:6px 8px; }
    </style>
</head>
<body>
<jsp:include page="topbar.jsp"/>

<h2>Registration Form</h2>

<!-- Yêu cầu đề bài: method="GET" -->
<form action="<%=request.getContextPath()%>/registration-form" name="formDangKy" method="GET" accept-charset="UTF-8">

    <p><label>First name:</label><input type="text" name="txtFName" maxlength="30"></p>
    <p><label>Last name:</label><input type="text" name="txtLName" maxlength="30"></p>

    <p>
        <label>Date of birth:</label>
        Day:
        <select name="cmbDay">
            <% for (int i=1;i<=31;i++) { %>
            <option value="<%=i%>"><%=i%></option>
            <% } %>
        </select>
        Month:
        <select name="cmbMonth">
            <% for (int i=1;i<=12;i++) { %>
            <option value="<%=i%>"><%=i%></option>
            <% } %>
        </select>
        Year:
        <select name="cmbYear">
            <% for (int y=1980;y<=2025;y++) { %>
            <option value="<%=y%>"><%=y%></option>
            <% } %>
        </select>
    </p>

    <p><label>Email:</label><input type="email" name="txtEmail"></p>
    <p><label>Mobile number:</label><input type="text" name="txtMobileNumber" maxlength="10"></p>

    <p>
        <label>Gender:</label>
        <input type="radio" name="rdGender" value="Male"> Male
        <input type="radio" name="rdGender" value="Female"> Female
    </p>

    <p><label>Address:</label><textarea name="txtAddress" rows="3" cols="40"></textarea></p>
    <p><label>City:</label><input type="text" name="txtCity" maxlength="30"></p>
    <p><label>Pin code:</label><input type="text" name="txtPin" maxlength="6"></p>
    <p><label>State:</label><input type="text" name="txtState" maxlength="30"></p>
    <p><label>Country:</label><input type="text" name="txtCountry" value="India"></p>

    <p>
        <label>Hobbies:</label>
        <input type="checkbox" name="chkHobbies" value="Drawing"> Drawing
        <input type="checkbox" name="chkHobbies" value="Singing"> Singing
        <input type="checkbox" name="chkHobbies" value="Dancing"> Dancing
        <input type="checkbox" name="chkHobbies" value="Sketching"> Sketching
        <input type="checkbox" name="chkHobbies" value="Others"> Others
        <input type="text" name="chkHobbies" placeholder="specify">
    </p>

    <h3>Qualification</h3>
    <table>
        <tr>
            <th>Sl.No.</th><th>Examination</th><th>Board</th><th>Percentage</th><th>Year of Passing</th>
        </tr>
        <tr>
            <td>1</td><td>Class X</td>
            <td><input name="boardX"></td>
            <td><input name="percentageX"></td>
            <td><input name="yopX"></td>
        </tr>
        <tr>
            <td>2</td><td>Class XII</td>
            <td><input name="boardXII"></td>
            <td><input name="percentageXII"></td>
            <td><input name="yopXII"></td>
        </tr>
        <tr>
            <td>3</td><td>Graduation</td>
            <td><input name="boardGrad"></td>
            <td><input name="percentageGrad"></td>
            <td><input name="yopGrad"></td>
        </tr>
        <tr>
            <td>4</td><td>Masters</td>
            <td><input name="boardMasters"></td>
            <td><input name="percentageMasters"></td>
            <td><input name="yopMasters"></td>
        </tr>
    </table>

    <p>
        <label>Course applies for:</label>
        <input type="radio" name="cmbCourse" value="BCA"> BCA
        <input type="radio" name="cmbCourse" value="B.Com"> B.Com
        <input type="radio" name="cmbCourse" value="B.Sc"> B.Sc
        <input type="radio" name="cmbCourse" value="BA"> BA
    </p>

    <p>
        <button type="submit">Submit</button>
        <button type="reset">Reset</button>
    </p>
</form>
</body>
</html>
