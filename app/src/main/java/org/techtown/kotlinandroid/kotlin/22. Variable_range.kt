package org.techtown.kotlinandroid.kotlin

// 변수의 접근 범위
// 1. 전역 변수
// 2. 지역 변수
// 여기에서 객체를 만들어버리면 test.name을 testFun에서 사용할 수 있게 됨 한마디로 개판이지
var number100 : Int = 10 //얘는 전역 변수
// 필요한 곳에서만 접근할 수 있도록 최소한의 범위로 정하는 것이 좋음음
fun main(array: Array<String>){
    println(number100)

    val test: Test = Test("홍길동")
    test.testFun()
    test.name
    println(number100)
}

class Test(var name: String){
    fun testFun(){
        var birth: String = "2000/04/27"
        name = "홍길동"
        number100 = 100
    }
    fun testFun2(){
//        name 얘는 접근 가능하고
//        birth 얘는 접근이 안돼
    }
}