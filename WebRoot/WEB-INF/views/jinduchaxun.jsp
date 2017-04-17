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
		<title>安盛天平团车在线报案-信息维护</title>
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="js/layer/skin/default/layer.css" />
		<link rel="stylesheet" href="js/layui-master/build/css/layui.css" />
		<link rel="stylesheet" type="text/css" href="css/common.css"/>
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/layer/layer.js"></script>
		<script type="text/javascript" src="js/layui-master/build/layui.js"></script>
		<style type="text/css">
			body {
				background: #EBEFF2;
			}
			
			.seach-content {
				width: 100%;
				display: flex;
			}
			
			.search-item {
				flex: 1;
			}
			/*输入框*/ 
			.myinput {
				width: 80%;
				height: 30px;
				line-height: 30px;
				margin-top: 15px;
				background: #F5F5F7;
				border: none;
				border-radius: 20px;
				padding-left: 13px;
			}
			
			/*查询按钮*/
			#searchbtn {
				margin-top: 14px;
				width: 110px;
				height: 34px;
				border-radius: 20px;
				background: url(img/search_nor.png) no-repeat 100% center;
				padding-left: 42px;
			}
			
			/*导出excel按钮*/
			#excelbtn{
				margin-top: 14px;
				width: 110px;
				height: 34px;
				border-radius: 20px;
				background: url(img/ecel_nor.png) no-repeat 100% center;
				padding-left: 42px;
			}
			
			span.ck{
				width:32px;
				display: inline-block; 	 		
			}
			
			a.seedetail{
				color:#5F9AD6;
			}
			
			/*页脚*/
			.tab-footer{
				height:40px;
				line-height: 40px;
				position: absolute;
				bottom:-40px;
				width: 100%;
				background: white;
			}
			
			/*页脚*/
			.redirect_part{ 
				width:280px;
				height: 40px;
				line-height: 40px;
				padding-top: 6px;
				padding-left: 25px; 
				float: left;
				display: flex;
			}
			
			.opbtn{
				width:80px;
				text-align: center;
				display: inline-block;
				margin-top:-10px;				
			}
			
			.paged_part{ 
				float: right;	
				margin-right: 20px;			
			}
			
			.paged_part li{
				display: inline-block;
				line-height: 24px;
			}
		</style>
	</head>

	<body>
		<!--
         	作者：dntchenpeng@163.com
         	时间：2017-04-12
         	描述：搜索条
         -->
		<div class="container" style="background:white;width: 100%;height:60px;height: 60px;">
			<div class="row">
				<div class="col-md-10" style="height: 60px;">
					<div class="seach-content">
						<div class="search-item">
							<input type="text" class="myinput" placeholder="车牌号" />
						</div>
						<div class="search-item">
							<input type="text" class="myinput" placeholder="车主姓名" />
						</div>
						<div class="search-item">
							<input type="text" class="myinput" placeholder="理赔进度" />
						</div>
						<div class="search-item">
							<button id="searchbtn" class="layui-btn">搜索</button>							
						</div>
					</div>
				</div>
				<div class="col-md-2">
					<button id="excelbtn" class="layui-btn">导出</button>
				</div>
			</div>
		</div>
		<!--
         	作者：dntchenpeng@163.com
         	时间：2017-04-12
         	描述：主要的数据部分
         -->
		<div class="layui-form" style="min-height: 433px;background: white;position: relative;">
			<table class="layui-table" lay-skin="nob">
				<colgroup>
					<col width="50">
					<col width="150">
					<col width="150">
					<col width="200">
					<col width="100">
					<col width="100">
					<col>
				</colgroup>
				<thead>
					<tr style="background-color: #6FA5DB;color:white;text-align: center;border:solid 1px #5F9AD6;">						 
						<th>序号</th>
						<th>车牌号码</th>
						<th>车主姓名</th>
						<th>理赔进度</th>
						<th>赔付金额</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>0001</td>
						<td>苏F2132</td>
						<td>王尼玛</td>
						<td>呵呵</td>
						<td>未知</td>
						<td>
							<a href="javascript:void(0);" class="seedetail">查看详情</a>
						</td>
					</tr> 
					<tr>
						<td>0001</td>
						<td>苏F2132</td>
						<td>王尼玛</td>
						<td>呵呵</td>
						<td>未知</td>
						<td>
							<a href="javascript:void(0);" class="seedetail">查看详情</a>
						</td>
					</tr> 
					<tr>
						<td>0001</td>
						<td>苏F2132</td>
						<td>王尼玛</td>
						<td>呵呵</td>
						<td>未知</td>
						<td>
							<a href="javascript:void(0);" class="seedetail">查看详情</a>
						</td>
					</tr>
					<tr>
						<td>0001</td>
						<td>苏F2132</td>
						<td>王尼玛</td>
						<td>呵呵</td>
						<td>未知</td>
						<td>
							<a href="javascript:void(0);" class="seedetail">查看详情</a>
						</td>
					</tr>
					<tr>
						<td>0001</td>
						<td>苏F2132</td>
						<td>王尼玛</td>
						<td>呵呵</td>
						<td>未知</td>
						<td>
							<a href="javascript:void(0);" class="seedetail">查看详情</a>
						</td>
					</tr>
					<tr>
						<td>0001</td>
						<td>苏F2132</td>
						<td>王尼玛</td>
						<td>呵呵</td>
						<td>未知</td>
						<td>
							<a href="javascript:void(0);" class="seedetail">查看详情</a>
						</td>
					</tr>
					<tr>
						<td>0001</td>
						<td>苏F2132</td>
						<td>王尼玛</td>
						<td>呵呵</td>
						<td>未知</td>
						<td>
							<a href="javascript:void(0);" class="seedetail">查看详情</a>
						</td>
					</tr>
					<tr>
						<td>0001</td>
						<td>苏F2132</td>
						<td>王尼玛</td>
						<td>呵呵</td>
						<td>未知</td>
						<td>
							<a href="javascript:void(0);" class="seedetail">查看详情</a>
						</td>
					</tr>
					<tr>
						<td>0001</td>
						<td>苏F2132</td>
						<td>王尼玛</td>
						<td>呵呵</td>
						<td>未知</td>
						<td>
							<a href="javascript:void(0);" class="seedetail">查看详情</a>
						</td>
					</tr>
					<tr>
						<td>0001</td>
						<td>苏F2132</td>
						<td>王尼玛</td>
						<td>呵呵</td>
						<td>未知</td>
						<td>
							<a href="javascript:void(0);" class="seedetail">查看详情</a>
						</td>
					</tr>
				</tbody>
			</table>
			<!--
            	作者：dntchenpeng@163.com
            	时间：2017-04-12
            	描述：数据页脚部分
            -->
            <div class="tab-footer">
            	 
            	<!-- 页面跳转的部分 -->
            	<ul class="paged_part">
            		<li>
            			<a href="javascript:void(0);">上一页</a>
            		</li>
            		<li>|</li>
            		<li>
            			<a href="javascript:void(0);">下一页</a>
            		</li>
            		<li>
            			&nbsp;&nbsp;第1页/共2页&nbsp;&nbsp;
            		</li>
            		<li>
            			跳转到
            		</li>
            		<li>
            			<input type="text" style="width:40px;"/>
            		</li>
            		<li>
            			页
            		</li>
            		<li>
            			<input type="button" value="GO"/>     
            		</li>
            	</ul>
            </div>
		</div>

		<!--
        	作者：dntchenpeng@163.com
        	时间：2017-04-12
        	描述：这里写js部分
        -->
		<script type="text/javascript">
			  
			// 文档加载完毕
			$(function() {
				 
			});
		</script>
	</body>

</html>
