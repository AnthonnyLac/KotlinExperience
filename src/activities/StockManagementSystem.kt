package activities

import interfaces.Executable
import models.Product
import java.util.Scanner

class StockManagementSystem : Executable {
    private val products = mutableListOf<Product>()

    override fun execute() {
        val scanner = Scanner(System.`in`)

        for (i in 1..5) {
            println("Digite o nome do produto $i:")
            val name = scanner.nextLine()
            println("Insira a quantidade de $name:")
            val quantity = scanner.nextInt()
            println("Insira o nível mínimo para $name:")
            val minLevel = scanner.nextInt()
            println("Insira o nível máximo para $name:")
            val maxLevel = scanner.nextInt()
            scanner.nextLine()

            products.add(Product(name, quantity, minLevel, maxLevel))
        }

        products.forEach { product ->
            product.checkStock()
            println("${product.name}: Quantidade = ${product.quantity}")
        }
    }
}
