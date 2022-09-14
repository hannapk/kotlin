package com.fastcampus.kotlinjavasrping

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.transaction.annotation.Transactional
import javax.persistence.*

/*
코틀린은 모든 클래스가 디폴트로 final 즉 상속이 불가능하다.
상속을 열어뒀을 때 발생하는 부작용으로 인해 코틀린은 상속이 꼭 필요한 경우에만 적용하도록 open 키워드를 사용해 상속을 허용하도록 지원한다.

spring은 기본적으로 CGLIB 프록시를 사용해서 어노테이션이 붙은 클래스에 대해 프록시 객체로 생성하게 된다.
CGLIB 프록시는 기본적으로 대상 객체를 상속해서 프록시 객체를 생성한다.
코틀린의 클래스는 기본적으로 final 이기 때문에 상속이 불가능해 프록시 객체를 생성할 수 없다.

때문에 이러한 문제를 해결하기 위해 open 키워드를 붙여야 하는데
매번 open 키워드를 붙이는 건 번거롭기 때문에 All-open 컴파일러 플러그인을 제공한다.
그런데 매번 문제가 발생할 때마다 allopen에 추가하기 여럽기 때문에 allopen 플러그인을 래핑한 kotlin-spring 플러그인을 사용하는 것이 편하다.
> @Component, @Transactional, @Configuration, @Controller, @Service, @Repository
 */

@SpringBootApplication
class KotlinJavaSpringApplication


fun main(args: Array<String>) {
    runApplication<KotlinJavaSpringApplication>()
}

@Transactional
class Service


/*
JPA에서 엔티티 클래스를 생성하려면 매개 변수가 없는 기본 생성자가 필요하다.
코틀린은 매개 변수가 없는 기본 생성자를 자동으로 만들어주는 no-arg 컴파일러 플러그인을 제공한다.
JPA를 쓸 경우 Spring 플러그인과 마찬가지로 kotlin-jpa 플러그인을 제공한다.
JPA 플러그인을 사용하면 @Entity, @Embeddable, @MappedSuperclass에 대한 기본 생성자를 자동으로 생성해준다. 
 */

@Entity
@Table
class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,

    @Column
    var name: String?,

    @Column
    var age: Int?,
)