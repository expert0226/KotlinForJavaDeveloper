package chap13

open class RichButton: Clickable {
    fun disable() {}

    open fun animate() {}

    override fun click() {}
}