<%--  
  Created by jncc hpf.  
  User: Anyx  
  Date: 12-4-15  
  Time: 下午3:46  
  To change this template use File | Settings | File Templates.  
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title></title>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/myjs.js"></script>
</head>
<body>
	<div>请输入用户：</div>
	<div>
		<form id="subUserForm">
			<input type="text" name="userInfo.id" id="id" /> <input type="text"
				name="userInfo.name" id="name" />
		</form>
	</div>
	<div>
		<input id="addUser" type="button" value="添加" />
		<input id="users" type="button" value="所有用户" />
		<a href="/test/load_allUser_jump.action">所有用户：非异步方式</a>
		<input id="msg" type="button" value="hello" />
		<input id="msgUserInfo" type="button" value="userInfo" />
		<input id="msgUserInfoList" type="button" value="userInfoList" />
		<div data-role="fieldcontain">
			<label for="flip-1">Switch:</label>
			<select name="flip-1" id="flip-1" data-role="slider">
				<option value="off">Off</option>
				<option value="on">On</option>
			</select>
		</div>
	</div>
	<div id="allUser">input_user:</div>
</body>
</html>
