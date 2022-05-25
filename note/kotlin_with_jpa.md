# JPA Entity 

## `@Id`

kotlin에서 프로퍼티 선언 시 초기화를 반드시 해야 한다.      
→ nullable 하지 않게 선언하면 초기갑승로 null이 아닌 값으로 넣어줘야 한다.    

<br />

* 방법1) 생성자에서 프로퍼티 선언 및 초기화   

```kotlin
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id", nullable = false)
val id: Long
```

❗️문제점   
객체를 생성할 때 id 값을 넣을 수 있다.   

<br />  

* 방법2) 생성자에서는 실제 객체를 생성할 때 필요한 정보만 받고             
정보들을 프로퍼티의 초기값으로 넘겨준다.      

```kotlin
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id", nullable = false)
val id: Long = 0
```

id는 DB 상에서 존재하지 않는 0 으로 초기화시킨다.      
이렇게 설정해도 reflection을 통해 pk 값을 부여 받기 때문에     
DB에 save, select 하는 경우 정상적으로 자기 자신의 pk 값을 부여 받는다.      

<br />
<br />

## `data class`  
`data`는 변경자로서 class 앞에 붙여주면 아래 함수들을 컴파일러가 자동으로 만들어준다.   
* toString
* equals 
* hashCode


> toStirng의 경우 연관 관계 매핑된 엔티티에 접근하면서 Lazy Loading Exception이 발생하거나     
> 양방향 매핑으로 인한 stack overflow가 발생할 가능성이 있다.   


<br />
































































