package activities

import interfaces.Executable
import java.util.*

class PrimeNumberChecker : Executable {

    private var number: Int = 0

    override fun execute() {

        val scanner = Scanner(System.`in`)
        println("Digite um número para verificar se é primo:")
        number = scanner.nextInt()

        if (isPrime(number)) {
            println("$number é um número primo.")
        } else {
            println("$number não é um número primo.")
        }

    }

    private fun isPrime(num: Int): Boolean {
        if (num <= 1) return false
        for (i in 2 until num) {
            if (num % i == 0) return false
        }
        return true
    }
}