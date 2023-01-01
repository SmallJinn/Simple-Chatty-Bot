fun main() {
    val (firstname, lastname, age) = readln().split(" ")
    println("${firstname.first().uppercase()}. $lastname, $age years old")
}