package com.order;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CarListServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException
    {
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        Cart cart = (Cart)session.getAttribute("cart");
        UserVo user = (UserVo)session.getAttribute("user");
        if(user == null)
        {
            out.println("还没有登录！ <a href=\"\">请登录</a>");
            return;
        }
        out.println("<b>" + user.getUserName() + "</b>的购物车<br>");
        if(cart != null)
        {
            forward("carList",req,resp);
        }
        else
        {
            out.println("还没购物车，所以没内容！！！");
        }
    }
    public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException
    {
        
    }
    
    public void forward(String page,HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException
    {
        String jsp = "/WEB-INF/" + page + ".jsp";
        getServletContext().getRequestDispatcher(jsp).forward(req,resp);        
    }
}