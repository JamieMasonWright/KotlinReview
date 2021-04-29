// 2-04 Challenge - Custom Accessors & Companion Objects - Starter

/*
Challenge 1:
Check out the Wizard class below and run the project.
Right now, `fullName` doesn't change when you update a wizard's first or last name.
Change the Wizard's fullName to a read-only computed property to fix that!
**Bonus Challenge**
Add a custom setter that will split a full name into a first and last name.
Only set firstName and lastName if the value contains exactly two names separated by a space
Hint: Use `.split(" ")` to split the value passed in into a list of strings
*/

/*
Challenge 2:
Add a "commonMagicalIngredients" list as a companion object property on Wizard.
Fill it with any magical ingredients you like!
*/

class Wizard(var firstName: String, var lastName: String) {
    var fullName: String
        get() = "$firstName $lastName"
        set(newFullName) {
            val names = newFullName.split(" ")
            if (names.size != 2) {
                println("$newFullName is not a proper full name for a wizard")
            } else {
                firstName = names.first()
                lastName = names.last()
            }
        }

    companion object{
            var magicalIngredient =  mutableListOf<String>(
                "WaterWorm",
                "Mudcress",
                "Weeping Cotton",
                "Translucent Cranial asp"
            )
    }

}

fun main() {
    val wizard = Wizard("Hermione", "Sidious")
    println(wizard.fullName)

    wizard.lastName = "Skywalker"
    println(wizard.fullName)

    wizard.fullName = "BryanDumbleCluff"
    wizard.fullName = "Jeffery the great"

    println("First Name is ${wizard.firstName} and the last name is ${wizard.lastName}")

    wizard.fullName = "Gangster Potter"
    println("First name is ${wizard.firstName} and last name is: ${wizard.lastName}")
    println("Full name is ${wizard.fullName}")

    Wizard.magicalIngredient.add("Forest tree")
    println(Wizard.magicalIngredient)
}