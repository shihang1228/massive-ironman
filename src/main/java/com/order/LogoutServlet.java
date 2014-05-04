package com.order;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import javax.servlet.ServletException;

public class LogoutServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException
    {
        if(req.getRequestURI().endsWith("/logout"))
        {
            logout(req,resp);
        }
        
    }
    public void logout(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException
    {
        HttpSession session = req.getSession();
        session.removeAttribute("user");
        resp.sendRedirect(req.getContextPath() + "/login");
    }
} 