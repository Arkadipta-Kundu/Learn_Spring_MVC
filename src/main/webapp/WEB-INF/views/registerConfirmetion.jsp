<%--
  Created by IntelliJ IDEA.
  User: arka2002
  Date: 22-07-2025
  Time: 07:02 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>User Details</title>
</head>
<body>
    <h1>User Details</h1>
<%--    using normal requestparam--%>
<%--    <p><strong>Name:</strong> ${name}</p>--%>
<%--    <p><strong>Email:</strong> ${email}</p>--%>
<%--    <p><strong>Password:</strong> ${password}</p>--%>
<%--    using modelattribute --%>
    <p><strong>Name:</strong> ${user.name}</p>
    <p><strong>Email:</strong> ${user.email}</p>
    <p><strong>Password:</strong> ${user.password}</p>
</body>
</html>
