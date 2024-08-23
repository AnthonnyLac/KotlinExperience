import activities.*
import models.Activity

fun main() {

    // Criação das atividades com seus respectivos números e tarefas
    val activities = listOf(
        Activity(1, PrimeNumberChecker()),
        Activity(2, WordCounter()),
        Activity(3, StudentGradesManager()),
        Activity(4, StudentNameSorter()),
        Activity(5, DiceGameSimulator()),
        Activity(6, WeatherDataAnalyzer()),
        Activity(7, FlightReservationSystem()),
        Activity(8, StockManagementSystem())
    )

    // Execução das atividades
    activities.forEach { activity ->
        println("Atividade ${activity.number}:")
        activity.task.execute()
        println()  // Linha em branco para separar as atividades
    }
}