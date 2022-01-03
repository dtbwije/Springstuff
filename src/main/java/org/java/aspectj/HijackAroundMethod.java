package org.java.aspectj;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class HijackAroundMethod implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        if("public void org.java.aspectj.CustomerService.printURL()".equals(invocation.getMethod().toGenericString())) {
            System.out.println("Running url method before the method");
        } else if("public java.lang.Integer org.java.aspectj.CustomerService.printAge()".equals(invocation.getMethod().toGenericString())) {
            System.out.println("Running only before");
        }
        Object result = invocation.proceed();

        if("public void org.java.aspectj.CustomerService.printName()".equals(invocation.getMethod().toGenericString())) {
            System.out.println("Running print Name After");
        } else if( "public void org.java.aspectj.CustomerService.printURL()".equals(invocation.getMethod().toGenericString())) {
            System.out.println("Printing around");
        }

        return result;
    }
}
