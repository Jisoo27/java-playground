package 추상화;

public class class4 {
    private boolean pushEnabled;

    public void cancel(String ono) {
        Notifier notifier = getNotifier(); // getNotifier 를 이용해서 notifier를 구하는데
        notifier.notify();
    }

    private Notifier getNotifier() { // 상황에 따라서 알맞은 추상화.Notifier 객체를 생성하도록 구현하였다.
        if (pushEnabled) {
            return new KakaoNotifier();
        } else {
            return new SmsNotifier();
        }
    }
}
