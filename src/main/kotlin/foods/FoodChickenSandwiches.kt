package foods

import Ingredient

class FoodChickenSandwiches : BaseFood(true) {
    override var requiredIngredients: Set<Ingredient> =
        mutableSetOf(Ingredient.BREAD, Ingredient.ROTISSERIE_CHICKEN, Ingredient.CHEDDAR)
    override var unrequiredIngredients: Set<Ingredient> =
        mutableSetOf(Ingredient.MUSTARD, Ingredient.SPINACH, Ingredient.LETTUCE)
    override val name = "Chicken Sandwiches"
}