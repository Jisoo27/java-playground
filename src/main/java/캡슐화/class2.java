package 캡슐화;

public class class2 {
    public boolean hasRegularPermission() {
        return membership == REGULAR &&
                expDate.isAfter(now())
			);
    }

if(acc.hasRegularPermission()) {
	...정회원 기능
    }

    //변경된 코드
    public class class2 {

        public boolean hasRegularPermission() {
            return membership == REGULAR &&
                    ( expDate.isAfter(now()) ||
                            (
                                    serviceDate.isBefore(fiveYearAgo()) &&
                                            addMonth(expDate).isAfter(now())
                            )
                    );
        }

if(acc.hasRegularPermission()) {
	...정회원 기능
        }
}
