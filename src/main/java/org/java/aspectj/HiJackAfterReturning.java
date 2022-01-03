package org.java.aspectj;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class HiJackAfterReturning implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) {
        System.out.println("HijackBeforeMethod : afterReturning "+
                returnValue);
    }
}
