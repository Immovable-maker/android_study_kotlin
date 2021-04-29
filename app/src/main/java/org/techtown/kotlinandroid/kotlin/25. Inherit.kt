package org.techtown.kotlinandroid.kotlin

fun main(array: Array<String>) {
    val superCar1 : SuperCar1 = SuperCar1()
    println(superCar1.drive())
}
// Tip 두번까지는 봐준다
// 두 번 이상이 넘어가면 리팩토링 해라
// 클래스는 기본적으로 private이 붙어있다고 보면 됨

// 25. 상속
// 부모로부터 설명서를 물려받는다!

// 부모 : ParentCar
// 자식 : SuperCar1, Truck1
open class ParentCar() {
    open fun drive() : String {
        return "달린다"
    }

    fun stop() {

    }
}

class SuperCar1() : ParentCar() {
    override fun drive() : String{ // 이거 우클릭 후 Generate로 생성한 것임
        val run = super.drive()
        return "빨리 $run" // 지금은 개조한 상황 받아서 내가 수정해서 사용함
    }
}

class Truck1() : ParentCar() {


}