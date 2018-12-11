package chap05

fun main(args: Array<String>) {
    val person = Person("Rambo", 27)

    println("성명: $person.name")     // 성명: chap05.Person@49476842.name
    println("나이: $person.age")      // 나이: chap05.Person@49476842.age

    println("성명: ${person.name}")   // 성명: Rambo
    println("나이: ${person.age}")    // 나이: 27
}