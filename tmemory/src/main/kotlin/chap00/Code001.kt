package chap00

val a
get() = 55

var b = 7
    get() = 7777
//    set(bb) {
//        b = bb
//    }

class Kiss {
    val a
        get() = 55

    var b
        get() = 77
        set(bb) {
            b = bb
        }
}