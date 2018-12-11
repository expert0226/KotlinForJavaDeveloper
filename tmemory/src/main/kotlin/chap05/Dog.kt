package chap05

class Dog(private val name: String, private var age: Int) {
    val species: String
    get(): String {
        return "Wolf"
    }

    var breed: String
    get() = breed
    set(breed) {
        this.breed = breed
    }
}

