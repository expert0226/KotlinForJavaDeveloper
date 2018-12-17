package chap11

val map01 = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

val map02 = mapOf(1.to("one"), 7.to("seven"), 53.to("fifty-three"))

val map03 = mapOf(Pair(1, "one"), Pair(7, "seven"), Pair(53, "fifty-three"))

// val (number, name) = 1 to "one"

fun main(args: Array<String>) {
    val (number, name) = 1 to "one"

    println("number: $number, name: $name")
}