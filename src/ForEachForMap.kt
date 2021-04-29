fun main(){

    var prices = arrayOf(1.50, 10.00, 4.99, 2.30, 8.19)

    // 'forEach' - loops over a collection and performs an operation

    // 'forEach' as a 'for' loop

//    for(price in prices){
//        println(price)
//    }

    prices.forEach {
        println(it)
    }

    prices.forEach { price ->
        println(price)
    }

    prices.forEach (::println)


    //'map' - Loops over a collection, executes lamda code, returns a new collection

    //'map' as a 'for' loop

    var salesPrices = mutableListOf<Double>()
    for(price in salesPrices){
        salesPrices.add(price * 0.9)
    }
    println(salesPrices)

    val salePrice = prices.map {price ->
        price * 0.9
    }
    println(salePrice)

    val salePrice1 = prices.map { it * 0.9 }
    println(salePrice1)




    //'mapNotNull'

    val userInput = listOf("meow", "15", "37.5", "seven", "42")

    val numbers = userInput.map { it.toIntOrNull() }
    println(numbers)

    val validInput = userInput.mapNotNull { it.toIntOrNull() }
    println(validInput)


}