import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()
    val result = input > 0 && input < 10
    print(result)
}