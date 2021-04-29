package org.techtown.kotlinandroid.kotlin

fun main(array: Array<String>) {

    // 인스턴스가 가지고 있는 기능을 사용하는 방법
    val runableCar: RunableCar = RunableCar("simple engine", "short body")
//    Runnable.ride() -> 불가능 왜냐면 저건 그냥 설명서일 뿐이야
    runableCar.drive()
    runableCar.ride()
    runableCar.navi("럭키마트")
    println()

    // 인스턴스의 멤버 변수에 접근 하는 방법
    val runableCar2: RunableCar2 = RunableCar2("nice engine", "long body")
    println(runableCar2.body)
    println(runableCar2.engine)
    println()

    val testClass : TestClass = TestClass()
    testClass.test(1)
    testClass.test(1,2)

}

// 클래스(설명서) 만드는 방법(1)
class Car constructor(var engine: String, var body: String) {

}

// 클래스(설명서) 만드는 방법(2)
class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

// 클래스(설명서) 만드는 방법(3) -> 1번 방법의 확장 이거는 3개 다 넣는게 아니라 2개만 넣어도 객체는 만들어져
class Car1 constructor(engine: String, body: String) {

    var door: String = ""

    // 생성자
    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}

// 클래스(설명서) 만드는 방법(4) -> 2번 방법 확장
class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class RunableCar(engine: String, body: String) {
    fun ride() {
        println("탑승 하였습니다")
    }

    fun drive() {
        println("달립니다 ! ")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다")
    }
}

class RunableCar2 {
    var engine: String = ""
    var body: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    init { // 초기값 세팅을 할 때 유용하다
        println("RunableCar2가 만들어졌습니다") //이 객체가 생성되면(인스턴스화 될때) 무조건 처음에 무조건 실행됨
    }

    fun ride() {
        println("탑승 하였습니다")
    }

    fun drive() {
        println("달립니다 ! ")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다")
    }
}

// 오버로딩 (함수가 겹칠 때 인자 다르게라면 가능)
class TestClass() {
    fun test(a: Int) {
        println("up")
    }

    fun test(a: Int, b: Int) {
        println("down")
    }
}