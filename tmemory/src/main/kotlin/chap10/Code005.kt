package chap10

val String.firstChar: Char
    get() = this[0]

fun main(args: Array<String>) {
    println("kiss me".firstChar)
}