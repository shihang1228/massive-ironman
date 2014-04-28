package com.order;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import java.io.IOException;

public class ContentTypeFilter implements Filter
{
    static final String contentType = "text/html";
    public void init(FilterConfig filterConfig) throws ServletException
    {
        
    }
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException,ServletException
    {
        resp.setContentType(contentType);
        chain.doFilter(req,resp);
    }
    public void destroy()
    {
        
    }
    
}
