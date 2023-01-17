        fun phrase(phrase: String): Map<String, Int> {
        return phrase
            .lowercase()
            .split(Regex("'?[., \t\n\"!&@\$%^&:]+'?|'\$"))
            .filterNot(String::isBlank)
            .groupingBy { it }
            .eachCount()
    }

fun main() {
    print("Enter a phrase: ")
    val text: String = readLine()!!
    println(" ${phrase(text)}")
}
