package chap12

fun outer() {
    fun inner(arg: String) {
        println("Hello, $arg")
    }

    inner("미야야키 사쿠라")
    inner("타카하시 주리")
    inner("혼다 히토미")
}

fun main(args: Array<String>) {
    outer()
}