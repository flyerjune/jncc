package nuaa.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UserService us = new UserService();


	public String addUser() {
		/*
		 * userInfo = new UserInfo(); userInfo.setId(7); userInfo.setName("张7");
		 */

		// 如果是异步提交json格式，必须先在js中对提交的表单form进行序列化
		// var params = $("subUserForm").serialize();
		us.addUser(userInfo);
		System.out.println("comehere!!!!! ohyeah");
		return "ADD_SUCCESS";
	}


	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	private UserInfo userInfo;
}
