package com.order;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbManage
{
    static final String jdbcUrl = "jdbc:mysql://localhost/test?" + "user=root" + "&password="+"&useUnicode=true&characterEncoding=utf-8";
    static final String jdbcDriver = "com.mysql.jdbc.Driver";
    
    public Connection conn = null;
    private ResultSet rs = null;
    private PreparedStatement pstmt = null;
    private Statement stmt = null;
    private DbManage()
    {
        
    }
    public static DbManage newInstance() 
    {
        DbManage dbManage = new DbManage();
        try
        {
            dbManage.conn = dbManage.createConnection();
        }
        catch(SQLException ex)
        {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            System.out.println("error");
        }
        return dbManage;
        
    }
    protected void close(AutoCloseable obj) 
    {
        try
        {
            obj.close();
        }
        catch(Exception ex)
        {
            //ignore;
        }        
    }
    
    public void close()
    {
        close(rs);
        rs = null;
        
        close(conn);
        conn = null;
        
        close(pstmt);
        pstmt = null;
        
        close(stmt);
        stmt = null;
        

    }
    protected Connection createConnection() throws SQLException
    {
        try
        {        
            Class.forName(jdbcDriver).newInstance();    
        }
        catch(Exception ex)
        {
            //ignore
        }
        return DriverManager.getConnection(jdbcUrl);
    }
}
