package com.order;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PaymentServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException
    {
        
    }
    
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException
    {
        String action = req.getParameter("action");
        if("支付订单".equals(action))
        {
            String totalPrice = req.getParameter("totalPrice");
            req.setAttribute("totalPrice",totalPrice);
            HttpSession session = req.getSession();
            UserDao userDao = new UserDao();
            UserVo user = (UserVo)session.getAttribute("user");
            String userName = user.getUserName();
            UserVo userInfo = userDao.userInfo(userName);
            req.setAttribute("userInfo",userInfo);            
            forward("payment",req,resp);
        }
    }
    
    public void forward(String page, HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException
    {
        String jsp = "/WEB-INF/" + page + ".jsp";
        getServletContext().getRequestDispatcher(jsp).forward(req,resp);
    }
}
