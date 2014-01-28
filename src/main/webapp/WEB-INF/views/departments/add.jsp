<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: dn261290kam
  Date: 22.01.14
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><spring:message code="createDeprtment" /></title>
</head>
<body>
    <h1><spring:message code="createDeprtment" /></h1>

    <form action="${pageContext.request.contextPath}/department/add" method="post">
        <label><spring:message code="title" /></label>
        <input type="text" name="title" /> <br/>
        <input type="submit" value="<spring:message code="send" />"/>
    </form>
</body>
</html>
