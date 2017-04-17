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
		<title>安盛天平团车在线报案-在线报案</title>
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="js/layer/skin/default/layer.css" />
		<link rel="stylesheet" href="js/layui-master/build/css/layui.css" />
		<link rel="stylesheet" type="text/css" href="css/common.css" />
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/layer/layer.js"></script>
		<script type="text/javascript" src="js/layui-master/build/layui.js"></script>
		<script type="text/javascript" src="js/resize.js"></script>
		<style type="text/css">
			body {
				background: #EBEFF2;
			}
			/*保单的每一项*/
			
			.baoan-item {
				background: white;
				margin-bottom: 40px;
			}
			/*报案标题*/
			
			.baoan-num {
				color: #FFD9B8;
				font-weight: 800;
				font-size: 60px;
				float: left;
			}
			/*标题切换*/
			
			.baoan-btngroup {
				margin-left: 30px;
				width: 260px;
				float: left;
				margin-top: 20px;
				display: flex;
				text-align: center;
				height: 50px;
				line-height: 50px;
			}
			
			.title-item {
				flex: 1;
				cursor: pointer;
				font-size: 17px;
				font-weight: 800;
			}
			/*标题字体*/
			
			.t_span {
				display: inline-block;
				padding-left: 5px;
				padding-right: 5px;
			}
			/*选中*/
			
			.t_selected {
				color: #5F9AD6;
				border-bottom: solid 4px #5F9AD6;
			}
			
			.infotb {
				width: 100%;
				text-align: center;
				background: white;
			}
			
			.infotb tr {
				border-top: solid 1px #EDEDED;
				height: 40px;
				line-height: 40px;
			}
			/*body下的内容*/
			
			.tinfo-bodyer td {
				padding: 10px;
				line-height: 50px;
			}
			
			.longtext {
				width: 160px;
				height: 50px;
			}
			
			.myselect {
				width: 140px;
			}
			/*对方信息先隐藏*/
			
			.otherinfo {
				display: none;
			}
			
			.sbtn {
				width: 120px;
			}
			/*向右浮动*/
			
			.right {
				float: right;
			}
		</style>
	</head>

	<body>
		<!--
        	作者：dntchenpeng@163.com
        	时间：2017-04-12
        	描述：在线报案的具体内容
        -->
		<div class="baoan-item">
			<div class="baoan-title">
				<span class="baoan-num">01</span>
				<div class="baoan-btngroup">
					<div class="title-item">
						<span class="t_span t_selected">单车事故</span>
					</div>
					<div class="title-item">
						<span class="t_span">双车事故</span>
					</div>
				</div>
			</div>
			<div class="baoan-body">
				<!--
                	作者：dntchenpeng@163.com
                	时间：2017-04-12
                	描述：人员信息
                -->
				<table class="infotb">
					<tr class="info-theader">
						<td>
							<img src="img/cp.png" />&nbsp;车牌
						</td>
						<td>
							<img src="img/cz.png" />&nbsp;车主
						</td>
						<td>
							<img src="img/lxfs.png" />&nbsp;联系方式
						</td>
						<td>
							<img src="img/bdh.png" />&nbsp;保单号
						</td>
						<td>
							<img src="img/sfss.png" />&nbsp;是否有人受伤
						</td>
						<td>
							<img src="img/sgqk.png" />&nbsp;事故情况
						</td>
						<td>
							<img src="img/cxsj.png" />&nbsp;出险时间
						</td>
						<td>
							<img src="img/cxdd.png" />&nbsp;出险地点
						</td>
						<td>
							<img src="img/bz.png" />&nbsp;备注
						</td>
					</tr>
					<tr class="tinfo-bodyer">
						<td>
							苏F13223
						</td>
						<td>
							李小龙
						</td>
						<td>
							2134324
						</td>
						<td>
							453254325432543
						</td>
						<td>
							否
						</td>
						<td>
							<select name="interest" class="layui-select myselect">
								<option value=""></option>
								<option value="0">写作</option>
								<option value="1" selected="">阅读</option>
								<option value="2">游戏</option>
								<option value="3">音乐</option>
								<option value="4">旅行</option>
							</select>
						</td>
						<td>
							2017/03/01 13:45:08
						</td>
						<td>
							<input type="text" name="phone" autocomplete="off" class="layui-input longtext">
						</td>
						<td>
							<input type="text" name="phone" autocomplete="off" class="layui-input longtext">
						</td>
					</tr>
				</table>
				<!--
                	作者：dntchenpeng@163.com
                	时间：2017-04-12
                	描述：对方信息
                -->
				<table class="infotb otherinfo">
					<tr class="info-theader">
						<td style="width:130px;">
							<img src="img/dfcp.png" />&nbsp;对方车牌
						</td>
						<td style="width:130px;">
							<img src="img/dfcz.png" />&nbsp;对方车主
						</td>
						<td style="width:130px;">
							<img src="img/dfdh.png" />&nbsp;对方电话
						</td>
						<!--不填，但是请保留-->
						<td></td>
					</tr>
					<tr class="tinfo-bodyer">
						<td>
							苏F13223
						</td>
						<td>
							李小龙
						</td>
						<td>
							2134324
						</td>
						<!--不填，但是请保留-->
						<td>
						</td>
					</tr>
				</table>
			</div>
		</div>

		<div class="baoan-item">
			<div class="baoan-title">
				<span class="baoan-num">02</span>
				<div class="baoan-btngroup">
					<div class="title-item">
						<span class="t_span t_selected">单车事故</span>
					</div>
					<div class="title-item">
						<span class="t_span">双车事故</span>
					</div>
				</div>
			</div>
			<div class="baoan-body">
				<!--
                	作者：dntchenpeng@163.com
                	时间：2017-04-12
                	描述：人员信息
                -->
				<table class="infotb">
					<tr class="info-theader">
						<td>
							<img src="img/cp.png" />&nbsp;车牌
						</td>
						<td>
							<img src="img/cz.png" />&nbsp;车主
						</td>
						<td>
							<img src="img/lxfs.png" />&nbsp;联系方式
						</td>
						<td>
							<img src="img/bdh.png" />&nbsp;保单号
						</td>
						<td>
							<img src="img/sfss.png" />&nbsp;是否有人受伤
						</td>
						<td>
							<img src="img/sgqk.png" />&nbsp;事故情况
						</td>
						<td>
							<img src="img/cxsj.png" />&nbsp;出险时间
						</td>
						<td>
							<img src="img/cxdd.png" />&nbsp;出险地点
						</td>
						<td>
							<img src="img/bz.png" />&nbsp;备注
						</td>
					</tr>
					<tr class="tinfo-bodyer">
						<td>
							苏F13223
						</td>
						<td>
							李小龙
						</td>
						<td>
							2134324
						</td>
						<td>
							453254325432543
						</td>
						<td>
							否
						</td>
						<td>
							<select name="interest" class="layui-select myselect">
								<option value=""></option>
								<option value="0">写作</option>
								<option value="1" selected="">阅读</option>
								<option value="2">游戏</option>
								<option value="3">音乐</option>
								<option value="4">旅行</option>
							</select>
						</td>
						<td>
							2017/03/01 13:45:08
						</td>
						<td>
							<input type="text" name="phone" autocomplete="off" class="layui-input longtext">
						</td>
						<td>
							<input type="text" name="phone" autocomplete="off" class="layui-input longtext">
						</td>
					</tr>
				</table>
				<!--
                	作者：dntchenpeng@163.com
                	时间：2017-04-12
                	描述：对方信息
                -->
				<table class="infotb otherinfo">
					<tr class="info-theader">
						<td style="width:130px;">
							<img src="img/dfcp.png" />&nbsp;对方车牌
						</td>
						<td style="width:130px;">
							<img src="img/dfcz.png" />&nbsp;对方车主
						</td>
						<td style="width:130px;">
							<img src="img/dfdh.png" />&nbsp;对方电话
						</td>
						<!--不填，但是请保留-->
						<td></td>
					</tr>
					<tr class="tinfo-bodyer">
						<td>
							苏F13223
						</td>
						<td>
							李小龙
						</td>
						<td>
							2134324
						</td>
						<!--不填，但是请保留-->
						<td>
						</td>
					</tr>
				</table>
			</div>
		</div>

		<!--最后的提交按钮-->
		<p style="width: 100%;height:50px;line-height:50px;margin-top: 50px;text-align: center;margin-bottom: 80px;">
			<span style="display:inline-block;width:280px;text-align: center;">
				<button class="layui-btn sbtn" id="addnew">添加</button>&nbsp;&nbsp;&nbsp;&nbsp;
				<button class="layui-btn layui-btn-normal sbtn">提交</button>
			</span>
		</p>

		<!--
        	作者：dntchenpeng@163.com
        	时间：2017-04-12
        	描述：这里写js
        -->
		<script type="text/javascript">
			$(function() { 

				var mubanstr = ["<ul style=\"width: 100%;padding:20px;positon:relative;\">",
					"			<li>",
					"				<span class=\"left\">",
					"					<img src=\"img/bdh.png\"/>",
					"					保单号xxx					",
					"				</span>",
					"				<span class=\"right\">",
					"					<input type=\"checkbox\" lay-filter=\"allChoose\" title=\"全选\" lay-skin=\"primary\" />",
					"				</span>",
					"			</li>",
					"			<li>",
					"				<span class=\"left\">",
					"					<img src=\"img/bdh.png\"/>",
					"					保单号xxx					",
					"				</span>",
					"				<span class=\"right\">",
					"					<input type=\"checkbox\" lay-filter=\"allChoose\" title=\"全选\" lay-skin=\"primary\" />",
					"				</span>",
					"			</li>",
					"			<li>",
					"				<span class=\"left\">",
					"					<img src=\"img/bdh.png\"/>",
					"					保单号xxx					",
					"				</span>",
					"				<span class=\"right\">",
					"					<input type=\"checkbox\" lay-filter=\"allChoose\" title=\"全选\" lay-skin=\"primary\" />",
					"				</span>",
					"			</li>",
					"			<li>",
					"				<span class=\"left\">",
					"					<img src=\"img/bdh.png\"/>",
					"					保单号xxx					",
					"				</span>",
					"				<span class=\"right\">",
					"					<input type=\"checkbox\" lay-filter=\"allChoose\" title=\"全选\" lay-skin=\"primary\" />",
					"				</span>",
					"			</li>",
					"			<li>",
					"				<span class=\"left\">",
					"					<img src=\"img/bdh.png\"/>",
					"					保单号xxx					",
					"				</span>",
					"				<span class=\"right\">",
					"					<input type=\"checkbox\" lay-filter=\"allChoose\" title=\"全选\" lay-skin=\"primary\" />",
					"				</span>",
					"			</li>",
					"		</ul>",
					"<p style=\"text-align:center;margin-top:30px;\">",
					"<button class=\"layui-btn sbtn\" id=\"addnew\">取消</button>&nbsp;&nbsp;&nbsp;&nbsp;",
					"<button class=\"layui-btn layui-btn-warm sbtn\">确定</button>",
					"</p>",
				].join("");

				// 定义效果
				$(".baoan-btngroup .title-item").click(function() {
					flag = $(this).index();
					// 设置样式
					$(this).parents(".baoan-btngroup").find(".t_span").removeClass("t_selected");
					$(this).find(".t_span").addClass("t_selected");
					if (flag == "0") {
						$(this).parents(".baoan-item").find(".otherinfo").hide();
					} else {
						$(this).parents(".baoan-item").find(".otherinfo").show();
					}
				});

				// 点击添加
				$("#addnew").click(function() {
					layer.closeAll();
					layer.open({
						type: 1,
						title: "",
						area: ['350px', '360px'],
						shade: 0,
						content: mubanstr
					});
				});
			});
		</script>
	</body>

</html>
 