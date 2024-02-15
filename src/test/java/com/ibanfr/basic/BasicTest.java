package com.ibanfr.basic;

import jakarta.inject.Inject;
import org.jboss.weld.junit5.EnableWeld;
import org.jboss.weld.junit5.WeldInitiator;
import org.jboss.weld.junit5.WeldSetup;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@EnableWeld
class BasicTest {

    @WeldSetup
    WeldInitiator weld = WeldInitiator.of(BasicBean.class);

    @Inject
    BasicBean basicBean;

    @Test
    @DisplayName("basicBean should not be null")
    void basicBeanShouldNotBeNull() {

        //then
        assertThat(basicBean).isNotNull();
    }

    @Test
    @DisplayName("should say hello!")
    void should_say_hello() {
        //then
        assertThat(basicBean.sayHello()).isEqualTo("hello!");
    }

}
