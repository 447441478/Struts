package cn.hncu.login;

import com.opensymphony.xwork2.ActionSupport;

//POJO + execute() 方法
public class LoginAction2 extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	
	public LoginAction2() {
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
	
	//校验数据
	@Override
	public void validate() {
		System.out.println("开始校验数据！");
		if( userName == null || userName.trim().length()==0 ) {
			//只要 在业务方法执行前  FieldError 中有数据，业务方法就不会执行，直接被拦截了。
			addFieldError("userName", "用户名不能为空！"); 
		}
		if(  password == null || password.trim().length()==0  ) {
			//只要 在业务方法执行前  FieldError 中有数据，业务方法就不会执行，直接被拦截了。
			addFieldError("password", "密码不能为空！");
		}
		System.out.println("数据校验完毕！");
	}
	
	/////////业务方法/////////
	public String execute() {
		System.out.println("开始业务了。。。");
		if( userName != null && userName.equals(password) ) {
			return "success";
		}else {
			return "input";
		}
	}
	
}
