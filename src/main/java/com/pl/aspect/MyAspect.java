package com.pl.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    // 配置织入点
    @Pointcut("execution(* com.pl.dao.UserDao.*(..))")
    public void logPointCut() {
    }

    @After("logPointCut()")
    public void doAfler(JoinPoint joinPoint) {
        System.out.println("前置通知：" + joinPoint);
        System.out.println("被植入增强处理的目标方法为：" + joinPoint.getSignature().getName());
    }

    @Before("logPointCut()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("前置通知：" + joinPoint);
        System.out.println("被植入增强处理的目标方法为：" + joinPoint.getSignature().getName());
    }

}

