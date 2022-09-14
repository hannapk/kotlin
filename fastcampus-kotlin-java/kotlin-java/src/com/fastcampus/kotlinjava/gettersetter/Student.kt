package com.fastcampus.kotlinjava.gettersetter

import java.time.LocalDate

/*
코틀린의 프로퍼티를 자바 프로퍼티로 변환할 때
 - getter/setter 사용
 - @JvmField 어노테이션 사용
   + 코틀린의 프로퍼티 형식처럼 바로 접근이 가능하다.
 */
class Student {

    @JvmField
    var name: String? = null

    var birthDate: LocalDate? = null

    // val 변수는 java에서 사용할 때 setter을 사용할 수 없다.
    val age: Int = 10

    // var 변수의 setter를 private로 선언하면 내부 클래스에서만 사용 가능
    // private 함수가 클래스 내부에서는 수정이 가능하기 때문에
    // 별도의 외부 접근 함수를 만들거나 내부에서 변경하는 함수를 만드는게 좋다.
    var grade: String? = null
        private set

    // 외부에서 전달받은 grade를 setter를 사용하지 않고 변경
    fun changeGrade(grade:String) {
        this.grade = grade
    }
}