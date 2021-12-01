package 추상화;

public class IotTimer extends Timer implements Rechargeable {
    public void charge() {
        IotTimer it = new IotTimer();
        it.start();
        it.stop();

        Timer t = it; // timer 타입에 할당
        t.start();
        t.stop();

        Rechargeable r = it; // 추상화.Rechargeable 타입에 할당
        r.charge();
    }
}

/*iotTimer 클래스는 추상화.Timer class 와 추상화.Rechargeable 인터페이스를 상속중이다.
* 따라서 iotTimer 객체는 timer 타입도 되고 , 추상화.Rechargeable 타입도 된다.
* */


/*추상화 : 데이터나 프로세스등을 의미가 비슷한 개념이나 의미 있는 표현으로 정의하는 과정
* 두 가지 방식의 추상화 : 특정한 성질, 공통 성질 (일반화)
* 간단한 예: DB의 USER 테이블 : 아이디, 이름 , 이메일
* Money 클래스 : 통화, 금약
* 프린터 : HP MXXX, 삼성 SL-M2XXX
* GPU : 지포스, 라데온
*
* 타입 추상화 : 구현을 추상화 할 때 사용한다.
* 여러가지의 구현클래스가 공통점이 있을 때 그 클래스를 대표하는 상위 타입 도출
* 흔히 인터페이스 타입으로 추상화
* 추상화 타입과 구현은 타입 상속으로 연결
*
* 추상 타입을 상속하고 있는 클래스에서 실제 구현을 제공하게 된다.
* 구현을 제공하는 클래스를 콘크리트 클래스라고 표현.
* 콘크리트 클래스에서 추상 타입을 도출하면 추상 타입을 이용하여 프로그래밍을 할 수 있게 된다.
*
* 추상 타입 사용에 따른 이점 : 유연함
* - 콘크리트 클래스를 직접사용하면 */