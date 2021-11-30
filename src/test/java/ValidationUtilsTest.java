import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ValidationUtilsTest {

    @Test
    @DisplayName("야구_숫자_1_9_검증")
    void 야구_숫자_1_9_검증() { // 경계값을 가지고 테스트 하는 것이 중요하다. 가장 적은 테스트 데이터를 가지고 검증할 수 있는 것이 좋은 테스트이다.
        assertThat(ValidationUtils.validNo(9)).isTrue();
        assertThat(ValidationUtils.validNo(1)).isTrue();
        assertThat(ValidationUtils.validNo(0)).isFalse();
        assertThat(ValidationUtils.validNo(10)).isFalse();
    }
}
