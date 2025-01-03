class Pyaterochka : Shop() {

    override fun profitPerUnitOfProducts() {
        println("Прибыль на единицу продукции в магазине Пятерочка равна: " + profit / numberOfProducts)
    }

    override fun profitPerUnitOfSales() {
        println("Прибыль на единицу продажи в магазине Пятерочка равна: " + profit / numberOfSales)
    }

}