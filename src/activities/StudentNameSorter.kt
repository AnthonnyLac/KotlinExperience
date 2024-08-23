package activities

import interfaces.Executable
import java.util.Scanner

class StudentNameSorter : Executable {
    private val names = mutableListOf<String>()

    override fun execute() {
        val scanner = Scanner(System.`in`)

        println("Digite os nomes de 10 alunos:")

        repeat(10) {
            val name = scanner.nextLine()
            names.add(name)
        }

        val sortedNames = names.sorted()
        println("Nomes ordenados: $sortedNames")
    }
}
