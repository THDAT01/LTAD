fun calculateHandshake(num: Int): List<String> {
    val signals = mutableListOf<String>()
    if (num and 0x01 == 1) signals.add("\"Wink\"")
    if (num and 0x02 == 2) signals.add("\"Double Blink\"")
    if (num and 0x04 == 4) signals.add("\"Close Your Eyes\"")
    if (num and 0x08 == 8) signals.add("\"Jump\"")
    if (num and 0x10 == 16) signals.reverse()
    return signals
}
fun main() {
    println("Secret Handshake")
    print("Enter a decimal number: ")
    val input: Int = readLine()!!.toInt()
    print("Binary number: ")
    println(Integer.toBinaryString(input))
    print("Handshake: ")
    println(calculateHandshake(input))
}
