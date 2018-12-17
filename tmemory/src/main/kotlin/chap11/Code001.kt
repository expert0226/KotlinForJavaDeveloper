package chap11

fun main(args: Array<String>) {
    val array = arrayOf("a", "one", "할룽")

    val list = listOf("first", *array)

    println("args: $list")
}