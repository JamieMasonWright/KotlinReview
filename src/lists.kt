fun main() {
//
////    val creditCard = Triple("1234345", "123", "Visa")
////    val bankAccount = Pair(20000.00, creditCard)
////
////    val(balance, card) = bankAccount
////    val(cardNumber, securityCard, cardType) = card
////
////    println("The account has $securityCard and the card number is $cardNumber and the $cardType")
////
////    val countries = arrayOf("Thailand", "Malaysia", "Vietnam", "Egypt", "Germany", "France", "Italy")
////
////    println(countries[2])
////
////    countries[2] = "America"
////
////    println(countries[2])
////    println(countries.lastIndex)
////    println(countries.last())
////    println(countries.first())
////
////    val currentCountry = "United Kingdom"
////
////
////    val hasVisitedSpain = currentCountry in countries
////    val hasNotVisitedSpain = currentCountry !in countries
////
////    println(hasNotVisitedSpain)
////    println(hasVisitedSpain)

    val countries = listOf("Thailand", "Malaysia", "Vietnam")
    println(countries)

    val mutableCountries = countries.toMutableList()

    mutableCountries.add(1, "Germany")
    mutableCountries.add("Albania")

    println(mutableCountries)

    val hasBeenToJapan = "Japan" in mutableCountries
    val hasBeenToAlbania = "Albania" in mutableCountries
    println(hasBeenToJapan)
    println(hasBeenToAlbania)

    mutableCountries.remove("Germany")
    mutableCountries.removeAt(1)
    mutableCountries.removeAll(listOf("Malaysia", "Thailand"))

    println(mutableCountries)

    val combinedList = countries + mutableCountries
    val emptyList = emptyList<String>()

    println(mutableCountries)
    println(combinedList)
    println(emptyList)

    val favouriteGames = arrayOf("Cyberpunk", "GTA", "Super Mario", "Horizon Zero Dawn", "God of War")
    println(favouriteGames[2])
    favouriteGames[2] = "Super Mario 64"
    println(favouriteGames[2])

    val mutableGames = favouriteGames.toMutableList()
    println(mutableGames)
    mutableGames.add("AFK Arena")
    mutableGames.addAll(listOf<String>("AFK Arena", "Another One"))
    mutableGames.remove("Cyberpunk")
    println(mutableGames)
    val cyberPunkDead = "Cyberpunk" in mutableGames
    println(cyberPunkDead)
    println(mutableGames)






}