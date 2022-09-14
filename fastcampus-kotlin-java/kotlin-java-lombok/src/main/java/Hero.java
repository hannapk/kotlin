import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@EqualsAndHashCode
@ToString
public class Hero {

    /*
    (어노테이션 프로세싱은 컴파일 단계에서 동적으로 코드를 생성, 변경해주는 단계)
    코틀린 컴파일 > 자바 컴파일 > 어노테이션 프로세싱 순서로 실행되기 때문에
    롬복은 코틀린에서 정상적으로 작동하지 않는다.

    [해결 방법: 롬복을 제거해야 한다.]
    1) 롬복을 제거하고 IDE의 자동 생성 기능을 사용해야 한다. > HeroDelombok.java
    2) 코틀린으로 마이그레이션 하는 것 > HeroKt.kt

    롬복을 사용하는 클래스는 주로 데이터 관련 클래스이다.
    data class 자체가 toString(), equals() 함수를 제공해주기 때문에 코틀린으로 마이그레이션 하는 방식을 더 추천한다.
     */

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private int age;

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}