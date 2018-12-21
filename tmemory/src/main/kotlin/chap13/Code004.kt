package chap13

sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun main(args: Array<String>) {
    println(eval(Expr.Num(7)))
    println(eval(Expr.Sum(Expr.Num(3), Expr.Num(5))))
}

fun eval(e: Expr) : Int =
        when (e) {
            is Expr.Num -> e.value
            is Expr.Sum -> eval(e.right) + eval(e.left)
        }