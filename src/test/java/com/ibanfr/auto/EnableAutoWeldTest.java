package com.ibanfr.auto;


import com.ibanfr.Foo;
import jakarta.inject.Inject;
import org.jboss.weld.junit5.auto.AddBeanClasses;
import org.jboss.weld.junit5.auto.EnableAutoWeld;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;


@EnableAutoWeld
@AddBeanClasses(Foo.class)
public class EnableAutoWeldTest {
    
    
    @Inject
    Foo foo;

    @Test
    @DisplayName("should inject foo")
    void should_inject_foo() {
        //given

        //when

        //then
        assertThat(foo).isNotNull();
    }
}
