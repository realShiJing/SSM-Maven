<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 2018/1/9 0009
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/practice/login" method="post">
    用户名：<input type="text" name="userName">
    <br>
    密码：<input type="password" name="password">
    <input type="submit" value="登录">
</form>
</body>
</html>
