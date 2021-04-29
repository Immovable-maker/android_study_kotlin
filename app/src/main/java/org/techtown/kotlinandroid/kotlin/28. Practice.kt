package org.techtown.kotlinandroid.kotlin

// 28. 인터페이스
// - 인터페이스도 구현이 있는 함수를 만들 수 있다
// - 인터페이스에 구현이 있는 함수는 그 인터페이스슬 구현하는 믈래스에서 그 함수을 구현할 필요가 없다
// - 인터페이스에 구현이 없는 함수는 그 인터페이스를 구현하는 클래스에서 그 함수를 반드시 구현해야 한다
// - abstract를 넣으면 그 상속받는 클래스에서 무조건 구현해 주어야 함 (명시 해주는 장치)
fun main(array: Array<String>) {
    val student_ : Student_ = Student_()
    student_.sleep()
    student_.eat()
}

interface Person_ {
    fun eat() {
        println("먹는다")
    }

    fun sleep() {
        println("잔다")
    }

    abstract fun study()
}

class Student_ : Person_ {
    override fun study() {

    }
}

class Teacher_ : Person_ {
    override fun study() {

    }

}

// 자바 파일을 코틀린에 복사 붙여넣기 하면 코틀린으로 자동변환 시켜줌