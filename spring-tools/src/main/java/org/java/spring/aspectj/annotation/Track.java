package org.java.spring.aspectj.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Track {
    @Pointcut("execution(* Operation.m*(..))")
    public void k(){ // pointcut name

    }

    @Before("k()")//applying pointcut on before advice
    public void myAdvice(JoinPoint jp){
        System.out.println("Additional concern");
        //System.out.println("Method Signature :"+ jp.getSignature());
    }


}
