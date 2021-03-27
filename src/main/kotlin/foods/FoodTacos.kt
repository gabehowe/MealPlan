package foods

import Ingredient

class FoodTacos : BaseFood(true) {
    override var requiredIngredients: Set<Ingredient> = mutableSetOf(
        Ingredient.GROUND_BEEF,
        Ingredient.POWDER_CHILI,
        Ingredient.CUMIN,
        Ingredient.SALT,
        Ingredient.BEANS,
        Ingredient.LETTUCE,
        Ingredient.SPINACH,
        Ingredient.CORN_TORTILLA
    )
    override var unrequiredIngredients: Set<Ingredient> = mutableSetOf(Ingredient.SALSA)
    override val name = "Tacos"
}