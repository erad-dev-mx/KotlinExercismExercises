package armstrong_numbers

// https://exercism.org/tracks/kotlin/exercises/armstrong-numbers

class ArmstrongNumbers {
    fun check(input: Int): Boolean {
        var number = input
        var result = 0
        val originalNumber = number
        val n = number.toString().length

        while (number != 0) {
            val remainder = number % 10
            result += Math.pow(remainder.toDouble(), n.toDouble()).toInt()
            number /= 10
        }

        return originalNumber == result
    }
}

fun main() {
    println("RESULT ---> ${ArmstrongNumbers().check(153)}")
    println("RESULT ---> ${ArmstrongNumbers().check(0)}")
    println("RESULT ---> ${ArmstrongNumbers().check(5)}")
    println("RESULT ---> ${ArmstrongNumbers().check(10)}")
    println("RESULT ---> ${ArmstrongNumbers().check(100)}")
    println("RESULT ---> ${ArmstrongNumbers().check(9474)}")
    println("RESULT ---> ${ArmstrongNumbers().check(9475)}")
}