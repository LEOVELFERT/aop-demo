package com.leo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Aspect
public class StudentAspect {

    private static final Logger log = LoggerFactory.getLogger(StudentAspect.class);

    @Before(value = "execution(* com.leo.controller.StudentController.*(..))")
    public void beforeAdvice(JoinPoint joinPoint){
        String currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        log.info("Entered into the {} at time {}", joinPoint.getSignature(), currentTime);
    }
}
