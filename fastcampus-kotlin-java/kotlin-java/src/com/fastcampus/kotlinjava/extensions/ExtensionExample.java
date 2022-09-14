package com.fastcampus.kotlinjava.extensions;

public class ExtensionExample {

    public static void main(String[] args) {

        // 코틀린 확장함수는 자바로 변환되면 static 함수로 변환된다.
        // 첫 번째 인자가 확장 대상인 수신자 객체가 된다.

        // 실제로 String 클래스에 메서드가 생성되는 것이 아니라
        // {ClassName} + Kt 이름의 클래스의 메서드로 컴파일 되기 때문에
        // 아래 코드는 컴파일 오류가 발생한다.
        // "ABCD".first();

        MyExtensionsKt.first("ABCD");
        MyExtensionsKt.addFirstChar("ABCD", 'Z');

    }
}
