# spring-boot-handler-interceptor-demo
spring-boot-handler-interceptor-demo

# 내용
스프링 부트 기반 HandlerInterceptor Demo.

# 개발 환경
JDK 11, STS 4.8.1, Spring Boot 2.6.3, Maven 4   

# 설명
상세 설명은 블로그 글을 https://codejcd.tistory.com/19 참고.   

# 테스트
1. Boot DashBoard Start   
2. 아래 4개의 API를 호출하여 각각 결과 값을 비교하여 HandlerInterceptor 동작을 알 수 있음.   
http://localhost:8080/demo/visitor   
http://localhost:8080/demo/user/{id}   
http://localhost:8080/demo/user/{id}/phone   
http://localhost:8080/demo/product/{id}
   
# 참고
https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-handlermapping-interceptor   
https://meetup.toast.com/posts/151   

