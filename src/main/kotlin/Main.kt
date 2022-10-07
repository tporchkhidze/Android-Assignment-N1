fun main() {

    println(average(arrayOf(5, 10, 20)))

    println(isPalindrome("live on time emit no evil"))

}

fun average(array: Array<Int>): Int {
    var sum = 0

    var num = 0
    array.forEachIndexed { index, element ->
        if (index % 2 == 0) {
            sum += element
            num += 1
        }
    }

    return sum / num
}

fun isPalindrome(string: String): Boolean {
    val reversed = StringBuilder()
    val charArray = string.toCharArray()
    for (i in charArray.size - 1 downTo 0)
        reversed.append(charArray[i])
    return reversed.toString() == string
}

