package org.techtown.kotlinandroid.kotlin

fun main(array: Array<String>) {
    first()
    println(second(80))
    println(third(52))
    gugudan()
}

fun gugudan() {
    for(x in 1..9){
        for(y in 1..9){
            var z : Int = x*y
            println("$x * $y = $z")
//            println("$x * $y = ${x*y})
        }
    }
}

fun first() {
    var numberList1 = MutableList(10, { 1 })
    var numberList2 = MutableList(10, { true })
    for (i in 0 until 10) {
        numberList1[i] = i
    }
    println(numberList1)
    numberList1.forEachIndexed { index, value ->
        if (value % 2 == 0) numberList2[index] = true
        else numberList2[index] = false
    }
    println(numberList2)

}

fun second(score: Int): String { // 바로 when문안에서 return 각각 때려도 ㅗ됨

    val grade = when (score) {
        in 80..90 -> "A"
        in 70 until 80 -> "B"
        in 60 until 70 -> "C"
        else -> "F"
    }
    return grade
}

fun third(number: Int): Int {
    val answer: Int = number / 10 + number % 10
    return answer

}
// 1번 문제
// List를 두 개 만든다
// 첫 번째 List에는 0 부터 9까지 값을 넣는다 (반복문 사용)
// 두 번째 List에는 첫 번째 List의 값을 하나씩 확인한 후
// 짝수면 True 홀수면 False 를 넣어 준다.

// 2번 문제
// 학점을 구하자
// 80 - 90 -> A
// 70 - 79 -> B
// 60 - 69 -> C
// 나머지 F

// 3번 문제
// 전달 받은 숫자의 각 자리 수의 합을 구하자
// 조건 : 전달 받은 숫자는 무조건 두자리 숫자이다

// 4번 문제
// 구구단을 출력하자
