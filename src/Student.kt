class Student : Person(firstName = "", lastName = "", age = 0) {
    override fun typeOfActivity() {
        println("Студент $firstName идет учиться")
    }

    override fun sleeping() {
        println("Студент $firstName идет спать")
    }

    override fun playsTheGuitar() {
        println("Студент $firstName играет на гитаре")
    }
}