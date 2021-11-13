//************* FIRST TASK *************//

//import kotlin.random.Random
//
//fun randomDay() : String {
//    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
//    return week[Random.nextInt(week.size)]
//}
//
//
//fun fishFood(day: String) : String {
//    // var food = ""
//
//    return when(day) {
//        "Monday" -> "flakes"
//       // "Tuesday" -> food = "pellets"
//        "Wednesday" -> "redworms"
//        "Thursday" -> "granules"
//       // "Friday" -> food = "mosquitoes"
//        "Saturday" -> "lettuce"
//        "Sunday" -> "plankton"
//        else -> "nothing"
//    }
//
//    // return food
//}

//
//fun feedTheFish() {
//    val day = randomDay()
//    val food = fishFood(day)
//    println("Today is $day and the fish eat $food")
//}

//************* FIRST TASK *************//

//************* SECOND TASK *************//

//fun swim(speed: String = "fast") {
//    println("swimming $speed")
//}
//
//fun isTooHot(temperature: Int) = temperature > 30
//
//fun isDirty(dirty: Int) = dirty > 30
//
//fun isSunday(day: String) = day == "Sunday"
//
//fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
//    return when {
//        temperature > 30 -> true
//        dirty > 30 -> true
//        day == "Sunday" -> true
//        else -> false
//    }
//
//    return when {
//        isTooHot(temperature) -> true
//        isDirty(dirty) -> true
//        isSunday(day) -> true
//        else -> false
//    }
//}

//************* SECOND TASK *************//

fun main(args: Array<String>) {
//    println("Hello world!")
//
//    println("Hello, ${args[0]}")
//
//    val isUnit1 = println("This is an expression")
//    println(isUnit1)

//    val temperature = 10
//    val isHot = if (temperature > 50 ) true else false
//    println(isHot)
//    val message = "The water temperature is ${if(temperature > 50) "too warm" else "OK"}."
//    println(message)

//    feedTheFish()

//    swim()
//    swim("slow")
//    swim(speed = "turtle-like")

//    val day = randomDay()
//    val food = fishFood(day)
//    println("Today is $day and the fish eat $food")
//    println("Change water: ${shouldChangeWater(day)}")

//********* SECOND PART OF LESSON, FILTERS *********//

//    println( decorations.filter { it[0] == 'p' })
//    val filtered = decorations.asSequence().filter { it[0] == 'p' }
//    println("filtered: $filtered")
//    val newList = filtered.toList()
//    println("new list: $newList")
//
//    val lazyMap = decorations.asSequence().map {
//        println("access: $it")
//        it
//    }
//
//    println("lazy: $lazyMap")
//    println("-----")
//    println("first: ${lazyMap.first()}")
//    println("-----")
//    println("all: ${lazyMap.toList()}")

//    val lazyMap2 = decorations.asSequence().filter { it[0] == 'p' }.map {
//        println("access: $it")
//        it
//    }
//    println("-----")
//    println("filtered: ${lazyMap2.toList()}")
//********* SECOND PART OF LESSON, FILTERS *********//

//********* SECOND PART OF LESSON, lambdas *********//



//********* SECOND PART OF LESSON, lambdas *********//

}

//val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")