package com.fastcampus.kotlinjava.gettersetter

fun main() {

    // 자바 스타일
    // 자바의 getter/setter를 바로 사용할 수 있지만 비추천
    val person = Person()
    person.setName("토니스타크")
    person.setAge(44)
    person.setAddress("스타크타워")

    println(person.getName())
    println(person.getAge())


    // 코틀린 스타일
    // 프로퍼티를 사용해서 접근 가능
    val person2 = Person()
    person2.name = "토니스타크"
    person2.age = 44

    println(person2.name)
    println(person2.age)

    // 프로퍼티가 없음에도 게터 메서드라면 프로퍼티처럼 사용 가능하다.
    println(person2.uuid)

    // 코틀린 컴파일러는 getter/setter를 자동으로 생성해줄 때 getter/setter이 전부 있어야 자동 생성해준다.
    // 세터가 있음에도 컴파일 오류가 발생한다.
    //person2.address = ""

    // address를 가져오는 메서드를 게터가 아닌 my로 했기때문에 세터도 생성되지 않는다
    person2.setAddress("스타크타워")
    person2.myAddress()
}