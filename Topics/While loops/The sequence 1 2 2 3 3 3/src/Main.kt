fun main() {
    val number = readln().toInt()

    var countOfNumbers = 0
    var countOfRepeats = 0

    while (countOfNumbers <= number) {
        repeat(countOfNumbers) {
            if (countOfRepeats < number) {
                print("$countOfNumbers ")
                countOfRepeats++
            }
        }
        countOfNumbers++
    }
}