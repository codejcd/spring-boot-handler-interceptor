package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class HttpInterceptorConfig implements WebMvcConfigurer {

	@Autowired
	@Qualifier("httpInterceptor")
	private HandlerInterceptor handlerInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(handlerInterceptor)
		.addPathPatterns("/demo/user/**")
		.addPathPatterns("/demo/visitor")
		.excludePathPatterns("/demo/product/**");
		
	}
	
}
