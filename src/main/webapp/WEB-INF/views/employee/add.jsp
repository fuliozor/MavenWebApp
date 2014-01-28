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
    <title>Добавить сотрудника</title>
</head>
<body>
<h1>Добавление сотрудника</h1>

<form action="${pageContext.request.contextPath}/employee/add" method="post">
    <label>Имя</label>
    <input type="text" name="first" /> <br/>
    <label>Фамилия</label>
    <input type="text" name="last" /> <br/>
    <input type="hidden" name="department" value="${department}" /> <br/>
    <input type="submit" value="Отправить"/>
</form>
</body>
</html>
