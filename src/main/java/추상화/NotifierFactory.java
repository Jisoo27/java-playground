package 추상화;

public interface NotifierFactory { // 사용할 대상 접근도 추상화
    Notifier getNotifier();

    static NotifierFactory instance() {
        return new DefaultNotifierFactory();
    }
}


/*추상 타입을 이용하는 이유 : 주문 취소 로직은 그대로 유지하면서 통지하는 방식을 바꿀 수 있게 해주기 때문에
* 추상화 결과 : 추상화 결과 : 사용 대상 변경 유연함*/

/*추상화는 의존 대상이 변경하는 시점에 :
* 추상화 -> 추상 타입 증가 -> 복잡도 증가
* - 아직 존재하지 않는 기능에 대한 이른 추상화는 주의 :
*   잘 못된 추상화 가능성, 복잡도만 증가
* - 실제 변경 , 확장이 발생할 대 추상화 시도
* - 추상화를 잘 하려면 ?
* => 구현을 한 이유가 무엇 때문인지 생각해야 한다. */
