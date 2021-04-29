fun main(){

    fun operateOnNumbers(a: Int, b : Int, operation: (Int, Int) -> Int):Int{
        return operation(a, b)
    }

    val addLambda = {a: Int, b: Int ->
        a + b
    }

    operateOnNumbers(4, 2, operation = addLambda)
    print(operateOnNumbers(2, 6, addLambda))

    fun addfunction(a:Int, b: Int) = a + b
    operateOnNumbers(4, 2, operation = ::addfunction)


    //conclusion to lambda

    /*See dwarves below, I want them organized like this:
    -Grouped by which names come before or after M in the alphabet
    -Sorted by name length
    -No dwarves with names less than four letters long
    -Turn drarves before M into a map, grouped by the firs letters in their names
     */

    val lotsOfFDwarves = listOf(
        listOf( "Grumpy", "Doc", "Bashful", "Sneezy"),
        listOf("Thorin", "Norin", "Bombur"))


    val (beforeM, mAndAfter) =  lotsOfFDwarves.flatMap { dwarves ->
        dwarves.filter{it.length > 3}
    }.sortedBy { -it.length < 4 }.partition { it < "M" }



    val groupedBeforeM = beforeM.groupBy { it.first() }
    println(groupedBeforeM)
    println(mAndAfter)
}