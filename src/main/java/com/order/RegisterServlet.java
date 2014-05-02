package com.order;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;


public class RegisterServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException
    {
        forward("register",req,resp);
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
    {
        String action = req.getParameter("action");
        if("注册".equals(action))
        {
            UserVo user = new UserVo();
            user.setUserName(req.getParameter("username"));
            user.setPassword(req.getParameter("password"));
            user.setRePassword(req.getParameter("re_password"));
            user.setTrueName(req.getParameter("truename"));
            user.setAddress(req.getParameter("address"));
            user.setSex(req.getParameter("sex"));
            user.setTelphone(req.getParameter("telphone"));
            user.setMail(req.getParameter("mail"));
            UserDao userDao = new UserDao();
            userDao.insertUser(user);
            
            forward("registerSuccess",req,resp);
        }
    }
    public void forward(String page, HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException
    {
        String jsp = "/WEB-INF/" + page + ".jsp";
        getServletContext().getRequestDispatcher(jsp).forward(req,resp);
        
    }
}