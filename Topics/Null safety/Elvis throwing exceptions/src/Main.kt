    fun main() {
        val userInput: String = readlnOrNull() ?: throw error("empty input")
        print("Elvis says: $userInput")
    }