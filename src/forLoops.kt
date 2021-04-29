fun main(){
    val daysOfWeek = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    daysOfWeek[2] = "Crap day"

    val mutableDaysOfWeek = daysOfWeek.toMutableList()

    mutableDaysOfWeek.add("Funday")
    mutableDaysOfWeek.remove("Sunday")
    println(mutableDaysOfWeek)

    val countriesVisited = arrayOf("Thailand", "Malaysia", "Vietnam", "Egypt", "Germany", "France", "Italy")

    var i = 0
    while(i < countriesVisited.size){
        println("Country at index $i is ${countriesVisited[i]}")
        i += 1
    }

    do{
        println("Country at index $i is ${countriesVisited[i]}")
        i += 1
    }while (i < countriesVisited.size)

    var index = 1

    while (index < 16){
        println(index)
        index += 1
    }


    val name = mutableListOf<String>("Jamie", "Aida", "Pebble", "Eli")

    index = name.lastIndex

    do
    {
        if(index > name.lastIndex || index < 0) return
        println(name[index])
        index -= 1
    }while(index > 0 && index < name.size)

    val countries = arrayOf("Thailand", "Malaysia", "Vietnam", "Egypt", "Germany", "France", "Italy")

    val rangeFromZeroToTen = 0..10
    println(rangeFromZeroToTen)

    val exclusiveRange = 0 until 10
    println(exclusiveRange)

    for(index in rangeFromZeroToTen step 2) {
        print (index)
    }
    println("")

    for(index in 10 downTo 0){
        print(index)
    }

    println("")

    for(countryIndex in countries.indices)
    {
        print("${countries[countryIndex]} ")
        println("")
    }

    for(country in countries){
        print("$country ")
    }

//
    //declare variable
    val range = 10..30
    //for numbers is range go up in three
    for(number  in range step 3){
        print("$number, ")
    }

    println("")

    val reverseRange = 30 downTo 15

    for(number in reverseRange step 2){
        print("$number ")
    }

}