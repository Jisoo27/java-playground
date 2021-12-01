public class ValidationUtils {
    public static boolean validNo(int no) {
        if( no >= 1 && no <= 9) {
            return true;
        }
        return false;
    }

}
