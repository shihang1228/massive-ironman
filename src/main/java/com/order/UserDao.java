package com.order;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao
{
    public void insertUser(UserVo user)
    {
        DbManage dbManage = null;
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        String userName = user.getUserName();
        String password = user.getPassword();
        String rePassword = user.getRePassword();
        String trueName = user.getTrueName();
        String sex = user.getSex();
        String address = user.getAddress();
        String telphone = user.getTelphone();
        String mail = user.getMail();
        
        try
        {
            dbManage = dbManage.newInstance();
            String sql = "INSERT INTO member_info(user_name,password,repeat_password,true_name,address,sex,phone_number,mail)"
                        +"VALUES(?,?,?,?,?,?,?,?)";
            pstmt = dbManage.conn.prepareStatement(sql);
            pstmt.setString(1,userName);
            pstmt.setString(2,password);
            pstmt.setString(3,rePassword);
            pstmt.setString(4,trueName);
            pstmt.setString(5,address);
            pstmt.setString(6,sex);
            pstmt.setString(7,telphone);
            pstmt.setString(8,mail);
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
}