package chap13

interface User {
    val nickname: String // Abstract Property
}

class PrivateUser(override val nickname: String) : User

class SubscribingUser(val email: String) : User {
    override val nickname : String
    get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User {
    override val nickname = getFacebookName(accountId)
}

fun getFacebookName(accountId: Int) : String {
    return "Jane Dow"
}


interface User01 {
    val email: String
    val nickname: String
    get() = email.substringBefore('@')
}