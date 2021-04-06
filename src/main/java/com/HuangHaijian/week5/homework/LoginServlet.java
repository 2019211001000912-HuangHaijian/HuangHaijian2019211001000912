package com.HuangHaijian.week5.homework;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    public Connection con;

    public void init() throws ServletException{

        String driver = getServletContext().getInitParameter("driver");
        String url = getServletContext().getInitParameter("url");
        String username = getServletContext().getInitParameter("username");
        String password = getServletContext().getInitParameter("password");

        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Username = request.getParameter("Username");
        String Password = request.getParameter("Password");

        PrintWriter writer = response.getWriter();

        try {
            System.out.println("con:"+con);
            Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery("select * from usertable where Username='" + Username + "'and Password='" + Password + "'");

            if(rs.next()){
                writer.println("Login Success!!!");
                writer.println("Welcome"+Username);
            }
            else {
                writer.println("Username or Password Error!!!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
