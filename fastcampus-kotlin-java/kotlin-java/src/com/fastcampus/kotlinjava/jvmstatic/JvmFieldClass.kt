package com.fastcampus.kotlinjava.jvmstatic

class JvmFieldClass {

    companion object {
        @JvmField
        val id = 1234

        const val CODE = 1234
    }
}

object JvmFieldObject {
    @JvmField
    val name = "tony"

    const val FAMILY_NAME = "stark" // 코틀린도 const 키워드로 상수 제공한다.
}

fun main() {

    // Jvm 필드로 정적 프로퍼티 호출하기
    // 코틀린은 기본적으로 static 프로퍼티를 지원하지 않는다.
    // 그러나 동반 객체(companion object)와 object 키워드로 정의된 싱글톤 객체를 사용하면
    // static 프로퍼티와 유사하게 사용할 수 있다.
    // 자바에서 사용법은 조금 다르다. > JvmFieldExample.java

    val id = JvmFieldClass.id

    val name = JvmFieldObject.name
}