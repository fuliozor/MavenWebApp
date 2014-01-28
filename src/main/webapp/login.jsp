<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>Авторизация</title>
</head>
<body>

<c:if test="${not empty param.error}">
    <p color="red"> Произошла ошибка
        : ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message} </p>
</c:if>
<form method="POST" action="<c:url value="/j_spring_security_check" />">

    <label>Логин</label>
    <input type="text" name="j_username"/><br/>
    <label>Пароль</label>
    <input type="password" name="j_password"/><br/>

    <input type="submit" value="Войти"/>
</form>
</body>
</html>