package com.HuangHaijian.week3.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

//automatic -new --> servlet
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//request come here- <from method=post>
        //get parameter from request
        String Username=request.getParameter("Username");//name of input type
        String Password=request.getParameter("Password");
        String Email=request.getParameter("Email");
        String sex=request.getParameter("sex");
        String Birthday=request.getParameter("Birthday");

        PrintWriter writer= response.getWriter();
        writer.println("Username:"+Username);
        writer.println("Password:"+Password);
        writer.println("Email:"+Email);
        writer.println("sex:"+sex);
        writer.println("Birthday:"+Birthday);
        writer.close();

    }
}
