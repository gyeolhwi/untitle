package com.untitle.rest.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.CodeSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LogAspect {

    @Pointcut("@annotation(com.untitle.rest.aspect.Log)")
    public void logPointCut() {
    }

    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        CodeSignature signature = (CodeSignature) proceedingJoinPoint.getSignature();
        log.info(">>>>>>{}<<<<<<", signature.getName()); // 메소드명
        log.info(">>>>>>{}<<<<<<", signature.getParameterNames()); // 매개변수명
        log.info(">>>>>>{}<<<<<<", proceedingJoinPoint.getArgs()); // 객체를 배열로 가지고옴
        Object[] args = proceedingJoinPoint.getArgs();
        for(Object arg : args) {
            log.info(">>>>>>{}<<<<<<", arg);
        }



        Object result = proceedingJoinPoint.proceed();
        return result;
    }
}
