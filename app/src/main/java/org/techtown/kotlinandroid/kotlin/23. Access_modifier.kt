package org.techtown.kotlinandroid.kotlin

fun main(array: Array<String>){
    val testAccess : TestAccess = TestAccess("아무개")
    // private 변수는 그 클래스 내부에서만 사용가능해 지는 것 그것 때문에 외부에서 더 이상 사용할 수 없다
//    testAccess.test()
//    println(testAccess.name)
//    testAccess.name = " 아무개 투"
//    println(testAccess.name)

    val reward : Reward = Reward()
    reward.readAmount = 2000

    val runningCar : RunningCar = RunningCar()
    runningCar.runFast()


}
class TestAccess {
    private var name: String = "홍길동"

    constructor(name: String) {
        this.name = name
    }
    fun changeName(newName : String){
        this.name = newName
    }

    private fun test() {
        println("테스트트")
    }
}
class Reward(){
    var readAmount : Int = 1000
}

class RunningCar() {

    fun runFast(){
        run()

    }
    private fun run(){ //runFast 에서 활용하고 외부에는 공개하고 싶지 않은 역할을 할 때

    }
}