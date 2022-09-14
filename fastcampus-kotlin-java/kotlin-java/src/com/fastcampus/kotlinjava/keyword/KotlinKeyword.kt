package com.fastcampus.kotlinjava.keyword

/*
자바에서는 문제가 없는데 코틀린에서는 예약어인 단어가 있다.
이와 같은 문제는 (`) 로 해결할 수 있다.
 */

enum class CountryCodeKotlin {
    kr, jp, us, `do`;
}


fun main() {
    val javaKeyword = JavaKeyword()

    javaKeyword.`in`

    javaKeyword.`is`
}