package hello.core;

import hello.core.member.MemberRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

import static org.springframework.context.annotation.ComponentScan.*;

@Configuration

// 컴포넌트 스캔을 사용하려면 @ComponentScan을 설정 정보에 붙여준다.
// 기존의 AppConfig와는 다르게 @Bean으로 등록한 클래스가 하나도 없다.
@ComponentScan(
        excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
