package chap10

import java.lang.StringBuilder

val String.fc: Char
get() = this[0]

var StringBuilder.lc: Char
get() = get(this.length - 1)
set(ch) = this.setCharAt(length - 1, ch)