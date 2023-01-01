import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var sum = 0

    do {
        val number = scanner.nextInt()
        sum+=number
    } while (number!=0)

    print(sum)
}