package foods

import Ingredient

class FoodBLTs : BaseFood(true) {
    override var requiredIngredients: Set<Ingredient> =
        mutableSetOf(Ingredient.BREAD, Ingredient.BACON, Ingredient.LETTUCE, Ingredient.TOMATO)
    override var unrequiredIngredients: Set<Ingredient> = mutableSetOf(Ingredient.MUSTARD)
    override val name = "BLTs"
}