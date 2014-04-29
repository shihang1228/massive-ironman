package com.order;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FoodDao
{
    public void insertFood(FoodVo food)
    {
        DbManage dbManage = null;
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try
        {
            dbManage = dbManage.newInstance();
            String sql = "INSERT INTO food_list(food_name,food_price,food_type,food_picture,food_description) VALUES(?,?,?,?,?)";
            pstmt = dbManage.conn.prepareStatement(sql);
            pstmt.setString(1,food.getFoodName());
            pstmt.setString(2,food.getFoodPrice());
            pstmt.setString(3,food.getFoodType());
            pstmt.setString(4,food.getFoodPicture());
            pstmt.setString(5,food.getFoodDescription());
            pstmt.execute();
            System.out.println(sql);
        }
        catch(SQLException ex)
        {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            System.out.println("error");
        }
        finally
        {
            dbManage.close();
        }
    }
    
    public ArrayList<FoodVo> coldFoodList()
    {
        DbManage dbManage = null;
        PreparedStatement pstmt = null;
        Connection conn = null;
        ResultSet rs = null;
        FoodVo food = null;
        ArrayList<FoodVo> foodList = new ArrayList<FoodVo>();
        
        try
        {
            dbManage = dbManage.newInstance();
            String sql = "SELECT * FROM food_list where food_type=?";
            pstmt = dbManage.conn.prepareStatement(sql);
            pstmt.setString(1,"凉菜");
            rs = pstmt.executeQuery();
            System.out.println(sql);
            while(rs.next())
            {
                food = new FoodVo();
                food.setFoodName(rs.getString("food_name"));
                food.setFoodPrice(rs.getString("food_price"));
                food.setFoodDescription(rs.getString("food_description"));
                food.setFoodPicture(rs.getString("food_picture"));

                foodList.add(food);
            }
        }
        catch(SQLException ex)
        {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            System.out.println("error");
        }
        finally
        {
            dbManage.close();
        }
        return foodList;
        
    }
    
    
}