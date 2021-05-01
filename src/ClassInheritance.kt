data class Grade(val courseName: String, val letter: Char, val credits: Double)

open class Human(var firstName: String , var lastName: String){
    fun fullName() = "$firstName $lastName"
}

open class Students(firstName : String, lastName : String,
                var grades: MutableList<Grade> = mutableListOf()) : Human(firstName, lastName){
   open fun recordGrade(grade: Grade){
        grades.add(grade)
    }
}

class Bandmember(firstName : String, lastName : String) : Students(firstName,lastName){
    var minimumPractice : Int = 2
    
}

class StudentAthlete(firstName : String, lastName : String) : Students(firstName, lastName){
    open var isEligible: Boolean = true
    
    override fun recordGrade(grade : Grade) {
        super.recordGrade(grade)
        isEligible = grades.filter { it.letter == 'F' }.size < 3
        if(!isEligible) println("Your grade is $grade, you must study harder")
    }
}


fun main(){
    
    val jamie = Students(firstName = "Jamie", lastName = "Mason-wright")
    val aida = Human(firstName = "Aida", lastName = "Shala")
    val pebble = Bandmember(firstName = "Pebble", lastName = "Shitbut")
    val eli = StudentAthlete(firstName = "Eli", lastName = "Mason-Wright")
    
    val computerScience = Grade(courseName = "CS", letter = 'A', credits = 4.0)
    jamie.recordGrade(computerScience)
    println(jamie.grades)
    println("${pebble.fullName()} practices for ${pebble.minimumPractice}")
    println(eli.isEligible)
    
    
    val gradeFailure = Grade("Bullshit", 'F',2.0)
    jamie.recordGrade(gradeFailure)
    jamie.recordGrade(gradeFailure)
    jamie.recordGrade(gradeFailure)
    jamie.recordGrade(gradeFailure)
    
    
    


}

