package chap13

class User001 constructor(_nickname: String) {
    val nickname: String

    init {
        nickname = _nickname
    }
}

class User002 constructor(_nickname: String) {
    val nickname = _nickname
}

class User003 (_nickname: String) {
    val nickname = _nickname
}

class User004 (val nickname: String)

class User005 (val nickname: String = "Jane Doe")

open class User006(val nickname: String)
class TwitterUser(nickname: String): User006(nickname)

class User007

class Secretive private constructor() {}


class User008 {
    constructor(name: String) { // 부생성자

    }

    constructor(name: String, age: Int) { // 부생성자

    }
}

class User009 {
    constructor(name: String): this(name, 23) { // 부생성자

    }

    constructor(name: String, age: Int): super() { // 부생성자

    }
}

class User010 (val name: String = "Jane Doe", val age: Int = 23)