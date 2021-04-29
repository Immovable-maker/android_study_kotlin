package org.techtown.kotlinandroid.kotlin

// 27. Interface
// - 인터페이스는 약속 !
// - 생성자가 없다 -> 인스턴스화 시킬 수 없다 -> 설명서가 아니다! 상속과는 달라
//  - 지침서 -> 니가 이것을 구현하고 싶다면 반드시 아래 기능을 구현해라!
// 인터페이스는 먹는 기능이 있으면 돼 (방법 및 세부기능이 전혀 달라도 됌) 협업에 유리한 개념이래
// 상속은 먹는 기능이 둘 다 있고 몇 개 기능만 추가하면 될때 하면 돼)
// 상속과 다른 점
// - 상속은 조상을 찾아가는 느낌
// - 인터페이스는 종의 특징
fun main(array: Array<String>){
    val student_:Student__ = Student__()
    student_.eat()
    student_.sleep()
}

interface Person__ {
    fun eat()
    fun sleep()
}

class Student__ : Person__ {
    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun sleep() {
        TODO("Not yet implemented")
    }
}

