package chap02

fun smaller(a : Int, b: Int) : Int {
    // a = 100 // Val cannot be reassigned.

    return if (a > b) b else a
}

fun main(args: Array<String>) {
    println("Hello World");
}