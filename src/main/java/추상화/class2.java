package 추상화;

public class class2 {
    private SmsSender smsSender;
    private kakaoPush kakaoPush;
    private boolean pushEnabled;

    public void cancel(String ono) {
        if (pushEnabled) {
            kakaoPush.push();
        } else {
            smsSender.sendSms();
        }
    }
}
