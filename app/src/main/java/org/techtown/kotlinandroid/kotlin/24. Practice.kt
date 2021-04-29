package org.techtown.kotlinandroid.kotlin

fun main(array: Array<String>) {
    val knight = Knight(20, 4)
    val monster = Monster(15, 5)
    knight.attack(monster)
    monster.attack(knight)

}

class Knight(private var hp: Int, private var power: Int) {
    fun attack(monster: Monster) {
        monster.defense(power)
    }

    fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) {
            heal()
            println("기사의 현재 체력은 $hp 입니다")
        } else println("기사가 죽었습니다")
    }

    private fun heal() {
        // 아무 때나 사용하는 것이 아니라
        // 공격을 당했을 때만 사용하는 것이어야 함 그래서 private
        hp += 3
    }
}
// Tip 일단 최소화 시킨다음 나중에 바꿀일이 있을 때 val 이나 private하면 됨
class Monster2(private val hp: Int, private val power: Int){

}

class Monster(private var hp: Int, private var power: Int) {
    fun attack(knight: Knight) {
        knight.defense(power)
    }

    fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) println("몬스터의 현재 체력은 $hp 입니다")
        else println("몬스터가 죽었습니다")
    }

}