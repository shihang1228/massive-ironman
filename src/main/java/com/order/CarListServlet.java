package com.order;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
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
            for(CarItem carItem : cart.list())
            {
                out.println("菜品名：" + carItem.getFoodName()
                            + "数量：" + carItem.getFoodNumber() 
                            + "价格：" + carItem.getFoodPrice() 
                            + "图片：" + carItem.getFoodPicture());
            }
        }
        else
        {
            out.println("还没购物车，所以没内容！！！");
        }
    }
    public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException
    {
        
    }
}