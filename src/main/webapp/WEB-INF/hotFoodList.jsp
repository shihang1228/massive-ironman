<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.ArrayList,com.order.FoodVo"%>
<% ArrayList<FoodVo> foodList = (ArrayList<FoodVo>)(request.getAttribute("hotFoodList"));%>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="../../docs-assets/ico/favicon.png">


    <title>网上订餐管理系统</title>

    <!-- Bootstrap core CSS -->
    <link href="bootstrap-3.0.3/dist/css/bootstrap.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="bootstrap-3.0.3\examples\signin/signin.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy this line! -->
    <!--[if lt IE 9]><script src="../../docs-assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    
  </head>

  <body>

    <div class="container" width="640" height="960">
    <p align="right"><%@ include file="showLogInfo.jsp"%></p>
        
        <table align="center">
            <tr>
                <td align="left"><a href="login?action=foodList"><img src="images/return.png"/></a></td>
                <td><h3 align="center"><b>热菜列表</b></h3></td>
                <td align="right"><img src="images/member.png"/></td>
            </tr>
        </table>
        <table class="table" contenteditable="false">
       
        <%for(int i = 0;i<foodList.size();i++)
        {
            FoodVo food = foodList.get(i);%>        
            <tr class="success">
                <td rowspan="3" align="right">
                    <img src="images/<%=food.getFoodPicture()%>" width: 150px; height: 150px;/>
                </td>
                <td align="left"><strong>菜品名字：</strong></td>
                <td><a href="?action=foodDetails&foodId=<%=food.getFoodId()%>"><%=food.getFoodName()%></a></td>
            </tr>
            <tr class="info">
                <td align="left"><strong>菜品价格：</strong></td>
                <td><%=food.getFoodPrice()%></td>
            </tr>
            <tr class="warning">
                <td align="left"><strong>菜品描述：</strong></td>
                <td><%=food.getFoodDescription()%></td>
            </tr>
            <%}%>
            
        </table>
    </div> <!-- /container -->


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/js/bootstrap.min.js"></script>
  </body>
</html>
