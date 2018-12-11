package chap07

import java.util.*

fun main(args: Array<String>) {
    val binaryRepo = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryRepo[c] = binary
    }

    for ((letter, binary) in binaryRepo) {
        println("$letter = $binary")
    }
}