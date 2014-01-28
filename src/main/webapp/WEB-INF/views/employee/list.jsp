<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Список департаментов</h1>

<c:choose>
    <c:when test="${employees.size() == 0}">
        <h2>К сожалению список пуст</h2>
    </c:when>
    <c:when test="${employees.size() > 0}">
        <table border="1">
            <tr>
                <td>ID</td>
                <td>Имя</td>
            </tr>
            <c:forEach items="${employees}" var="employee">
                <tr>
                    <td>${employee.getId()}</td>
                    <td>${employee.getFirstName()}</td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
</c:choose>

<td><a href="${pageContext.request.contextPath}/${department}/employee/add">Добавить сотрудника</a></td>
</body>
</html>
