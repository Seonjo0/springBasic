package hello.core.singleton;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {

    @Test
    @DisplayName("스프링 없는 순수 DI Container")
    void pureContainer() {
        AppConfig appConfig = new AppConfig();
        // 호출마다 객체를 생성
        MemberService memberService = appConfig.memberService();
        MemberService memberService1 = appConfig.memberService();

        // 요청 마다 객체가 생성되어 메모리에 축적된다.
        System.out.println("memberService = " + memberService);
        System.out.println("memberService1 = " + memberService1);

        // memberService != memberService1
        assertThat(memberService).isNotSameAs(memberService1);
    }

    @Test
    @DisplayName("싱글톤 패턴을 적용한 객체 사용")
    void singletonServiceTest(){
        SingletonService instance = SingletonService.getInstance();
        SingletonService instance1 = SingletonService.getInstance();

        assertThat(instance).isSameAs(instance1);
        // same : 동일한지
        // eqaul : 동등한지
    }
}
