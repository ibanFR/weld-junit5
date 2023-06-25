package com.ibanfr;

import jakarta.inject.Inject;
import org.jboss.weld.junit5.EnableWeld;
import org.jboss.weld.junit5.WeldInitiator;
import org.jboss.weld.junit5.WeldSetup;
import org.junit.jupiter.api.Test;

@EnableWeld
public class FooTest {

    @WeldSetup
    public WeldInitiator weld = WeldInitiator.of(Foo.class);

    @Inject
    Foo foo;

    @Test
    void test(){
        System.out.println(foo.getBar());
    }
}
