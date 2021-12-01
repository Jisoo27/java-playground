package 추상화;

public class class3 {
    private SmsSender smsSender;
    private kakaoPush kakaoPush;
    private MailService mailSvc;
    private boolean pushEnabled;

    public class3() {
    }

    public void cancel(String ono) {
        if (pushEnabled) {
            kakaoPush.push();
        } else {
            smsSender.sendSms();
        }
        mailSvc.sendMail(); // 요구사항 변경에 따라 주문 취소 코드도 함께 변경 (주문취소처리 자체는 코드가 변하지 않았다.)
    }
}

/*공통점을 도출하면
* 1. SMS 전송
* 2. 카카오톡 보냄
* 3. 이메일 발송
*       =>*/
