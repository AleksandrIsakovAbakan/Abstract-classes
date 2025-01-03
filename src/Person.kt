abstract class Person(var firstName: String, var lastName: String, var age: Int) {

    abstract fun typeOfActivity()

    abstract fun sleeping()

    abstract fun playsTheGuitar()

    open fun goesToCinema() {
        println("$firstName идет в кино")
    }

    override fun toString(): String {
        return "${javaClass.name}(firstName='$firstName', lastName='$lastName', age=$age)"
    }

}