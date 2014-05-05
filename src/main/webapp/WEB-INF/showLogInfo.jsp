<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ page import="com.order.UserVo"%>
<%UserVo user = (UserVo)session.getAttribute("user");%>

<p><h4>欢迎您,<b><%=user.getUserName()%></b>! <a href="<%=request.getContextPath()%>/logout">注销</a></h4></p>
