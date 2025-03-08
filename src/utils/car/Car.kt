package utils.car

class Car(val brand: String, val model: String, val madeinyear: Int? = null, val age: Int? = null) {
    fun sayInfo() {
        if (madeinyear == null && age == null) {
            println("Car brand: $brand, Car model: $model, Made in: Not specified, Age: Not specified")
        } else if (madeinyear == null) {
            println("Car brand: $brand, Car model: $model, Made in: Not specified, Age: $age")
        } else if (age == null) {
            println("Car brand: $brand, Car model: $model, Made in: $madeinyear, Age: Not specified")
        } else {
            println("Car brand: $brand, Car model: $model, Made in: $madeinyear, Age: $age")
        }
    }
}