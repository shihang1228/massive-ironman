<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ page import="com.order.FoodVo"%>
<% FoodVo food = (FoodVo)request.getAttribute("food");%>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="../../docs-assets/ico/favicon.png">


    <table align="center">
            <tr>
                <td align="left"><img src="images/return.png"/></td>
                <td><h3 align="center"><b>网上订餐管理系统</b></h3></td>
                <td align="right"><img src="images/member.png"/></td>
            </tr>           
        </table>

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

        <h2 align="center"><b>网上订餐管理系统</b></h2>
        <form action="<%=request.getContextPath()%>/addCart" method="POST">
            <table class="table" contenteditable="false">     
                <tr class="success" align="center">
                    <td><%=food.getFoodName()%></td>
                </tr>
                <tr class="info" align="center">
                    <td>
                        <img src="images/<%=food.getFoodPicture()%>" width: 150px; height: 150px;/>
                    </td>
                </tr>
                <tr class="warning" align="center">
                    <td>￥<%=food.getFoodPrice()%> × 
                
                    <select name="foodNumber">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                        <option value="9">9</option>
                        </select>
                    </td>
                </tr>
                <tr class="error">
                    <td><input type="submit" name="action" class="btn btn-lg btn-primary btn-block" value="下单"/>
                    <input type="hidden" name="foodName" value="<%=food.getFoodName()%>"/>
                    <input type="hidden" name="foodPrice"  value="<%=food.getFoodPrice()%>"/>
                    <input type="hidden" name="foodPicture" value="<%=food.getFoodPicture()%>"/>
                    </td>
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
