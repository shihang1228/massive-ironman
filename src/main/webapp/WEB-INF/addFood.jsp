<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="../../docs-assets/ico/favicon.png">


    <title>网上订餐后台管理</title>

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

    <div class="container">

      <form action="" method="POST" class="form-signin" role="form">
        <h2 align="center"><b>添加菜品</b></h2>
        <label>菜品名字：<input type="text" name="food_name" class="form-control" placeholder="food name" required autofocus></label>
        <label>菜品价格：<input type="text" name="food_price" class="form-control" placeholder="food price" required></label>
        <label>菜品类型：<input type="text" name="food_type" class="form-control" placeholder="food type" required></label>
        <label>菜品图片：<input type="text" name="food_picture" class="form-control" placeholder="food_description" required></label>
        <label>菜品描述：<textarea name="food_description" class="form-control" rows="4"></textarea></label>
        <input type="submit" name="action" class="btn btn-lg btn-primary btn-block" value="添加"/>
        <a href="" name="action" class="btn btn-lg btn-primary btn-block">返回</a>
        
      </form>
      

    </div> <!-- /container -->


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/js/bootstrap.min.js"></script>
  </body>
</html>
