package cn.hncu.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

//POJO + execute() 方法
public class LoginAction {
	private String userName;
	private String password;
	
	public LoginAction() {
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
	
	/////////业务方法/////////
	public String execute() {
		if( userName != null && userName.equals(password) ) {
			return "success";
		}else {
			return "input";
		}
	}
	//自定义方法1
	public String fun1() {
		if( userName != null && userName.equals(password) ) {
			return "success";
		}else {
			return "input";
		}
	}
	//自定义且使用Web环境：即使用HttpServletRequest等
	public void fun2() throws Exception {
		//可以采用 struts提供的模拟容器，入口: ActionContext.getContext();
		ActionContext context = ActionContext.getContext();
		context.getSession(); //模拟的session，并非HttpSession,只是一个容器，把值放进去，他们会帮我们放入真正的session中
		context.getApplication(); //同样时模拟，只是一个容器
		
		////////下面就是我们习惯的Servlet///////
		//技术入口： ServletActionContext 静态类
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		//有了 request 和 response 就可以为所欲为了   
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		request.setAttribute("message", "我是通过ServletActionContext入口进来的");
		request.getRequestDispatcher("/jsps/show.jsp").forward(request, response);;
	}
	
}
