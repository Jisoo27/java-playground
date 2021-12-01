package 추상화;

public class class1 {
    private SmsSender smsSender;

    public void cancel(String ono) {
        smsSender.sendSms();
    }
}
