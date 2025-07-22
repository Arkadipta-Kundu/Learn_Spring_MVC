<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>About</title>
</head>
<body>
<h1>This is the about page which is</h1>
<h2>it is fired by the /about path</h2>
<%--<%--%>
<%--    String name = (String)request.getAttribute("name_key");--%>
<%--    Integer age = (Integer) request.getAttribute("age_key");--%>
<%--%>--%>
<%--<h3>MY name is <%= name %>--%>
<%--and age is <%=age%> </h3>--%>

<h3>MY name is ${name_key}
    and age is ${age_key} </h3>
</body>
</html>