package example.myapp

open class Aquarium(open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {
//    init {
//        println("aquarium initializing")
//    }
//    init {
//        println("Volume: ${width * height * length / 1000} l")
//    }

    open val shape = "Rectangle"
    open var water: Double = 0.0
        get() = volume * 0.9

    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    open var volume: Int
        get() = width * length * height / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    fun printSize() {
        println(
            "Width: $width cm " +
                    "Length: $length cm " +
                    "Height: $height cm "
        )

        println("Volume: $volume l Water: $water l (${water/volume*100.0}% full)")
    }
}