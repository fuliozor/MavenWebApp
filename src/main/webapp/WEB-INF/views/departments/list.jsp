<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Список департаментов</h1>

<c:choose>
    <c:when test="${departments.size() == 0}">
        <h2>К сожалению список пуст</h2>
    </c:when>
    <c:when test="${departments.size() > 0}">
        <table border="1">
            <tr>
                <td>Наименование департамента</td>
            </tr>
            <c:forEach items="${departments}" var="department">
                <tr>
                    <%--<td>${department.getId()}</td>--%>
                    <td>${department.getName()}</td>
                    <td><a href="${pageContext.request.contextPath}/${department.getId()}/employees">Список сотрудников</a></td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
</c:choose>

<a href="${pageContext.request.contextPath}/department/add">Cоздать департамент</a>
</body>
</html>
