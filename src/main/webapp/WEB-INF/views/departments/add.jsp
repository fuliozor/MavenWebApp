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
    <title>Добавить департамент</title>
</head>
<body>
    <h1>Добавление департамента</h1>

    <form action="${pageContext.request.contextPath}/department/add" method="post">
        <label>Название</label>
        <input type="text" name="title" /> <br/>
        <input type="submit" value="Отправить"/>
    </form>
</body>
</html>
