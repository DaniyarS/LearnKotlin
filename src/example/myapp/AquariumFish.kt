package example.myapp

interface FishColor {
    val colour: String
}

class Shark: FishColor, FishAction {
    override val colour = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

object GoldColour : FishColor {
    override val colour = "gold"
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

class Plecostomus(fishColor: FishColor = GoldColour): FishColor by fishColor, FishAction by PrintingFishAction("eat algae")

