<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html> 
	<head>
		<base href="<%=basePath%>">
		<meta charset="utf-8" />
		<meta name="renderer" content="webkit">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>安盛天平团车在线报案-登录</title>
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="js/layer/skin/default/layer.css" media="all">
		<link rel="stylesheet" type="text/css" href="js/layui-master/build/css/layui.css"/>
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/layer/layer.js"></script>
		<style type="text/css">
			
			/*body{
				background: #F8F8F8;
			}*/
			 
			.alignspan {
				width: 100%;
				height: 80px;
			}
			
			.maincontent {
				height: 500px; 
				position: relative;
				padding-left: 0px;
			}
			
			.loginbtn{
				width:100%;
				height:60px;
				line-height: 60px;
				font-size:20px;
				position: absolute;
				bottom:0px;
			}
			
			.logintitle{
				width:220px;
				height:38px;
				display: inline-block;
				margin-top:20px;
			}
			
			.loginform{
				width:75%;  
				border: solid 1px #F8F8F8;
				margin:0 auto;
				margin-top: 130px;
			}
			
			.input-ly-group{
				width: 100%;
				height:40px;
				line-height: 30px;
				margin:5px 0px 5px 0px;
				/**/
				display: flex;
			}
			
			.input-item{
				border: none;
				background-color: #F8F8F8;
				float:left; 
				line-height: 40px;
				flex: 5;
			}
			
			.shrot-icon{
				margin-top: 5px;
				width:30px;
				height:30px; 
				display: inline-block;
				float: left;
				flex: 1;
			}
			
			.y-group{
				border-bottom: solid 1px #D6D6D6;
				float: left;
				margin-left: 10px;
				display: flex;
				flex: 10;
			}
			
			.haibao{
				background: url(img/hb.png);
				background-size: 100% 100%;
			}
		</style> 
	</head>

	<body>
		<div class="container">
			<div class="row alignspan"></div>
			<div class="row" style="background-color: #F8F8F8;">
				<!--背景图片-->
				<div class="col-md-8 maincontent haibao"> 
				</div>
				<div class="col-md-4 maincontent">
					<div style="width:100%;text-align: center;">
						<img src="img/logo.png" class="logintitle" />
						<div class="loginform">
							<div class="input-ly-group">
								<span class="shrot-icon" style="background: url(img/l_account.png) 100% no-repeat;"></span>
								<div class="y-group">
									<input type="text" name="entCode" placeholder="账号" class="input-item"/>
								</div>															
							</div>	
							<div class="input-ly-group">								
								<span class="shrot-icon" style="background:url(img/l_pass.png) 100% no-repeat;"></span>
								<div class="y-group">
									<input type="password" name="entPssword" placeholder="密码" class="input-item"/>
								</div>															
							</div>	
							<div class="input-ly-group">
								<span class="shrot-icon"></span>
								<div class="y-group">
									<input type="text" placeholder="验证码" class="input-item"/>
									<img src="img/validate.png" style="flex:2;cursor:pointer;float: left;margin-top: 5px;width:55px;height:29px;" />
								</div>
							</div>	
						</div>
					</div>
					<div style="width: 100%;clear: both;"></div>
					<button type="button" id="login" class="layui-btn layui-btn-normal loginbtn" style="background:#5F9AD6;">登录</button>
				</div>
			</div>
			<div class="row alignspan"></div>
		</div>
		<!-- 这里为js代码部分 -->
		<script type="text/javascript"> 
			$(function(){
				layer.load(); 
				// 关闭加载
				setTimeout(function(){
					layer.closeAll('loading');
				},500);
				 
				if($(document).width()<500){
					// 隐藏
					$(".haibao").hide();
				}
				
				// 登录
				$("#login").click(function(){
					//window.location.href="<%=request.getContextPath()%>/main";
					var entCode=$("input[name='entCode']").val();
					if(entCode==undefined||entCode==null||entCode==''){
						alert("请输入账号");
						return;
					}
					var entPassword=$("input[name='entPssword']").val();
					if(entPassword==undefined||entPassword==null||entPassword==''){
						alert("请输入密码");
						return;
					}
					var url="<%=request.getContextPath()%>/entLogin";
					$.ajax({
						type: "POST",
				    	url: url, 
				    	data: {"entCode":$.trim(entCode),"password":$.trim(entPassword)},
				   		dataType:"json",
				    	success:function(data){
				    		console.log(data);
				    		if(data.flag==false){
				    			alert(data.message);
				    		}else{
				    			window.location.href="<%=request.getContextPath()%>/main/"+data.entId;
				    		}
				    	}
					});
				});
			});
		</script>
	</body>

</html>