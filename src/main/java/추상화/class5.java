package 추상화;

public class class5 {
    /* 추상화를 한번 더 할 경우*/
    public void cancel(String ono) {
        //주문 취소 처리
        Notifier notifier = NotifierFactory.instance().getNotifier();
        notifier.notify();
    }
}
