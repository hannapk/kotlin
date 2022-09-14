package com.fastcampus.kotlinjava.exception

import java.io.IOException

class KotlinThrow {

    @Throws(IOException::class) // 예외를 전파하고 싶을 때 사용하는 어노테이션
    fun throwIOException() {
        throw IOException("체크드 익셉션인 IOException 발생")
    }

}

fun main() {
    val javaThrow = JavaThrow()
    javaThrow.throwIOException()

    val kotlinThrow = KotlinThrow()
    kotlinThrow.throwIOException()
}

