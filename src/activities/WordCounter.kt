package activities

import interfaces.Executable
import java.util.*

class WordCounter  : Executable {
    private var text: String = ""

    override fun execute() {
        val scanner = Scanner(System.`in`)
        println("Insira um parágrafo de texto:")
        text = scanner.nextLine()

        val wordCount = text.split(" ").size
        println("O texto contém $wordCount palavras.")
    }
}