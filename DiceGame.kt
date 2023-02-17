fun main() {
    println("creating 3 dice using all 3 constructors")
    val die1 = Die()
    val die2 = Die(30)
    val die3 = Die("Coin", 2)

    println("${die1.name} side up before rolling is ${die1.currentSideUp}")
    println("${die2.name} side up before rolling is ${die2.currentSideUp}")
    println("${die3.name} side up before rolling is ${die3.currentSideUp}")

    die1.roll()
    die2.roll()
    die3.roll()

    println("${die1.name} side up after rolling is ${die1.currentSideUp}")
    println("${die2.name} side up after rolling is ${die2.currentSideUp}")
    println("${die3.name} side up after rolling is ${die3.currentSideUp}")

    die3.currentSideUp = die3.sides
    println("${die3.name} has been set to it's highest value, which is ${die3.currentSideUp}")

    println("Playing Yahtzee")
    var rollCount = 0
    println("Creating 5 d6s")
    val yahtzeeDie1 = Die()
    val yahtzeeDie2 = Die()
    val yahtzeeDie3 = Die()
    val yahtzeeDie4 = Die()
    val yahtzeeDie5 = Die()
    do {
        yahtzeeDie1.roll()
        yahtzeeDie2.roll()
        yahtzeeDie3.roll()
        yahtzeeDie4.roll()
        yahtzeeDie5.roll()
        rollCount++
    } while(!(yahtzeeDie1.currentSideUp == yahtzeeDie2.currentSideUp
        && yahtzeeDie1.currentSideUp == yahtzeeDie3.currentSideUp
        && yahtzeeDie1.currentSideUp == yahtzeeDie4.currentSideUp
        && yahtzeeDie1.currentSideUp == yahtzeeDie5.currentSideUp))

    println("Yahtzee at $rollCount rolls with a value of ${yahtzeeDie1.currentSideUp}")
}