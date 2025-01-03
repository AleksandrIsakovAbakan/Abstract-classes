import java.lang.RuntimeException

fun main() {

    /*
    1. Написать абстрактный класс Shop(магазин).
    Написать несколько свойств класса, две абстрактные функции и одну обычную, характеризующих работу магазина.
    Создать два класса наследника магазин Magnit и Pyaterochka.
    Написать реализацию функций.
    */
    val magnit = Magnit()
    magnit.numberOfSales = 1000
    magnit.numberOfProducts = 2000
    magnit.profit = 5000.0
    println(magnit)
    magnit.profitPerUnitOfSales()
    magnit.profitPerUnitOfProducts()
    magnit.storeIsOpen()
    val pyaterochka = Pyaterochka()
    pyaterochka.numberOfSales = 500
    pyaterochka.numberOfProducts = 5000
    pyaterochka.profit = 2000.0
    println(pyaterochka)
    pyaterochka.profitPerUnitOfSales()
    pyaterochka.profitPerUnitOfProducts()
    pyaterochka.storeIsOpen()
    println()

    /*
    2. Написать абстрактный класс Person.
    В конструкторе передать несколько свойств, например, имени, фамилии, возраста.
    Написать абстрактные функции, характеризующие деятельность объекта класса и одну или несколько обычных.
    Создать два класса наследника Student и Employee.
    Написать реализацию функций.
    */
    val student = Student()
    student.firstName = "Ivan"
    student.lastName = "Ivanov"
    student.age = 19
    println(student)
    student.goesToCinema()
    student.playsTheGuitar()
    student.sleeping()
    val employee = Employee()
    employee.firstName = "Oleg"
    employee.lastName = "Olegov"
    employee.age = 25
    println(employee)
    employee.goesToCinema()
    employee.playsTheGuitar()
    employee.sleeping()
    println()

    println("Найти длину отрезка в тех величинах, под номером которых они находятся.")
    println("1 — дециметр, 2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр")
    val number = 4
    val length = 2.0
    println(number)
    println(length)
    println(lengthOfSegmentInQuantities(number, length))
}

/*
3. Единицы длины пронумерованы следующим образом: 1 — дециметр, 2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр.
Дан номер единицы длины (целое число в диапазоне 1–5) и длина отрезка в метрах (дробное число).
Найти длину отрезка в тех величинах, под номером которых они находятся.
*/
fun lengthOfSegmentInQuantities(number: Int, length: Double): Double {
    return when (number) {
        1 -> length * 10
        2 -> length / 1000
        3 -> length
        4 -> length * 10000
        5 -> length * 100
        else -> {
            throw RuntimeException("Некорректный номер единицы длины: $number")
        }
    }
}


/*
Примечания:
Для вывода значений на экран используйте функцию println().
*/