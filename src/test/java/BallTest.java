import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    @Test
    void Ball() {
        Ball com = new Ball(1, 4);
        BallStatus status = com.play(new Ball(2 ,4));
        assertThat(status).isEqualTo(BallStatus.BALL);
    }

    @Test
    void nothing() {
        Ball com = new Ball(1, 4);
        BallStatus status = com.play(new Ball(2 ,5));
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }
}
