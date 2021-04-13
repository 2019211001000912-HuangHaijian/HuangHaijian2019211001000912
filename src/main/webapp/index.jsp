<%@include file="header.jsp"%>

<h1><%= "Welcome to my home page!" %>

    <br>
    <form method="get"  action="search">
        <%--        <url-pattern>/search</url-pattern>--%>

        <input type="text" name="txt" size="30"/>
        <select name="search">
            <option value="Baidu">Baidu</option>
            <option value="Bing">Bing</option>
            <option value="Google">Google</option>
        </select>
        <input type="submit" value="search">
    </form>
    <a href="/2019211001000912HuangHaijian_war_exploded/hello-servlet">Hello Servlet-week1</a>
    <br>
    <a href="/2019211001000912HuangHaijian_war_exploded/hello">Student Info Servlet-week2</a>
    <br>
    <a href="/2019211001000912HuangHaijian_war_exploded/register">Register-getParameter-week3</a>
    <br>
    <a href="/2019211001000912HuangHaijian_war_exploded/Register.jsp">Register JDBC-week4</a>
    <br>
    <a href="/2019211001000912HuangHaijian_war_exploded/config">Config parameter-week4</a>
    <br>
    <a href="index.jsp">include-week5</a>
    <br>
    <a href="login.jsp">Login-week5</a>

<%@include file="footer.jsp"%>