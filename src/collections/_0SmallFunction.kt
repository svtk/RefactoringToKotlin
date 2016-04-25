package collections

fun isDigit(c: Char): Boolean {
    return c >= '0' && c <= '9'
}

fun Char.isDigit1() = this in '0'..'9'

fun main(args: Array<String>) {
    println(isDigit('x'))
    println(isDigit('3'))
}