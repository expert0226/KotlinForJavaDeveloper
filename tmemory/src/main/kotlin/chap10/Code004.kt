package chap10

fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) = joinToString(separator, prefix, postfix) // this.joinToString(separator, prefix, postfix)

fun main(args: Array<String>) {
    println(listOf("One", "two", "eight").join(" "))
}