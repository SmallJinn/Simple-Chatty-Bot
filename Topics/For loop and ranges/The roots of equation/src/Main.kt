fun main() {
    val (a, b, c, d) = List(4) { readln().toInt() }
    val range = 0..1000
    for (x in range) {
        val root = a * (x * x * x) + b * (x * x) + c * x + d
        if (root == 0) println(x)
    }
}