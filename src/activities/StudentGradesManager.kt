package activities
import interfaces.Executable
import models.Student
import java.util.Scanner

class StudentGradesManager : Executable {
    private val students = mutableListOf<Student>()

    override fun execute() {
        val scanner = Scanner(System.`in`)

        for (i in 1..5) {
            println("Digite o nome do aluno $i:")

            val name = scanner.nextLine()
            val grades = mutableListOf<Double>()

            println("Insira as notas para $name (digite '-1' quando terminar):")

            while (true) {
                val input = scanner.nextLine()

                if (input == "-1") break

                try {
                    val grade = input.toDouble()
                    grades.add(grade)
                } catch (e: NumberFormatException) {
                    println("Entrada inválida. Insira uma nota válida ou '-1'.")
                }
            }

            students.add(Student(name, grades))
        }

        students.forEach { student ->
            val average = student.grades.average()
            val status = if (average >= 7.0) "Aprovado" else "não Aprovado"
            println("${student.name}: Media = $average, Status = $status")
        }
    }
}