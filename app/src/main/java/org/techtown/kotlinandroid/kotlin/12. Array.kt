package org.techtown.kotlinandroid.kotlin

// 12. 배열

// 배열이 필요한 이유
// - 그룹(모음집)이 필요할 때

fun main(array: Array<String>) {

// 배열을 생성하는 방법(1)
    var number: Int = 1 // 이 문장은 변수를 선언! 생성과 다르대
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5)
    println(group1 is Array)

// 배열을 생성하는 방법(2)
    var number1 = 10
    var group2 = arrayOf(1, 2, 3, 5, "Hello") //변수 상관없이 할 수 있는데 비추

// Index 란
// -> 순서
// [1,2,3,4,5]
// 0부터 시작
// index0 -> 1, index1 -> 2

// 배열의 값을 꺼내는 방법
    var test1 = group1.get(0)
    var test2 = group2.get(4)
    println(test1)
    println(test2)

// 베열의 값을 꺼내는 방법(2)
    val test3 = group1[0]
    println(test3)

// 배열의 값을 바꾸는 방법(1)
    group1.set(0,100)
    println(group1[0])

// 배열의 값을 바꾸는 방법(2)
    group1[0] = 200
    println(group1[0])

}