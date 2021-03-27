package foods

import Ingredient

class FoodTacoAvocados : BaseFood(true) {
    override var requiredIngredients: Set<Ingredient> = mutableSetOf(
        Ingredient.GROUND_BEEF,
        Ingredient.POWDER_CHILI,
        Ingredient.CUMIN,
        Ingredient.SALT,
        Ingredient.BEANS,
        Ingredient.LETTUCE,
        Ingredient.SPINACH,
        Ingredient.AVOCADO
    )
    override var unrequiredIngredients: Set<Ingredient> = mutableSetOf(Ingredient.SALSA)
    override val name = "Taco Stuffed Avocados"
}