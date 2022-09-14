package com.fastcampus.kotlinjava.jvmstatic;

public class JvmStaticExample {

    public static void main(String[] args) {

        // 매번 중간에 불필요한 문자가 들어가 불편하다.
        String hello = HelloClass.Companion.hello();
        HiObject.INSTANCE.hi();

        // 자바와 상호운용 하는 경우 @JvmStatic 어노테이션을 함수에 선언하면
        // 중간에 Companion이나 INSTANCE 없이 바로 클래스 지시자를 통해서 함수에 접근할 수 있다.
        String hello = HelloClass.hello();
        System.out.println(hello);
        
        String hi = HiObject.hi();
        System.out.println(hi);

    }
}
