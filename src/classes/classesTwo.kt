package classes

class Pet(var name: String, val animalType: String )


class PersonNew(
    private val name:String,
    private val  lastName:String,
    private var age: Int,
    var pet:Pet
) {
    fun setAge(age: Int){
        if(age in 0..150){
            this.age = age

        }else{
            //invalid range
        }
    }

    fun getAge()= age

    fun getFullInformation(): String{
        return "Full Name: $lastName, $name, Age: $age, and has the pet ${pet.name} who is a ${pet.animalType}"
    }

}


fun main(){
    val dog = Pet("Pebble", "Dacshund Mini")
    val jamie = PersonNew("Jamie", "Mason-Wright", 53, dog)
    println(jamie.getFullInformation())

    jamie.setAge(50)
    println(jamie.getAge())
    println(jamie.pet.name)


}

