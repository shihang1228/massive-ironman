package com.order;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BuyServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException
    {
        
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException
    {
        String action = req.getParameter("action");
        if("下单".equals(action))
        {
            PrintWriter out = resp.getWriter();
            String foodName = req.getParameter("foodName");
            String foodPrice = req.getParameter("foodPrice");
            String foodPicture = req.getParameter("foodPicture");
            Integer foodNumber = Integer.parseInt(req.getParameter("foodNumber"));
        
            HttpSession session = req.getSession();
            UserVo user = (UserVo)session.getAttribute("user");
            Cart cart = (Cart)session.getAttribute("cart");
        
            if(user != null && foodName !=null && foodNumber != null)
            {
                CarItem carItem = new CarItem();
                carItem.setFoodName(foodName);
                carItem.setFoodPrice(foodPrice);
                carItem.setFoodPicture(foodPicture);
                carItem.setFoodNumber(foodNumber);
            
                if(cart == null)
                {
                    cart = new Cart();
                    session.setAttribute("cart",cart);
                }
                cart.add(carItem);
                out.println("下单成功<br>");
                out.println("<a href=\"?action=coldFoodList\">继续购买</a><br>");
                out.println("<a href=\"" + req.getContextPath() + "/carList\">进入购物车</a><br>");           
            }
            else
            {
                out.println("<a href=\"\">请登录</a>");
            }
        }
    }
    
}






