import foods.BaseFood
import org.yaml.snakeyaml.Yaml
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.InputStream


val yaml = Yaml()
fun main() {
    val weekday = mutableListOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
    val inputStream: InputStream = yaml.javaClass.classLoader
        .getResourceAsStream("stock.yml")!!
    val obj = yaml.load<Map<String, Any>>(inputStream)
    val set = mutableSetOf<MealOption.MealOptions>()
    val map = mutableMapOf<BaseFood, MutableList<Ingredient>>()
    val file = File("./Meal_Plan.md")
    file.createNewFile()
    file.writeText("Meal Plan\n======\n\n")

    val fileReader = FileReader(file)
    for (i in 0..6) {
        var random : Int
        file.appendText("\n**${weekday[i]}** ")
        while (true) {
            val rand = (Math.random() * (MealOption.MealOptions.values().size + 0)).toInt()
            if (!set.contains(MealOption.MealOptions.values()[rand])) {
                random = rand
                break
            }
        }
        val meal = MealOption.loadMeal(MealOption.MealOptions.values()[random])
        set.add(MealOption.MealOptions.values()[random])
        file.appendText("${meal.name}\n\n")
        for (e in meal.requiredIngredients) {
            if (map[meal] == null) {
                map[meal] = mutableListOf()
            }
            if (!(obj[e.toString()] as Boolean)) {
                map[meal]!!.add(e)
            }
        }
        file.appendText("**Missing**\n")
        for (e in map[meal]!!) {
            file.appendText("+ $e \n".toLowerCase())
        }
    }

}