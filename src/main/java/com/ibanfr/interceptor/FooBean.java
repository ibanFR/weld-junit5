package com.ibanfr.interceptor;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class FooBean {

    @TestInterception
    public String sayHello(){
        return "hello!";
    }

}
