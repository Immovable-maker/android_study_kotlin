package org.techtown.kotlinandroid.kotlin


// 3) TV 클래스
//      - on / off 기능
//      - 채널을 돌리는 기능
//      - 초기 채널은 (S사 M사 K사 3개)
fun main(array: Array<String>) {
    val tv: TV = TV(listOf<String>("K", "M", "S"))
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.currentChannelNumber
}

class TV(val channels: List<String>) {
    var onOrOff: Boolean = false
    var currentChannelNumber = 0 //저 변수에 값이 할당 될 때 set이 호출 됨 그래서 set에서 current뭐시기 대신 field라는 것을 대신씀
        set(value) { // 굉장히 중요하대
            field = value
            if(field > 2){
                field = 0
            }
            if(field < 0){
                field = 2
            }
        }
        get() { // 변수가 할당될 때가 아니라 변수가 쓰일 때 부를 때 이게 호출이 됨됨            println("호출되었습니다")
            return field
        }

    fun switch() {
        onOrOff = !onOrOff
    }
    fun checkCurrentChannel() : String{
        return channels[currentChannelNumber]
    }

    fun channelUp() {
        currentChannelNumber += 1
//        channels.forEachIndexed { index, value ->
//            if (currentChannelNumber == index) {
//                currentChannelNumber += 1
//                return
//            }
//        }
    }
    fun channelDown() {
        currentChannelNumber -= 1
    }
//        channels.forEachIndexed { index, value ->
//            if (currentChannelNumber == index) {
//                currentChannelNumber -= 1
//                return
//            }
//        }
//    }
}