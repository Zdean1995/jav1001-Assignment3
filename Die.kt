/*
Zachary Dean
A00275392
JAV-1001 - 11354

This is the die class, a class that is used to represent phyiscal dice
 */

import kotlin.random.Random

//The class itself, I've decided to make teh name and sides unchangeable since you can't change the number of sides on a die
class Die {
    val name: String
    val sides: Int
    var currentSideUp = 0

    //zero argument constructor sets the name to d6 and the sides count to 6.  All constructors use the roll function to get the initial side up
    constructor() {
        name = "d6"
        sides = 6
        roll()
    }

    //one argument constructor takes in the number of sides as a parameter and sets the name to "d" plus that number
    constructor(_sides: Int) {
        sides = _sides
        name = "d$sides"
        roll()
    }

    //two argument constructor takes in both the name and the number of sides
    constructor(_name: String, _sides: Int) {
        name = _name
        sides = _sides
        roll()
    }


    fun roll() {
        currentSideUp = Random.nextInt(1, sides)
    }
}