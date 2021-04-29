package org.techtown.kotlinandroid.kotlin

// 2) 은행 계좌 만들기
//      - 계좌 생성 기능 (이름, 생년 월일)
//      - 잔고를 확인 하는 기능
//      - 출금 기능
//      - 예금 기능


fun main(array: Array<String>) {
    val account: Account = Account("고정한", "2000/04/27", 100000000)
    println(account.checkBalance())
    println(account.save(5000000))
    println(account.withdraw(100000))
    println(account.checkBalance())
    println()

    val account2 : BankAccount = BankAccount("rhwjd","sdfasdf")
    account2.checkBalance()
    account2.makeDeposit(100000)
    account2.checkBalance()
}

// 수업에서 한거
class Account {
    val name : String
    val birth : String
    var balance : Int

    constructor(name: String, birth: String, balance :Int){
        this.name = name
        this.birth = birth
        if(balance>=0){
            this.balance = balance
        }else{
            this.balance = 0
        }

    }
    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance -= amount
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}

class Account2(initialBalance: Int){
    val balance : Int = if (initialBalance >=0) initialBalance else 0
    fun checkBalance() : Int{
        return balance
    }
}

// 내가 한거
class BankAccount {
    var name: String = ""
    var birth: String = ""
    var balance: Int = 10000 // 초기값 설정 이거말고 생성자에다가 값 설정해서 넣어줘도 됨

    constructor(name: String, birth: String) {
        this.name = name
        this.birth = birth
    }

    fun checkBalance() {
        println("현재 남아 있는 금액은 $balance 입니다")
    }

    fun makeDeposit(money: Int) {
        this.balance += money
        println("현재 잔고는 $balance 입니다")
    }

    fun makeWithdrawal(money: Int) {
        this.balance -= money
        println("현재 잔고는 $balance 입니다")

    }
}
