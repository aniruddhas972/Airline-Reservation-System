fun main() {
    val number = 12345
    val reversedNumber = reverseNumber(number)
    println("Reversed number: $reversedNumber")
}

fun reverseNumber(number: Int): Int {
    var num = number
    var reversed = 0
    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }
    return reversed
}
