public class Ball {
    private final int position; // 로컬변수 할당
    private final int ballNo;

    public Ball(int position, int ballNo) {
        this.position = position; // 값 할당
        this.ballNo = ballNo;
    }

    public BallStatus play(Ball ball) {
        if(ballNo == ball.ballNo) {
            return  BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }
}
