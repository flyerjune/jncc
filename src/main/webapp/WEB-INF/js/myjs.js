$(document).ready(
function() {

$("#addUser").click(
	function() {
		// 必须先对提交表单数据数据进行序列化，采用jQuery的serialize()方法
		var params = $("#subUserForm").serialize();
		$.ajax({
			url : 'test/add_user.action',
			type : 'post',
			data : params,
			dataType : 'json',
			success : function(data) {
				/*
				 * $.each(data.userList, function(i, value){
				 * $("#allUser").append("<div>输出了：id:"+value.id+",
				 * name: "+value.name+"</div>"); });
				 */
				$(data.userList).each(
						function(i, value) {
							$("#allUser").append(
									"<div>输出了：id:" + value.id
											+ ", name: "
											+ value.name
											+ "</div>");
							});

				}
			});
		});

$("#users").click(
	function() {
		$.ajax({
			url : 'test/load_allUser.action!adduser',
			type : 'post',
			data : "{}",
			dataType : 'json',
			success : function(data) {
				/*
				 * $.each(data.userList, function (i, value) {
				 * $("#allUser").append("<div>输出了：id:" +
				 * value.id + ", name: " + value.name + "</div>");
				 * });
				 */
				$(data.userList).each(
						function(i, value) {
							$("#allUser").append(
									"<div>输出了：id:" + value.id
											+ ", name: "
											+ value.name
											+ "</div>");
								});

					}
				});
			});
});