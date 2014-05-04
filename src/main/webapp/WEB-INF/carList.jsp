<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ page import="com.order.Cart,com.order.CarItem"%>
<% Cart cart = (Cart)session.getAttribute("cart");%>
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

        <h2 align="center"><b>购物车</b></h2>
        <table class="table" contenteditable="false">
        
        <%for(CarItem carItem : cart.list())
         {%>        
            <tr class="success">
                <td rowspan="4" align="right">
                    <img src="images/<%=carItem.getFoodPicture()%>" width: 150px; height: 150px;/>
                </td>
                <td align="left"><strong>菜品名字：</strong></td>
                <td><%=carItem.getFoodName()%></td>
            </tr>
            <tr class="info">
                <td align="left"><strong>菜品价格：</strong></td>
                <td><%=carItem.getFoodPrice()%></td>
            </tr>
            <tr class="warning">
                <td align="left"><strong>订购数量：</strong></td>
                <td><%=carItem.getFoodNumber()%></td>
            </tr>
            <tr class="success">
            <td><strong>总价：</strong></td>
            <td><% int price = (carItem.getFoodPrice().intValue() * carItem.getFoodNumber().intValue());out.print(price);%></td>
            </tr>
          <%}%>
            <tr class="error">
            <td align="right" colspan="3"><h3><strong>合计：</strong></h3></td>
            </tr>
        </table>
        <a href="?action=coldFoodList" name="action" class="btn btn-lg btn-primary btn-block">支付订单</a>
    </div> <!-- /container -->


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/js/bootstrap.min.js"></script>
  </body>
</html>
