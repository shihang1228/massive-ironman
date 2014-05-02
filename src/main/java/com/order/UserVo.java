package com.order;

public class UserVo
{
    private Long userId;
    private String userName;
    private String password;
    private String rePassword;
    private String trueName;
    private String address;
    private String sex;
    private String telphone;
    private String mail;
    
   public Long getUserId()
    {
        return userId;
    }
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }
    
    public String getUserName()
    {
        return userName;
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getRePassword()
    {
        return rePassword;
    }
    public void setRePassword(String rePassword)
    {
        this.rePassword = rePassword;
    }
    public String getTrueName()
    {
        return trueName;
    }
    public void setTrueName(String trueName)
    {
        this.trueName = trueName;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getSex()
    {
        return sex;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }
    public String getTelphone()
    {
        return telphone;
    }
    public void setTelphone(String telphone)
    {
        this.telphone = telphone;
    }
    public String getMail()
    {
        return mail;
    }
    public void setMail(String mail)
    {
        this.mail = mail;
    }
}