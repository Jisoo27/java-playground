import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    private Ball com;

    @BeforeEach // 본 어노테이션을 붙인 메서드는 테스트 메서드 이전에 수행된다.
    void setUp() { // 이렇게 공통된 부분을 분리하여 적어주면 각 메서드에서 중복으로 발생하는 부분을 제거할 수 있다.
        com = new Ball(1, 4);
    }

    @Test
    void strike() {
        BallStatus status = com.play(new Ball(1, 4));
        assertThat(status).isEqualTo(BallStatus.STRIKE);
    }


    @Test
    void ball() {
        BallStatus status = com.play(new Ball(2, 4));
        assertThat(status).isEqualTo(BallStatus.BALL);
    }


    @Test
    void nothing() {
        BallStatus status = com.play(new Ball(2, 5));
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }


}
