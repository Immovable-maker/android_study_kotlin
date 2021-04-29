package org.techtown.kotlinandroid.kotlin

// 과제
// Knight1, Monster1 (부모) -> Charactor 로 한 번 더 줄이기
// SuPerKnight, SuperMonster1 (자식)

fun main(array: Array<String>) {
    val knight1 = SuperKnight(1000, 60)
    val monster1 = SuperMonster(100, 30)
    knight1.attack(monster1)
    monster1.bite(knight1)
}

// 상속이 만들어낸 특징
// - 자식 클래스는 부모 클래스의 타입이다
// - 부모 클래스는 자식 클래스의 타입이 아니다.
// 왜나오냐면 지금 위에서 monster1 즉 수퍼몬스터 타입을 넣었는데 함수에서는 charactor형을 받기 때문에

open class Charactor(var hp: Int, val power: Int) {
    open fun attack(charactor: Charactor, power: Int = this.power) { // bite에서 바뀌는데 기사 역할은 power를 안건들수도 있기에 초기값을 설정함
        charactor.denfense(power)
    }

    open fun denfense(damage: Int) {
        hp -= damage
        if (damage <= 0) println("사망했습니다")
        else println("${javaClass.simpleName} 남은 체력 $hp")
    }
}

// 자식 클래스가 인스턴스화 되기 위해서는 부모 클래스가 선행되어 인스턴스화 되어야 한다

class SuperMonster(hp: Int, power: Int) : Charactor(hp, power) {
    fun bite(charactor: Charactor) {
        super.attack(charactor, power + 2)
    }
}


class SuperKnight(hp: Int, power: Int) : Charactor(hp, power) {
    val defensePower = 10
    override fun denfense(damage: Int) {
        super.denfense(damage - defensePower)
    }
}



