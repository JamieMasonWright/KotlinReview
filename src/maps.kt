fun main(){
    val videoGameCollection = mutableMapOf<String, MutableList<String>>()

    println(videoGameCollection)

    videoGameCollection["Action"] = mutableListOf("Overwatch", "Cyberpunk", "GTA")
    println(videoGameCollection)

    val actionGames  = videoGameCollection["Action"]
    println(actionGames)

    val strategyGames = videoGameCollection["Strategy"]
    println(strategyGames)

    val legacy = videoGameCollection["Legacy"]
    println(legacy)

    val authenticationHeaders = mapOf(
        "API-KEY" to "your-api-key",
        "Authorisation" to "auth token",
        "content/type" to "application/json"
    )
    println(authenticationHeaders)

    videoGameCollection["Strategy"] = mutableListOf("AFK arena")
    println(videoGameCollection)

    videoGameCollection["Strategy"]?.add("Black and White")
    println(videoGameCollection)

    videoGameCollection["Legacy"] = mutableListOf("Insterted")
    videoGameCollection["Legacy"]?.add("Coming")
    println(videoGameCollection)

//    videoGameCollection.remove("Action")

    for(value in videoGameCollection.values){
        println(value)
    }

    for(key in videoGameCollection.keys){
        println(key)
    }

    for((key, value) in videoGameCollection){
        println("Video games in the $key genre you own are $value")
    }


    val pets = mutableMapOf<String, String>()
    pets ["Pebble"] = "Dacshund"
    pets ["Muff"] = "Rabbit"
    pets ["Eli"] = "Human"

    for((name, breed ) in pets){
        println("The pet $name is a $breed")
    }

    pets.remove("Eli")
    println(pets)

}