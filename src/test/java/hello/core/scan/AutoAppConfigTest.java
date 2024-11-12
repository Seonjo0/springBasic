package hello.core.scan;

import hello.core.AutoAppConfig;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import static org.assertj.core.api.Assertions.*;

public class AutoAppConfigTest {

    @Test
    void basicScan(){
        AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(AutoAppConfig.class);
        MemberService bean = context.getBean(MemberService.class);
        assertThat(bean).isInstanceOf(MemberServiceImpl.class);
    }
}
