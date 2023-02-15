import kotlin.random.Random

class Die {
    val name: String
    val sides: Int
    var currentSideUp = 0

    constructor() {
        name = "d6"
        sides = 6
    }
    constructor(_sides: Int) {
        sides = _sides
        name = "d$sides"
    }

    constructor(_name: String, _sides: Int) {
        name = _name
        sides = _sides
    }

    fun roll() {
        currentSideUp = Random.nextInt(1, sides)
        println("Your $name rolled a $currentSideUp!")
    }
}