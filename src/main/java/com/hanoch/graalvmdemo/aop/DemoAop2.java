package com.hanoch.graalvmdemo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Aspect
//@Order(1)
@Component
public class DemoAop2 {


    @Pointcut("execution(* com.hanoch.graalvmdemo.web.*.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("before2");
    }

    @After("pointcut()")
    public void after(JoinPoint joinPoint) {
        System.out.println("after2");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before around2");
        Object res = joinPoint.proceed();
        System.out.println("after around2");
        return res;
    }


    @AfterReturning(value = "pointcut()",returning = "o2")
    public void afterReturn(JoinPoint joinPoint,Object o2) throws Throwable {
        System.out.println("afterReturn2 "+o2.getClass());
    }

}
