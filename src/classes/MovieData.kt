package classes

fun main() {


    data class MovieData(val name: String, val genre: String, var difficulty: String?){
        fun getData() = "The game is $name, in the $genre genre, with the difficulty $difficulty"

        fun changeDifficulty(difficulty: String){
            this.difficulty = difficulty
        }

    }

    val cybperPunk = MovieData("Cyberpunk", "RPG", "Medium")
    println(cybperPunk)
    cybperPunk.component1()
    cybperPunk.changeDifficulty("Hard")
    println(cybperPunk)
    println(cybperPunk.getData())

    val cybperpunkTwo = cybperPunk.copy(name = "Cybperunk2")
    println(cybperpunkTwo)






}