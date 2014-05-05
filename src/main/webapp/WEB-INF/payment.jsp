<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ page import="com.order.UserVo"%>
<% UserVo userInfo =(UserVo)request.getAttribute("userInfo");%>
<% String totalPrice = (String)request.getAttribute("totalPrice");%>
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
    <link href="bootstrap-3.0.3/examples/signin/signin.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy this line! -->
    <!--[if lt IE 9]><script src="../../docs-assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    
  </head>

  <body>

    <div class="container">

        <form action="" method="POST" class="form-signin" role="form">
        <p align="right"><%@ include file="showLogInfo.jsp"%></p>
            <table align="center">
            <tr>
                <td align="left"><a href="<%=request.getContextPath()%>/carList"><img src="images/return.png"/></a></td>
                <td><h3 align="center"><b>订单详情</b></h3></td>
                <td align="right"><img src="images/member.png"/></td>
            </tr>
        </table>
            <table>
                <tr>
                    <td><h3><strong>用户名：</strong></h3></td>
                    <td><h3><strong><%=userInfo.getTrueName()%></strong></h3></td>
                </tr>
                <tr>
                    <td><h3><strong>配送地址：</strong></h3></td>
                    <td><h3><strong><%=userInfo.getAddress()%></strong></h3></td>
                </tr>
                <tr>
                    <td><h3><strong>联系电话：</strong></h3></td>
                    <td><h3><strong><%=userInfo.getTelphone()%></strong></h3></td>
                </tr>
                <tr>
                    <td><h3><strong>支付总价：</strong></h3></td>
                    <td><h3><strong><% out.println(totalPrice);%>元</strong></h3></td>
                </tr>
                <tr>
                    <td><h3><strong>付款方式：</strong></h3></td>
                    <td><h3><strong>
                        <select name="payment">
                            <option value="payDelivery">货到付款</option>
                            <option value="payOnLine">在线支付</option></strong></h3>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" name="action" class="btn btn-lg btn-primary btn-block" value="确认支付"/></td>
                </tr>
            </table>
        </form>
        
      

    </div> <!-- /container -->


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/js/bootstrap.min.js"></script>
  </body>
</html>
