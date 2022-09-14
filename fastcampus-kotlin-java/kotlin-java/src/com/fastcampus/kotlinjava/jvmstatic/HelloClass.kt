package com.fastcampus.kotlinjava.jvmstatic

class HelloClass {

    companion object {

        @JvmStatic
        fun hello() = "hello!"

    }
}

object HiObject {

    @JvmStatic
    fun hi() = "hi!"
}

fun main() {
    // 클래스 지시자로 함수 사용 가능
    val hello = HelloClass.hello()
    println(hello)

    val hi = HiObject.hi()
    println(hi)

    // 자바와 상호운용 하는 프로젝트에서 오브젝트 함수를 사용할 때 위 방식과는 조금 다르게 사용한다. > JvmStaticExample.java

}