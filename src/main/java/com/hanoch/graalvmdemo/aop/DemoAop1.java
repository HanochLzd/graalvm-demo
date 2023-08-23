package com.hanoch.graalvmdemo.aop;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Objects;


/**
 * 2023-08-23 15:40:19 [http-nio-8080-exec-1] INFO  c.h.g.filter.TimestampFilter - requestId: 3cf3a496-bf38-47b7-b9cd-2e6990cefa43, requestUrl: /hello.
 * before around3
 * before3
 * before around1
 * before1
 * before around2
 * before2
 * 2023-08-23 15:40:19 [http-nio-8080-exec-1] INFO  c.h.graalvmdemo.web.HelloController - Media Manager Service starting.
 * afterReturn2 class java.lang.String
 * after2
 * after around2
 * afterReturn1 class java.lang.String
 * after1
 * after around1
 * afterReturn3 class java.lang.String
 * after3
 * after around3
 * 2023-08-23 15:40:19 [http-nio-8080-exec-1] INFO  c.h.g.filter.TimestampFilter - requestId: 3cf3a496-bf38-47b7-b9cd-2e6990cefa43, it takes 26.61 ms.
 */
@Aspect
@Component
//@Order(2)
public class DemoAop1 {


    @Pointcut("execution(* com.hanoch.graalvmdemo.web.*.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("before1");
    }

    @After("pointcut()")
    public void after(JoinPoint joinPoint) {
        System.out.println("after1");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before around1");
        Object res = joinPoint.proceed();
        System.out.println("after around1");
        return res;
    }


    @AfterReturning(value = "pointcut()",returning = "o1")
    public void afterReturn(JoinPoint joinPoint,Object o1) throws Throwable {
        System.out.println("afterReturn1 "+o1.getClass());
    }

}
