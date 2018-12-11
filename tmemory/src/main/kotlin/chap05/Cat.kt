package chap05

class Cat(private val name: String, private var age: Int) {
    fun getName(): String {
        return "고양이는 야옹이"
    }

    fun getAge(): Int {
        return age;
    }

    fun setAge(age: Int) {
        this.age = age;
    }
}