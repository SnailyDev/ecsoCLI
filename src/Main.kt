import utils.person.Person
import utils.car.Car

fun main() {
    val snaki = Person("Andrei", "Minecraft", 10)
    snaki.whoIsIt()
    snaki.whoIsMe()

    val myCar = Car("Toyota", "Corolla", 2020, 5)
    myCar.sayInfo()
}
