<%--
  Created by IntelliJ IDEA.
  User: LBJ
  Date: 2021/4/6
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="header.jsp" %>
<body>
<h2>Login</h2>
    <%
    if((request.getAttribute("message")!=null)) {
        out.print("<h3>"+request.getAttribute("message")+"<h3>");
    }
%>
    <%
    Cookie[] allCookies=request.getCookies();
    String username = "",password="",rememberMeVal="";
    if(allCookies != null) {
        for(Cookie c:allCookies) {
            if(c.getName().equals("cUsername")) {
                username=c.getValue();
            }
            if(c.getName().equals("cPassword")) {
                password=c.getValue();
            }if(c.getName().equals("rememberMeVal")) {
                rememberMeVal=c.getValue();
            }
        }
    }
%>

<form action="login" method="post">

    Username:<input type="text" name="Username" id="Username" value="<%=username%>"><br>
    Password:<input type="password" name="Password" id="Password" value="<%=password%>"><br>
    <input type="checkbox" name="rememberMe" value="1" <%= rememberMeVal.equals("1") ? "checked" : ""%>/>Remember
    Me<br/>
    <input type="submit" value="login">
</form>
<%@include file="footer.jsp" %>
