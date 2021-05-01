data class Graded(val courseName : String , val letter : Char)

open class Persons(var firstName : String , var lastName : String) {
    fun fullName() = "$firstName $lastName"
}

open class Stud(
    firstName : String , lastName : String ,
    var grades : MutableList<Grade> = mutableListOf()
) : Persons(firstName , lastName) {
    
    open var isEligible : Boolean = true
    
    open fun recordGrade(grade : Grade) {
        grades.add(grade)
    }
}

class BandMembers(firstName : String , lastName : String) : Stud(firstName , lastName) {
    var minimumPracticeTime : Int = 2
    
    override var isEligible = true
        get() = grades.none { it.letter == 'F' }
    
    override fun recordGrade(grade : Grade) {
        super.recordGrade(grade)
        if (! isEligible) println("No more performing for $firstName! Study study study.")
    }
}

class StudentAthletes(firstName : String , lastName : String) : Stud(firstName , lastName) {
    override fun recordGrade(grade : Grade) {
        super.recordGrade(grade)
        isEligible = grades.filter { it.letter == 'F' }.size < 3
        if (! isEligible) println("$firstName can't play in the big game! Time to study.")
    }
}


fun main() {
    val jon = Persons(firstName = "Jon" , lastName = "Snon")
    val jane = Stud(firstName = "Jane" , lastName = "Snane")
    val victor = BandMembers("Victor" , "Wooten")
    val marty = StudentAthletes("Marty" , "McWolf")
//
    val people = arrayOf(jon, jane, victor, marty)
//    val student = arrayOf(jane, victor, marty)
    
    people.forEach { persons ->
        println("${persons.fullName()} is a person!")
        if(persons is Students) println(persons.grades)
    }
    
    val student = victor as Students
    val bassist = student as? Bandmember
    
    fun afterClassActivity(students : Stud) :String{
        return "goes home"
    }
    
    fun afterClassActivity(students : BandMembers) :String{
        return "goes home"
    }
    
    println(afterClassActivity(jane))
    println(afterClassActivity(victor as Stud))
    
}