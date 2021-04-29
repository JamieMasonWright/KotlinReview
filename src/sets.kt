fun main (){
    val userIds = setOf("ID18", "IDB4", "ID78", "ID1F")
    println(userIds)

    userIds.size
    print(userIds.size)
    println(userIds.contains("ID18"))
    println("1D78" in userIds)

    val mutableIds = userIds.toMutableList()
    println(mutableIds.add("ID11"))
    println(mutableIds)

    mutableIds.add("ID677")
    println(mutableIds)

    println(mutableIds.remove("ID18"))
    println(mutableIds)

    for(userId in mutableIds){
        println(userId)
    }


    val itemsOnDesk = arrayOf("Phone", "Phone", "Remote", "Laptop", "Pebble")
    val itemsToMutableSet = itemsOnDesk.toMutableSet()
    println(itemsToMutableSet)

    itemsToMutableSet.remove("Phone")
    println(itemsToMutableSet)

    for(itemsOnDesk in itemsToMutableSet){
        println(itemsOnDesk)
    }




}
