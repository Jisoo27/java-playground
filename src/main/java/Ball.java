import java.util.Objects;

public class Ball {
    private final int position; // 로컬변수 할당
    private final int ballNo;

    public Ball(int position, int ballNo) {
        this.position = position; // 값 할당
        this.ballNo = ballNo;
    }

    public BallStatus play(Ball ball) {
        if(this.equals(ball)) {
            return BallStatus.STRIKE;
        }

        if (ball.matchBallNo(ballNo)) {
            return  BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private boolean matchBallNo(int ballNo) { // 해당하는 객체에 메세지 보내기(?)
        return this.ballNo == ballNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return position == ball.position && ballNo == ball.ballNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, ballNo);
    }
}
