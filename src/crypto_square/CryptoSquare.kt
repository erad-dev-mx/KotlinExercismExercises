package crypto_square


class CryptoSquare {
    fun ciphertext(plaintext: String): String {
        val normalizedText = plaintext.lowercase().filter { it.isLetterOrDigit() }

        val length = normalizedText.length
        if (length == 0) return ""

        val rows = kotlin.math.sqrt(length.toDouble()).toInt()
        val cols = kotlin.math.ceil(length.toDouble() / rows).toInt()

        val rectangle = mutableListOf<String>()
        for (i in 0 until rows) {
            val start = i * cols
            val end = minOf((i + 1) * cols, length)
            val row = normalizedText.substring(start, end).padEnd(cols)
            rectangle.add(row)
        }

        val encodedText = mutableListOf<String>()
        for (col in 0 until cols) {
            val column = rectangle.map { it[col] }.joinToString("")
            encodedText.add(column)
        }

        return encodedText.joinToString(" ")
    }
}

fun main() {
    val cryptoSquare = CryptoSquare()
    val text = "If man was meant to stay on the ground, god would have given us roots."
    val result = cryptoSquare.ciphertext(text)
    println(result)
}