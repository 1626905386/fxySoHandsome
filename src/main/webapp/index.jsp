<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<br/>
<a href="firstServlet">firstservlet</a>
<br/>
<from action=" LoginServlet" method = "post">
    请输入姓名：<input type="text" name="username"><br>
    请输入密码：<input type="password" name="pwd"><br>
    <input type="submit" value="登录">

</from>
</body>
</html>