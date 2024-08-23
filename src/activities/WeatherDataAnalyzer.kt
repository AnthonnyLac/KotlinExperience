package activities

import interfaces.Executable
import java.util.Scanner

class WeatherDataAnalyzer : Executable {
    private val temperatures = mutableListOf<Double>()

    override fun execute() {
        val scanner = Scanner(System.`in`)
        println("Insira as temperaturas por 30 dias:")

        repeat(30) {
            while (true) {
                val input = scanner.nextLine()
                try {
                    val temp = input.toDouble()
                    temperatures.add(temp)
                    break
                } catch (e: NumberFormatException) {
                    println("Valor inválido. Insira uma temperatura válida.")
                }
            }
        }

        val average = temperatures.average()
        val maxTemp = temperatures.maxOrNull()
        val minTemp = temperatures.minOrNull()
        val maxTempDay = temperatures.indexOf(maxTemp) + 1
        val minTempDay = temperatures.indexOf(minTemp) + 1

        println("Temperatura média: $average")
        println("Temperatura máxima: $maxTemp no dia $maxTempDay")
        println("Temperatura mínima: $minTemp no dia $minTempDay")
    }
}
