package com.ibanfr.interceptor;


import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@TestInterception
@Interceptor
public class TestInterceptor {

    public static boolean calledBefore = false;
    public static boolean calledAfter = false;


    @AroundInvoke
    public Object interceptedMethod(InvocationContext context) throws Exception {

        System.out.println("*** Intercepted method ***");
        calledBefore = true;
        Object obj = context.proceed();
        calledAfter = true;
        return obj;
    }
}
