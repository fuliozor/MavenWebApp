<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
    <title></title>
</head>
<body>
<span>
    <a href="?lang=en">en</a>
    |
    <a href="?lang=ru">ru</a>
</span>

<h1><spring:message code="departmentList"/></h1>

<c:choose>
    <c:when test="${departments.size() == 0}">
        <h2>К сожалению список пуст</h2>
    </c:when>
    <c:when test="${departments.size() > 0}">
        <table border="1">
            <tr>
                <td><spring:message code="departmentName" /></td>
            </tr>
            <c:forEach items="${departments}" var="department">
                <tr>
                    <%--<td>${department.getId()}</td>--%>
                    <td>${department.getName()}</td>
                    <td><a href="${pageContext.request.contextPath}/${department.getId()}/employees"><spring:message code="emplyeeList" /></a></td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
</c:choose>

<a href="${pageContext.request.contextPath}/department/add"><spring:message code="createDeprtment" /></a>
</body>
</html>
