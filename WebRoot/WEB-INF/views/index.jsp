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
		<title>安盛天平团车在线报案</title>
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="js/layer/skin/default/layer.css" />
		<link rel="stylesheet" type="text/css" href="js/layui-master/build/css/layui.css" />
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/layer/layer.js"></script>
		<style type="text/css">
			body {
				background: #EBEFF2;
			}
			/*导航栏*/
			
			.mynav {
				width: 100%;
				height: 70px;
				line-height: 70px;
				background: white;
				position: relative;
			}
			
			.container {
				width: 90%;
			}
			
			.logo {
				display: inline-block;
			}
			
			ul.function {
				width: 440px;
				left: 50%;
				margin-left: -220px;
				position: absolute;
				display: flex;
				margin-top: -70px;
			}
			
			ul.function li {
				display: inline;
				flex: 1;
				text-align: center;
				font-size: 15px;
				font-weight: 700;
				font-family: "微软雅黑";
			}
			
			.func_item {
				cursor: pointer;
				display: inline-block;
				padding-left: 5px;
				padding-right: 5px;
				height: 40px;
				line-height: 40px;
			}
			/*选中样式*/
			
			.current {
				color: #0E5299;
				border-bottom: solid 3px #0E5299;
			}
		</style>
	</head>

	<body>
		<!--
         	作者：dntchenpeng@163.com
         	时间：2017-04-12
         	描述：导航栏部分
         -->
		<div class="mynav">
			<div class="container">
				<div class="row">
					<span class="logo">
		 				<img src="img/axatp.png"/>
		 				<img src="img/axatp_sys.png" />
		 			</span>
					<ul class="function">
						<li>
							<span class="func_item current">信息维护</span>
						</li>
						<li>
							<span class="func_item">在线报案</span>
						</li>
						<li>
							<span class="func_item">进度查询</span>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<!--
        	作者：dntchenpeng@163.com
        	时间：2017-04-12
        	描述：主体内容
        -->
		<div id="main_cont" class="container" style="margin-top:10px;padding: 0px;margin-bottom: 10px;">
			<iframe id="myiframe" name="myiframe" onload="iFrameHeight()" frameborder="0" scrolling="no" style="width: 100%;border: none;" scrolling="no" src="<%=request.getContextPath()%>/entMain/${entId}" id="main_window"></iframe>
		</div>
		<script type="text/javascript">
			// iframe自适应高度
			function iFrameHeight() {
				var ifm = document.getElementById("myiframe");
				var subWeb = document.frames ? document.frames["myiframe"].document :ifm.contentDocument;
				if (ifm != null && subWeb != null) {
					ifm.height = subWeb.body.scrollHeight;
				}
			}

			$(function() {
 
				// 标记第几个选中
				var noselected = 0;
				// 获取iframe对象
				var $iframecontainer = $("#myiframe");

				/**
				 * 店家导航栏的效果（动态加载内容）
				 */
				$(".function li").hover(function() { // 悬停事件
					$(this).find("span").addClass("current").stop().siblings().find("span.func_item").removeClass("current");
				}).mouseleave(function() { // 鼠标移出事件 
					$(".func_item").removeClass("current");
					$(".function li").eq(noselected).find("span.func_item").addClass("current");
				}).click(function() { // 点击事件
					noselected = $(this).index();
					// 设置页面效果
					$(".func_item").removeClass("current");
					$(".function li").eq(noselected).find("span.func_item").addClass("current");
					// 显示加载效果
					layer.load();
					// 设置动画效果
					setTimeout(function() {
						layer.closeAll('loading');
					}, 700);
					// 开始页面跳转
					if (noselected == "0") { // 信息维护
						$iframecontainer.attr("src", "<%=request.getContextPath()%>/entMain/${entId}");
					} else if (noselected == "1") { // 在线报案
						$iframecontainer.attr("src", "<%=request.getContextPath()%>/onlineReport");
					} else if (noselected == "2") { // 进度查询
						$iframecontainer.attr("src", "<%=request.getContextPath()%>/processQuery");
					}
				});
				 
				 
			});
		</script>
	</body>

</html>
