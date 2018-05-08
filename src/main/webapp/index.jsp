<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@ page session="true" %>
<%
    if (session.isNew()) {
        session.getId(); }
    %>

<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
<h2>Работа с сессией!</h2>
    <p>Введите имя</p>
<form  action="page1" method="post"  accept-charset="UTF-8">
    <input name="name" type="text" size="20">
    <input type="submit" value="Отправить">
</form>


</body>
</html>
