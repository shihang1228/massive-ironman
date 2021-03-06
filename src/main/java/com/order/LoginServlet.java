package com.order;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;


public class LoginServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
    {
        String action = req.getParameter("action");
                
        if("foodList".equals(action))
        {
            forward("index",req,resp);
        }
        else if("coldFoodList".equals(action))
        {
            FoodDao foodDao = new FoodDao();
            
            ArrayList<FoodVo> foodList = foodDao.coldFoodList();
            req.setAttribute("foodList",foodList);           
            forward("coldFoodList",req,resp);
        }
        else if("hotFoodList".equals(action))
        {
            FoodDao foodDao = new FoodDao();
            
            ArrayList<FoodVo> foodList = foodDao.hotFoodList();
            req.setAttribute("hotFoodList",foodList);
            forward("hotFoodList",req,resp);
        }
        else if("stapleFoodList".equals(action))
        {
            FoodDao foodDao = new FoodDao();
            
            ArrayList<FoodVo> foodList = foodDao.stapleFoodList();
            req.setAttribute("stapleFoodList",foodList);
            forward("stapleFoodList",req,resp);
        }
        else if("foodDetails".equals(action))
        {
            Long pid = Long.valueOf(req.getParameter("foodId"));
            FoodDao foodDao = new FoodDao();
            FoodVo food = foodDao.getFoodById(pid);
            req.setAttribute("food",food);
            forward("foodDetails",req,resp);
            
        }
        else
        {
            forward("login",req,resp);
        }
    }
    
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
    {
        String action = req.getParameter("action");
       
        if("登录".equals(action))
        {
                
            String loginUserName = req.getParameter("username");
            String loginPassword = req.getParameter("password");
            
            UserVo user = new UserVo();
            user.setUserName(loginUserName);
            user.setPassword(loginPassword);
            
            UserDao userDao = new UserDao();
            boolean isLogin = userDao.login(user);
            System.out.println(isLogin);
            if(isLogin)
            {
                HttpSession session = req.getSession();
                session.setAttribute("user",user);
                forward("loginSuccess",req,resp); 
            }
            else 
            {
                
                forward("loginFailed",req,resp);
            }
             
        }
    }
    
    public void forward(String page, HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
    {
        String jsp = "/WEB-INF/" + page + ".jsp";
        getServletContext().getRequestDispatcher(jsp).forward(req,resp);
    }
}
