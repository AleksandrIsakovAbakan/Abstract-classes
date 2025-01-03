abstract class Shop {

    var numberOfSales = 0
    var profit = 0.0
    var numberOfProducts = 0

    abstract fun profitPerUnitOfProducts()
    abstract fun profitPerUnitOfSales()

    open fun storeIsOpen() {
        println("Магазин открыт")
    }

    override fun toString(): String {
        return "${javaClass.name}(numberOfSales=$numberOfSales, profit=$profit, numberOfProducts=$numberOfProducts)"
    }


}