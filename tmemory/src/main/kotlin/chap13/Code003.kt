package chap13

class B {
    inner class A {
        fun getOuterReference(): B = this@B
    }
}

fun main(args: Array<String>) {
    val b = B()
    val a = b.A()

    println(a.getOuterReference())
}