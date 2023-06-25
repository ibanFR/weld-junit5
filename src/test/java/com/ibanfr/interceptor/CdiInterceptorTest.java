package com.ibanfr.interceptor;

import jakarta.inject.Inject;
import org.jboss.weld.junit5.auto.AddBeanClasses;
import org.jboss.weld.junit5.auto.AddEnabledInterceptors;
import org.jboss.weld.junit5.auto.EnableAutoWeld;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


@EnableAutoWeld
@AddBeanClasses(FooBean.class)
@AddEnabledInterceptors(TestInterceptor.class)
public class CdiInterceptorTest {


    @Inject
    FooBean fooBean;


    @Test
    @DisplayName("should intercept bean method")
    void should_intercept_bean_method() {
        //given
        System.out.println(fooBean.sayHello());

        assertThat(TestInterceptor.calledBefore).isTrue();
        assertThat(TestInterceptor.calledAfter).isTrue();
    }
}
