class Magnit : Shop() {

    override fun profitPerUnitOfProducts() {
        println("Прибыль на единицу продукции в магазине Магнит равна: " + profit / numberOfProducts)
    }

    override fun profitPerUnitOfSales() {
        println("Прибыль на единицу продажи в магазине Магнит равна: " + profit / numberOfSales)
    }
}