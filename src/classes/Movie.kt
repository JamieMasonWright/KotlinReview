package classes

class VideoGame(private val name:String, private val genre: String, private var difficulty: String){



    fun getData() = "The game is $name in the Genre $genre, with the chosen difficulty $difficulty"

    fun changeDifficulty(difficulty: String){
        this.difficulty = difficulty
    }
}

fun main(){

    val avatar = VideoGame("Avatar", "Science-Fiction", "Easy")
    println(avatar.getData())

    avatar.changeDifficulty("Medium")
    println(avatar.getData())

    val movieTwo = VideoGame("GroundHog Day", "Comedy", "Medium")
    println(movieTwo.getData())
}

