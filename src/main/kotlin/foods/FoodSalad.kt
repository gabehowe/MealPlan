package foods

import Ingredient

class FoodSalad : BaseFood(false) {
    override var requiredIngredients: Set<Ingredient> = mutableSetOf(
        Ingredient.LETTUCE,
        Ingredient.SPINACH,
        Ingredient.CARROT,
        Ingredient.EGG,
        Ingredient.CROUTONS
    )
    override var unrequiredIngredients: Set<Ingredient> = mutableSetOf()
    override val name = "Salad"
}