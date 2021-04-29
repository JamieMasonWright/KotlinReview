//Seperate and Reuse Code
//Execute from anywhere
//Parameters
//Return Type
//Function Body

fun main(){


    fun createRange(start: Int, end: Int, isHalfOpen: Boolean = false) =
        if(isHalfOpen){
            start until end
        }else {
            start..end
        }

    fun createRange(start: Char, end: Char, isHalfOpen: Boolean = false) =
        if(isHalfOpen){
            start until end
        }else {
            start..end
        }


    fun printRange(range: IntRange){
        for(numbers in range) print("$numbers \t")
        println()
    }

    fun printRange(range: CharRange){
        for(numbers in range) print("$numbers \t")
        println()
    }

    val closedRange = createRange(1, 10)
    printRange(closedRange)

    val halfOpenRange = createRange(1, 10, true)
    printRange(halfOpenRange)


    val usingNamedAtrguments = createRange(start = 20, end = 45, isHalfOpen = true)
    printRange(usingNamedAtrguments)

    printRange(createRange(3, 5, isHalfOpen = true))


    //function extras
        //Functions as expressions
        //Omitting the body


    val  charRang = createRange('A', 'Z')
    printRange(charRang)

    fun parseCoordinates(input:String) : Pair<Double, Double>{
        val latlongtitude = input.split(",")

        val latitude = latlongtitude[0].toDouble()
        val longtitude = latlongtitude[1].toDouble()

        return latitude to longtitude
    }

    val (latitude, longtitude) = parseCoordinates("45.65, 86.25")
    println("The latitdude is $latitude, and the longtitude is $longtitude")

    fun getFullNamesLength(firstName: String, lastName: String = "") = firstName.length + lastName.length

    fun getFullNamesLength(name: String, middleName: List<String>, lastName: String = " "): Int{
        val nameLength = name.length + lastName.length

        var middleNamesLength = 0
        for(middleName in middleName){
            middleNamesLength += middleName.length
        }

        return middleNamesLength + nameLength
    }

    val myNameLength  = getFullNamesLength("Jamie", "Mason-Wright")
    println(myNameLength)

    val length = getFullNamesLength("Jamie", listOf("Joseph", "Mason-Wright"))
    println(length)


    //Functions as types
        //functions are types too
        //Store functions in variables
        //expect them as parameters in other functions

    


}

