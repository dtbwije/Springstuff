package org.java.aspectj;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class HijackBeforeClass implements MethodBeforeAdvice {
    public void before(Method method, Object[] args, Object target) {
        System.out.println("HijackBeforeMethod : Before Method");

    }
}
