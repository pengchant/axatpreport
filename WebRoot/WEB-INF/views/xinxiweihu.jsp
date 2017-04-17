<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<link rel="stylesheet" type="text/css" href="css/common.css" />
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
			
			#searchbtn {
				margin-top: 14px;
				width: 110px;
				height: 34px;
				border-radius: 20px;
				background: url(img/search_nor.png) no-repeat 100% center;
				padding-left: 42px;
			}
			
			span.ck {
				width: 32px;
				display: inline-block;
			}
			
			a.seedetail {
				color: #5F9AD6;
			}
			/*页脚*/
			
			.tab-footer {
				height: 40px;
				line-height: 40px;
				position: absolute;
				bottom: -40px;
				width: 100%;
				background: white;
			}
			/*页脚*/
			
			.redirect_part {
				width: 280px;
				height: 40px;
				line-height: 40px;
				padding-top: 6px;
				padding-left: 25px;
				float: left;
				display: flex;
			}
			
			.opbtn {
				width: 80px;
				text-align: center;
				display: inline-block;
				margin-top: -10px;
			}
			
			.paged_part {
				float: right;
				margin-right: 20px;
			}
			
			.paged_part li {
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
				<form action="<%=request.getContextPath()%>/entMain/${entId}" id="searchform">
				<div class="col-md-10" style="height: 60px;">
					<div class="seach-content">
						<div class="search-item">
							<input type="text" name="policy.LicensePlate" class="myinput" placeholder="车牌号" value="${policy.licensePlate }"/>
						</div>
						<div class="search-item">
							<input type="text" name="policy.insuredName" class="myinput" placeholder="车主姓名" value="${policy.insuredName }"/>
						</div>
						<div class="search-item">
							<input type="text" name="policy.PrimaryPhone" class="myinput" placeholder="联系电话" value="${policy.primaryPhone }"/>
						</div>
						<div class="search-item">
							<div id="searchbtn" class="layui-btn" onclick="searchform.submit()">搜索</div>
						</div>
					</div>
				</div>
				<input type="hidden" id="pageCurrentPage" name="page.currentPage" value="${page.currentPage }"/>
				</form>
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
						<th><input type="checkbox" id="tb_checkall" name="" lay-skin="primary" lay-filter="allChoose">&nbsp;全选</th>
						<th>车牌号码</th>
						<th>车主姓名</th>
						<th>联系方式</th>
						<th>保单信息</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${entPolicyList}" var="policy">
							<tr value="${policy.entId }">
							<td><input type="checkbox" name="policycheckbox" lay-skin="primary"><span class="ck"></span></td>
							<td>${policy.licensePlate }</td>
							<td>${policy.insuredName }</td>
							<td>${policy.primaryPhone }</td>
							<c:if test="${!empty policy.voluntaryPolicyNumber }">
								<td>${policy.voluntaryPolicyNumber }</td>
							</c:if>
							<c:if test="${empty policy.voluntaryPolicyNumber }">
								<td>${policy.ctplPolicyNumber }</td>
							</c:if>
							<td>
								<a href="javascript:void(0);" class="seedetail" value="${policy.entId }">查看详情</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<!--
            	作者：dntchenpeng@163.com
            	时间：2017-04-12
            	描述：数据页脚部分
            -->
			<div class="tab-footer">
				<!-- 全选的部分 -->
				<span class="redirect_part">
            		 <input type="checkbox" name="" id="ft_ckall" lay-filter="allChoose1" title="全选" lay-skin="primary" />
            		 <a href="javascript:void(0);" class="opbtn" onclick="deletePolicy()">删除</a>
            		 <a href="javascript:void(0);" class="opbtn" id="additem" >添加</a>
            	</span>
				<!-- 页面跳转的部分 -->
				<ul class="paged_part">
					<li>
						<a href="javascript:void(0);" onclick="prevPage()">上一页</a>
					</li>
					<li>|</li>
					<li>
						<a href="javascript:void(0);" onclick="nextPage()">下一页</a>
					</li>
					<li>
						&nbsp;&nbsp;第<span id="nowPage">1</span>页/共<span id="maxPage">2</span>页&nbsp;&nbsp;
					</li>
					<li>
						跳转到
					</li>
					<li>
						<input type="text" style="width:40px;" id="aimPage"/>
					</li>
					<li>
						页
					</li>
					<li>
						<input type="button" value="GO" onclick="turnPage()"/>
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
			layui.use('form', function() {
				var $ = layui.jquery,
					form = layui.form();
				//全选
				form.on('checkbox(allChoose)', function(data) {
					var child = $(data.elem).parents('table').find('tbody input[type="checkbox"]');
					child.each(function(index, item) {
						item.checked = data.elem.checked;
					});
					form.render('checkbox');
				});
				form.on('checkbox(allChoose1)', function(data) {
					var child = $(data.elem).parents('.tab-footer').prev('table').find('tbody input[type="checkbox"]');
					console.log(child.length+".");
					child.each(function(index, item) {
						item.checked = data.elem.checked;
					});
					form.render('checkbox');
				});
			});

			// 文档加载完毕
			$(function() {
				// 模板
				var mubanstr = ["<div style=\"width: 100%;padding:20px;\">",
					"			<input type=\"text\" lay-verify=\"title\" autocomplete=\"off\" placeholder=\"请输入车牌号\" class=\"layui-input\">",
					"			<br />",
					"			<input type=\"text\"   lay-verify=\"title\" autocomplete=\"off\" placeholder=\"请输入发动机号\" class=\"layui-input\">",
					"			<br />",
					"			<button class=\"layui-btn layui-btn-normal\" style=\"width:100%;background:#5F9AD6;\">确定</button>",
					"		</div>"
				].join("");

				// 添加
				$("#additem").click(function() {
					// 先关闭所有的
					layer.closeAll(); 
					layer.open({
						type: 1,
						title: "添加信息",
						area: ['300px', '230px'],
						shade: 0,
						content: mubanstr
					});
				});
				// 关闭弹框layer.closeAll(); 
			});
			function deletePolicy(){
				var idList="";
				var checkbox=$("input[name='policycheckbox']:checked");
				for(var i=0;i<checkbox.length;i++){
					var Id = $(checkbox[i]).parents("tr").attr("value");
					if(i<checkbox.length-1){
						idList += Id +",";
					}else{
						idList += Id;
					}
				}
				if(idList==''){
					alert("请选择要删除的保单");
					return false;
				}
				if( !confirm('确认要删除选择的保单么？')){
					return false;
				}
				var url="<%=request.getContextPath()%>/deletePolicy";
				$.ajax({
					type:"post",
					url:url,
					data: {"policyList":$.trim(idList)},
					dataType:"json",
					success:function(data){
						if(data.flag==false){
							alert(data.message);
						}else{
							alert(data.message);
							$("#searchform").submit();
						}
					}
				});
			}
			function prevPage(){
				var currentPage=$("input[name='page.currentPage']").val();
				$("#pageCurrentPage").val(parseInt(currentPage-1));
				$("#searchform").submit();	
			}
			function nextPage(){
				var currentPage=$("input[name='page.currentPage']").val();
				$("#pageCurrentPage").val(parseInt(currentPage+1));
				$("#searchform").submit();	
			}
			function turnPage(){
				var page=$("#aimPage").val();
				if (/^\d+$/.test(page) == false) {
					return;
				}
				if (page < 1) {
					page = 1;
				}
				var maxPage=$("#maxPage").text();
				if(page>maxPage){
					page=maxPage;
				}
				$("#pageCurrentPage").val(parseInt(page));
				$("#searchform").submit();	
			}
		</script>
	</body>

</html>