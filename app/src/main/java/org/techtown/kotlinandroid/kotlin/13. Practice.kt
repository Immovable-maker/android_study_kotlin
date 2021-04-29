package org.techtown.kotlinandroid.kotlin

fun main(array: Array<String>) {
    val array = arrayOf<Int>(1, 2, 3)

// get, set
    val number = array.get(0)
    println(number)
// val number1 = array.get(100) 인덱스에 주의해야 한다
    array.set(0, 100)
    val number2 = array.get(0)
    println(number2)

    array.set(100, 100)

// Array의 Bounds
// - 처음 만들 때 결정 된다.

// Array를 만드는 방법(3) 이렇게 처음에 명시적인 것을 추천하기는함
    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('b', 'b') // char -> '', string -> ""
    val a3 = doubleArrayOf(1.2,100.345)
    val a4 = booleanArrayOf(true, false, true)

}