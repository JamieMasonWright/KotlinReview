import java.lang.Math.atan
import kotlin.properties.Delegates

class Levels(val id: Int, val boss: String){

    companion object{
        var hightestLevel = 2
    }
    var unlocked: Boolean by Delegates.observable(false){
        _, old, new ->
        if(new && id > hightestLevel){
            hightestLevel = id
        }
    }
}

class LightBulb{
    companion object{
        const val maxCurrent = 40
    }
    var current by Delegates.vetoable(0){
            _,_,new ->
        if(new > maxCurrent){
            println("Current too high, falling back to previous setting")
            false
        }else{
            true
        }
    }
}

class Circle(var raduius: Double = 0.0){
    val pi: Double by lazy { ((4.0 * atan(1.0 / 5.0)) - atan(1.0 / 239.0)) * 4.0 }
    val circumference: Double
    get() = pi * raduius * 2
}

class Lamp{
    lateinit var bulb : LightBulb
}






fun main(){
    
    
    val circle = Circle(5.0)
    println(circle.circumference)
    val light = LightBulb()
    light.current = 9000
    println(light.current)
    light.current = 40
    println(light.current)
    
    val fancyLamp = Lamp()
    fancyLamp.bulb = light
    println(fancyLamp.bulb)
    
        val level1 = Levels(id = 1, boss = "Outside Cat")
        val level2 = Levels(id = 2, boss = "Laser Pointer")
        val level3 = Levels(id = 3, boss = "Attic Sound")
        val level4 = Levels(id = 4, boss = "Vacuum")

    level1.unlocked = true
        println("Highest level is ${Levels.hightestLevel}")

    level4.unlocked = true
    println("Highest level is ${Levels.hightestLevel}")
    
    

}
