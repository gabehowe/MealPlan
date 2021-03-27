package foods

import Ingredient

class FoodChili : BaseFood(true) {
    override var requiredIngredients: Set<Ingredient> = mutableSetOf(
        Ingredient.BEANS,
        Ingredient.GROUND_BEEF,
        Ingredient.CUMIN,
        Ingredient.POWDER_CHILI,
        Ingredient.SALT,
        Ingredient.POWDER_GARLIC
    )
    override var unrequiredIngredients: Set<Ingredient> = mutableSetOf(
        Ingredient.CORNMEAL,
        Ingredient.EGG,
        Ingredient.SUGAR,
        Ingredient.FLOUR,
        Ingredient.BAKING_POWDER,
        Ingredient.MILK,
        Ingredient.OIL
    )
    override val name = "Chili"
}