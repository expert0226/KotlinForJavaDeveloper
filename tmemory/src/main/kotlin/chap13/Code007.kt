package chap13

class LengthCounter {
    var counter: Int = 0
    private set

    fun addWord(word: String) {
        counter += word.length
    }
}

class Test {
    val a: Int = 5
    get() = field + 10
}