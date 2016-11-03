package com.ktds.common.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class URLIntercepter extends HandlerInterceptorAdapter{
	//클래스로 쓰는 방법과 이름으로 쓰는 방법
	//private Logger logger = LoggerFactory.getLogger(URLIntercepter.class);
	private Logger logger = LoggerFactory.getLogger("intercepter");
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		logger.info("클라이언트가 접속함!");
		logger.info(request.getRemoteAddr());
		
		
		/*System.out.println("클라이언트가 접속함!");
		System.out.println(request.getRemoteAddr());*/
		
		// true를 리턴할 경우 컨트롤러에게 요청을 넘긴다.
		// false를 리천할 경우 컨트롤러에게 요청을 넘기지 않고 응답처리 한다.
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//System.out.println("컨트롤러 실행을 끝마침!");
		logger.debug("컨트롤러 실행을 끝마침!");
	}
}
