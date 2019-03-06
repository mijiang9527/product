<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>产品查询</title>
</head>
<body>
	<div style="margin: 20px 0;"></div>
	<div class="easyui-layout" style="width: 100%; height: 350px;">
		<div data-options="region:'north'" style="height: 50px">
			<form id="searchForm" method="post">
				<table>
					<tr>
						<td>产品编号:</td>
						<td><input id="id" name="id" class="easyui-textbox"
							data-options="prompt:'输入产品编号'" style="width: 100%; height: 32px"></td>
						<td><a href="#" class="easyui-linkbutton"
							data-options="iconCls:'icon-search'" style="width: 80px"
							onclick="onSearch()">查询</a></td>
					</tr>
				</table>
			</form>

		</div>


		<div data-options="region:'center',title:'产品列表',iconCls:'icon-ok'">
			<table id="dg" class="easyui-datagrid"
				data-options="border:false,singleSelect:true,fit:true,fitColumns:true">

                
			</table>
		</div>
	</div>
</body>
</html>