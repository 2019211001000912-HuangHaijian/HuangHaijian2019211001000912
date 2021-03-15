<%--
  Created by IntelliJ IDEA.
  User: LBJ
  Date: 2021/3/15
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="Http://www.ecjtu.jx.cn">go to ecjtu</a><!--method is GET-->
<form method="post"><!--what is method when we use form?--><!--its GET , why?default is GET-->
    Name:<input type="text" name="name"></br>
    ID:<input type="text" name="id"></br>
    <input type="submit" value="Send date to server"/>
</form>
</body>
</html>
