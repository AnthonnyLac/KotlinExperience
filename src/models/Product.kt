package models

class Product(val name: String, var quantity: Int, val minLevel: Int, val maxLevel: Int) {
    fun restock() {
        quantity = maxLevel
    }

    fun checkStock() {
        if (quantity < minLevel) {
            println("O estoque de $name está abaixo do nível mínimo. Restocando...")
            restock()
        }
    }
}
