fun main() {
    val sharp = '#'
    for (i in 1..6) {
        for (j in 1..i) {
            print(sharp)
        }
        if (i==6) return
        println()
    }
}