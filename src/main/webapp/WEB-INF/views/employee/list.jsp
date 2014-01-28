<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Список сотрудников</title>
</head>
<body>
<h1>Список сотрудников</h1>

<c:choose>
    <c:when test="${employees.size() == 0}">
        <h2>К сожалению список пуст</h2>
    </c:when>
    <c:when test="${employees.size() > 0}">
        <table border="1">
            <tr>
                <td>Имя</td>
                <td>Фамилия</td>
            </tr>
            <c:forEach items="${employees}" var="employee">
                <tr>
                    <td>${employee.getFirstName()}</td>
                    <td>${employee.getLastName()}</td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
</c:choose>

<td><a href="${pageContext.request.contextPath}/${department}/employee/add">Добавить сотрудника</a></td>
</body>
</html>
