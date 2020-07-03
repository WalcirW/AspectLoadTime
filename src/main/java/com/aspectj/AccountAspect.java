package com.aspectj;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AccountAspect {

    public AccountAspect() {
        System.out.println("Aspects are active!");
    }

    @Pointcut("execution(* Account.*(..))")
    void anyCall() {}

    @Before("anyCall()")
    public void logMethodCalled() {
        System.out.println("Method was called...");
    }

}
