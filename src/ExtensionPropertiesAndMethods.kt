import java.lang.Math.PI

class Circles(var radius: Double = 0.0) {
    val circumference: Double
        get() = PI * radius * 2
}


val Circle.diameter : Double
    get() = 2.0 * raduius

val month = arrayOf(
    "Janauary", "Februrary", "March", "April", "May", "June",
    "July", "August", "September", "October", "November", "December")



class SimpleDates(var month: String) {
    
    fun monthsUntilJingleBells() : Int {
        return months.indexOf("December") - months.indexOf(month)
    }
    
}




fun main(){

    val unitCircle = Circle(1.0)
    println("diameter: ${unitCircle.diameter}")
}
