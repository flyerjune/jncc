<%--  
  Created by jncc hpf.  
  User: hpf  
  Date: 14-10-15  
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
	</div>
	<br>
	<div id="allUser">input_user:</div>
</body>
</html>
