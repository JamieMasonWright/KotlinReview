package classes

//Well defined group of data
//Always represents the data defined in the class
//Properties - state of the class
//Methods = behaviour of the class

class Person(var name:String, var lastName: String, var age: Int)

fun main(){

    val jamie = Person("Jamie", "Mason-Wright", 35)
    val aida = Person("Aida", "Shala", 32 )

    println("His name is: ${jamie.name} ${jamie.lastName} and his age is ${jamie.age}")
    println("Her name is: ${aida.name} ${aida.lastName} and his age is ${aida.age}")

    val jamieClone = Person("Jamie", "Mason-Wright", 35)
    println(jamie == jamieClone)
    println(jamie === jamieClone)


    //Encapsulation
    //Mutability
    //Composition
    //Referenece and values




}
