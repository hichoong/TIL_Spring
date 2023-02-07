package hello.advanced.trace.strategy.code.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 전략을 파라미터로 전달받는 방식
 */

@Slf4j
public class ContextV2 {
    public void excute(Strategy strategy) {
        long startTime = System.currentTimeMillis();
        //비즈니스 로직 실행
        strategy.call(); //전략패턴으로 위임하는 부분
        //비즈니스 로직 종료
        long result = System.currentTimeMillis() - startTime;
        log.info("resultTime = {}", result);
    }
}
