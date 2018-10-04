package cn.hncu.login;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginActionValidator extends ActionSupport {
	private String userName;
	private String password;
	
	public LoginActionValidator() {
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String execute() throws Exception {
		if( userName != null && userName.startsWith("hncu")) {
			return "success";
		}else {
			return "input";
		}
	}
	
}
