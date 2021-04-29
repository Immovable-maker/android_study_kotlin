package org.techtown.kotlinandroid.kotlin

fun main(array: Array<String>) {
    var caculator: Calculation = Calculation()
    println(caculator.doPlus(103, 7))
    println(caculator.doMinus(103, 7))
    println(caculator.doMultiPly(103, 7))
    println(caculator.doDivided(103, 7))
    println()
    val calculator2: Calculation2 = Calculation2()
    println(calculator2.plus(1, 2, 3, 4, 5))
    println(calculator2.minus(10, 1, 2, 3))
    println(calculator2.multiply(1, 2, 3))
    println(calculator2.divide(10, 1, 2, 3))
    println()
    /*** 이 부분이 세상에서 제일중요한 클래스 부분임 지금 리턴값이 클래스기 때문에 그다음 .이 붙는거야
     * Chaining(체이닝)*/
    val calculator3 : Calculation3 = Calculation3(3)
    calculator3.plus(5).minus(5)


}
// 1) 사칙 연산을 수행할 수 있는 클래스



class Calculation() {

    fun doPlus(number1: Int, number2: Int): Int {
        return number1 + number2
    }

    fun doMinus(number1: Int, number2: Int): Int {
        return number1 - number2
    }

    fun doMultiPly(number1: Int, number2: Int): Int {
        return number1 * number2
    }

    fun doDivided(number1: Int, number2: Int): Int {
        return number1 / number2
    }
}

class Calculation2() {

    fun plus(vararg numbers: Int): Int {
        var result: Int = 0
        numbers.forEach {
            result = result + it
        }
        return result
    }

    fun minus(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        for (i in 0 until numbers.size) {
            if (i != 0) {
                result = result - numbers[i]
            }
        }
        return result
    }


    fun multiply(vararg numbers: Int): Int {
        var result: Int = 1
        numbers.forEach {
            if (it != 0) {
                result = result * it
            }
        }
        return result
    }

    fun divide(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        numbers.forEachIndexed { index, value ->
            if (index != 0) {
                if (value != 0) {
                    result = result / value
                }
            }
        }
        return result
    }
}

class Calculation3 (val initalValue: Int) {

    fun plus(number: Int): Calculation3 {
        val result = this.initalValue + number
        return Calculation3(result)
    }

    fun minus(number: Int): Calculation3 {
        val result = this.initalValue - number
        return Calculation3(result)
    }

    fun multiply(number: Int): Calculation3 {
        val result = this.initalValue * number
        return Calculation3(result)
    }

    fun divide(number: Int): Calculation3 {
        val result = this.initalValue / number
        return Calculation3(result)
    }
}


