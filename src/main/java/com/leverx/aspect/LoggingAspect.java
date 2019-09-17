package com.leverx.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Aspect
@Component
public class LoggingAspect {

    private static Logger LOGGER = Logger.getLogger(LoggingAspect.class.getName());

    @Before("execution(* com.leverx.service..*.*(..))")
    public void log(ProceedingJoinPoint thisJoinPoint) {

        String args = Arrays.stream(thisJoinPoint.getArgs())
                .map(a -> a.toString())
                .collect(Collectors.joining(","));
        LOGGER.info("before " + thisJoinPoint.toString() + ", args=[" + args + "]");
    }
}