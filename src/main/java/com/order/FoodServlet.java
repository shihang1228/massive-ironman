package com.order;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class FoodServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
    {
        forward("addFood",req,resp);        
    }
    
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
    {
        String action = req.getParameter("action");
        if ("添加".equals(action))
        {
            String foodName = req.getParameter("food_name");
            String foodPrice = req.getParameter("food_price");
            String foodType = req.getParameter("food_type");
            String foodPicture = req.getParameter("food_picture");
            String foodDescription = req.getParameter("food_description");
     
            FoodVo food = new FoodVo();
            food.setFoodName(foodName);
            food.setFoodPrice(foodPrice);
            food.setFoodType(foodType);
            food.setFoodPicture(foodPicture);
            food.setFoodDescription(foodDescription);
        
            FoodDao foodDao = new FoodDao();
            foodDao.insertFood(food);
            resp.getWriter().println("恭喜你，添加菜品成功！！！");
            resp.getWriter().println("<a href=\"\">返回首页</a>");
        }
        
    }
    
    public void forward(String page, HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
    {
        String jsp = "/WEB-INF/" + page + ".jsp";
        getServletContext().getRequestDispatcher(jsp).forward(req,resp);
    }
}
