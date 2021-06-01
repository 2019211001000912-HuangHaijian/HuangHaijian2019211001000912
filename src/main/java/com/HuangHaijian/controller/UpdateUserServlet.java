package com.HuangHaijian.controller;

import com.HuangHaijian.dao.Userdao;
import com.HuangHaijian.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "UpdateUserServlet", value = "/updateUser")
public class UpdateUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO 1. - forward to WEB-INF/views/updateUser.jsp
        request.getRequestDispatcher("WEB-INF/views/updateUser.jsp").forward(request, response);
        // TODO 2. - create a new jsp WEB-INF/views/updateUser.jsp
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // TODO 1 : get all parameters
        // TODO 2 : create a user model
        // TODO 3 : set 6 values into user model
        // TODO 4 : create an object of UserDao
        // TODO 5 : call updateUser() of UserDao for update information
        // TODO 6 : forward to WEB-INF/views/UserInfo.jsp

        String id = request.getParameter("id");
        String Username = request.getParameter("Username");
        String Password = request.getParameter("Password");
        String Email = request.getParameter("Email");
        String Gender = request.getParameter("Gender");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date BirthDate = null;

        try {
            System.out.println(request.getParameter("BirthDate").trim());

            BirthDate = simpleDateFormat.parse(request.getParameter("BirthDate").trim());
        } catch (ParseException e) {
            System.out.println(e);
        }

        User u = new User(Integer.parseInt(id), Username, Password, Email, Gender, BirthDate);
        Userdao userDao = new Userdao();
        try {
            userDao.updateUser((Connection) getServletContext().getAttribute("con"), u);
        } catch (SQLException e) {
            System.out.println(e);
        }
        System.out.println(BirthDate);

        request.getRequestDispatcher("WEB-INF/views/UserInfo.jsp").forward(request, response);
    }
}
