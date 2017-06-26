<%--
  Created by IntelliJ IDEA.
  User: Galaxy
  Date: 2017/3/18
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<form action="/user/loginAction.action" method="POST">
    <input type="text" name="username" class="form-control" placeholder="username">
    <input type="password" name="password" class="form-control" placeholder="password">
    <button type="submit">提交</button>
</form>
</body>
</html>
