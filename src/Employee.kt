class Employee : Person(firstName = "", lastName = "", age = 0) {
    override fun typeOfActivity() {
        println("Сотрудник $firstName идет учиться")
    }

    override fun sleeping() {
        println("Сотрудник $firstName идет спать")
    }

    override fun playsTheGuitar() {
        println("Сотрудник $firstName играет на гитаре")
    }
}