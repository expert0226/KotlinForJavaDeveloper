package chap10

fun String.lastChar(): Char = this[this.length - 1]

fun main(args: Array<String>) {
    println("kiss me".lastChar())
}