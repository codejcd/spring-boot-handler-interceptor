package com.example.demo.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class HttpInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("[preHandle]");
		
		try {
		 	String reqUri= request.getRequestURI();
		 	if (reqUri.startsWith("/demo/user/")) {
		 		throw new Exception("사용이 중지된 API 입니다.");
		 	}
		 	
		} catch(Exception e) {
		 	String result = getResponse(e.getMessage(), HttpStatus.OK);
			response.setCharacterEncoding("UTF-8");
			response.setContentType("application/json;charset=utf-8");
			response.getWriter().write(result);
			return false;
		} 
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		System.out.println("[postHandle]");
		
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("[afterCompletion]");
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	
	
	private String getResponse(String msg, HttpStatus httpStatus) throws Exception {
	 	ResponseEntity<?> responseEntity = new ResponseEntity<>(msg, httpStatus);
	 	ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(responseEntity);
	}
	
}
