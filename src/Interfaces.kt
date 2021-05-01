
interface Vehicle{
    fun accelerate()
    fun stop()
    
}

class Unicycle() : Vehicle{
    var peddling = false
    
    override fun accelerate() {
        peddling = true
        println("your getting faster")
    }
    
    override fun stop() {
        peddling = false
        println("Slowing down now")
    }
}

enum class Direction{
    LEFT, RIGHT
}

interface  TurningVehicle : Vehicle{
    fun turn(direction : Direction)
    fun description()
}

interface Spacey{
    val tribbleCount : Int
}


interface SpaceVehicle: Vehicle{
    
    val name: String
    get() = "SpaceVehicle"
    
    override fun accelerate() {
        println("Proceed to hyperspace")
    }
    
    override fun stop() {
        println("Slow down")
    }
}

class LightFreighters(): SpaceVehicle{
    var hyperdriveBusted = false
    override fun stop() {
        hyperdriveBusted = true
        println("You need to stop and repair")
    }
    
}

class Starship() : SpaceVehicle, Spacey{
    
    override fun accelerate() {
        println("That was quick")
    }
    
    override fun stop() {
        super.stop()
        println("That kind of hurt")
    }
    
    override val name : String
        get() = "Starship"
    override val tribbleCount : Int
        get() = TODO("Not yet implemented")
}



fun main(){

    val unicycle = Unicycle()
    unicycle.accelerate()
    unicycle.stop()
    
    val falcon = LightFreighters()
    falcon.accelerate()
    falcon.stop()
    
    val enterprise = Starship()
    enterprise.accelerate()
    enterprise.stop()
}