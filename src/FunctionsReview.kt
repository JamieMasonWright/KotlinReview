fun main(){

    fun printRange(){
        for(number in 1..5) print("$number \t")
        println()
    }

    printRange()

    fun printRange(range: IntRange){
        for(number in range) print("$number \t")
        println()
    }

    printRange(6..10)

    fun createRange(start: Int, end: Int, isHalfOpen: Boolean): IntRange{
        return if (isHalfOpen){
            start until end
        }else{
            start..end
        }
    }

    val halfOpenRange = createRange(11, 15, true)
    printRange(halfOpenRange)

    val nameArguments = createRange(isHalfOpen = true, start = 100, end = 115)
    printRange(nameArguments)

    printRange(createRange(100, end = 101, isHalfOpen = false))
//    createRange(start = 12, end = 24, false) //This mixing named arguments cannot be done.


    fun createRange(start: Char, end: Char, isHalfOpen: Boolean = false)=
        if(isHalfOpen) start until end else start..end


    fun printRange(range: CharRange){
        for(char in range) print("$char \t")
            println()
        }


    val closedRange = createRange('A', 'G')
    printRange(closedRange)

}