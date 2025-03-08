package utils.person

import kotlin.system.exitProcess

class Person(var name: String, var favorite: String, var age: Int) {
    fun whoIsMe() {
        println("Hello, I am $name. My favorite thing to do is $favorite, and I am $age years old ")
    }

    fun whoIsIt(): Int {
        try {
            print("What's your name? ")
            val input = readln()
            if (input.isBlank()) {
                throw IllegalArgumentException("Name can't be null.")
            }
            println("Hello $input!")
        } catch (e: IllegalArgumentException) {
            println("\u001b[31mFATAL Error\u001b[0m $e")
            exitProcess(1)
        } catch (e: Exception) {
            println("\u001b[31mUNEXPECTED Error\u001b[0m $e")
            exitProcess(135)
        }
        return 0
    }
}