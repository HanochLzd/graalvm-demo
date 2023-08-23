package com.hanoch.graalvmdemo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect
@Component
//@Order(2)
public class AemoAop3 {


    @Pointcut("execution(* com.hanoch.graalvmdemo.web.*.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("before3");
    }

    @After("pointcut()")
    public void after(JoinPoint joinPoint) {
        System.out.println("after3");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before around3");
        Object res = joinPoint.proceed();
        System.out.println("after around3");
        return res;
    }


    @AfterReturning(value = "pointcut()",returning = "o3")
    public void afterReturn(JoinPoint joinPoint,Object o3) throws Throwable {
        System.out.println("afterReturn3 "+o3.getClass());
    }

}
