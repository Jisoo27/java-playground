package 추상화;

public class DefaultNotifierFactory implements NotifierFactory {
    private boolean pushEnabled;

    public Notifier getNotifier() {
        if(pushEnabled) return new KakaoNotifier();
        else return new SmsNotifier();
    }
}
