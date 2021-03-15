package com.HuangHaijian.week2.homework;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        //when client request method is GET - here - inside doGet()
        //we want to send Hello to client
        //we need to write Hello in response
        //get writer - java.io
        PrintWriter writer = response.getWriter();
        writer.println("Name : Huang Haijian");
        writer.println("ID : 2019211001000912");
        Date date = new Date();
        writer.println("Date and Time " + date.toString());//that all
        //next we need to tell about this servlet to tomcat - how ? - web.xml

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response){

    }
}
