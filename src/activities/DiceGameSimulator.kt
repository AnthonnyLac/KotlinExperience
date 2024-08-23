package activities

import interfaces.Executable

import java.util.Scanner

class DiceGameSimulator : Executable {
    private var rolls: Int = 0

    override fun execute() {
        val scanner = Scanner(System.`in`)
        println("Insira o número de quantas vezes deseja jogar os dados:")
        rolls = scanner.nextInt()

        repeat(rolls) {
            val dice1 = (1..6).random()
            val dice2 = (1..6).random()
            val sum = dice1 + dice2
            println("Rolada ${it + 1}: Dado 1 = $dice1, Dado 2 = $dice2, Soma = $sum")
        }
    }
}
