<%--
  Created by IntelliJ IDEA.
  User: LBJ
  Date: 2021/3/16
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<form method="post" action="Register"><!--within doPost() in servlet-->
    <table width="700" border="1" align="center"><tr>
        <td align="center">
            New User Registration!
        </td>
    </tr>
    </table>

    <table width="700" border="1" align="center"><tr>
        <td align="center">
            <label for="Username">Username</label>
            <input type="text" name="Username" id="Username" placeholder="Username" required autofocus>
        </td>
    </tr>
    </table>
    <table width="700" border="1" align="center"><tr>
        <td align="center">
            <label for="Password">Password</label>
            <input type="password" name="Password" id="Password" placeholder="Password" required autofocus>
        </td>
    </tr>
    </table>
    <table width="700" border="1" align="center"><tr>
        <td align="center">
            <label for="Email">Email</label>
            <input type="Email" name="Email" id="Email" placeholder="Email" required autofocus>
        </td>
    </tr>
    </table>
    <table width="700" border="1" align="center"><tr>
        <td align="center">
            Gender
            <input type="radio" name="sex" value="Male" checked/>Male
            <input type="radio" name="sex" value="Female" checked/>Female
        </td>
    </tr>
    </table>
    <table width="700" border="1" align="center"><tr>
        <td align="center">
            Gender
            <label for="Date Of Birth">Date Of Birth</label>
            <input type="date " name="Birthday" id="Date Of Birth" placeholder="(yyyy-mm-dd)" >
        </td>
    </tr>
    </table>

    <table width="700" border="1" align="center"><tr>
        <td align="center">
            <input type="submit" value="Register" />
        </td>
    </tr>
    </table>



</form>
</body>
</html>
