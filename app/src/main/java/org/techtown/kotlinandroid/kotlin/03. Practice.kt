package org.techtown.kotlinandroid.kotlin

var a = 1 + 2 + 3 + 4 + 5 //연산의 결과값을 변수에 넣어줄 수 있다
var b = "1"
var c = b.toInt()
var d = b.toFloat()

var e = "John"
var f = "My name is $e Nice to meet you"

// Null
// - 존재 하지 않는다 휴지를 써서 다썼어 (휴지심만 남으면 0, 휴지심도 없으면 null)

//var abc : Int = null null을 가지려면 ?를 붙여야함
var abc1: Int? = null
var abc2: Double? = null

var g = a + 3

fun main(array: Array<String>) {
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(abc1)
    println(g)

}