import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val scanner = Scanner(System.`in`)
    val numbers : ArrayList<Int> = arrayListOf()

    repeat(5) {
        numbers.add(scanner.nextInt())
    }

    println(numbers.last() in numbers.first()..numbers[1] || numbers.last() in numbers[2]..numbers[3])
}