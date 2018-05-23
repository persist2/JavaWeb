package me.web.context;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
* WebContext主要是用来存储当前线程中的HttpServletRequest和HttpServletResponse
* 当别的地方需要使用HttpServletRequest和HttpServletResponse，就可以通过requestHodler和responseHodler获取
**/
public class WebContext {
	public static ThreadLocal<HttpServletRequest> requestHodler = new ThreadLocal<>();
	public static ThreadLocal<HttpServletResponse> responseHodler = new ThreadLocal<>();
	
	public HttpSession getSession() {
		return requestHodler.get().getSession();
	}
	
	public ServletContext getServletContext() {
		return requestHodler.get().getSession().getServletContext();
	}
	
	public HttpServletRequest gerRequest() {
		return requestHodler.get();
	}
	
	public HttpServletResponse getResponse() {
		return responseHodler.get();
	}
}