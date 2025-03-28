package acronym

// https://exercism.org/tracks/kotlin/exercises/acronym

class Acronym {
    fun generate(phrase: String): String {
        return phrase.split(Regex("[\\s\\-_]+")).map {
            it.first().uppercaseChar()
        }.joinToString("")
    }
}

fun main() {
    println("RESULT ---> ${Acronym().generate("Portable Network Graphics")}")
    println("RESULT ---> ${Acronym().generate("Ruby on Rails")}")
    println("RESULT ---> ${Acronym().generate("First In, First Out")}")
    println("RESULT ---> ${Acronym().generate("GNU Image Manipulation Progra")}")
    println("RESULT ---> ${Acronym().generate("Complementary metal-oxide semiconductor")}")
    println("RESULT ---> ${Acronym().generate("Rolling On The Floor Laughing So Hard That My Dogs Came Over And Licked Me")}")
    println("RESULT ---> ${Acronym().generate("Something - I made up from thin air")}")
    println("RESULT ---> ${Acronym().generate("Halley's Comet")}")
    println("RESULT ---> ${Acronym().generate("The Road _Not_ Taken")}")
}