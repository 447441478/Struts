package cn.hncu.show;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor{
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
	}

	@Override
	public void init() {
		System.out.println("拦截器初识化...");
	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
//		ServletActionContext  使用它 可以进行req、resp 自定义。
		ServletActionContext.getRequest().setAttribute("message", "你没有登录...");
		System.out.println("前面拦拦");
		String res = actionInvocation.invoke();
		System.out.println("后面拦拦");
		return res;
	}

}
