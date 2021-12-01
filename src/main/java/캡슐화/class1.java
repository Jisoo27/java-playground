package 캡슐화;

public class class1 {
    if (acc.getMembership() == REGULAR && acc.getExpDate().isAfter(now())) {
        //...정회원 기능
    }

    // 5년후 변경된 코드
    if(acc.getMembership() == REGULAR && (
        (acc.getServiceDate().isAfter(fiveYearAgo) && acc.getExpDate().isAfter(now())) ||
        (acc.getServiceDate().isBefore(fiveYearAgo) && addMonth(acc.getExpDate()).isAfter(now()))
        )
      ) {
        // 정회원 기능
    }

}


