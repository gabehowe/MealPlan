package foods

import Ingredient

class FoodSpaghetti : BaseFood(true) {
    override var requiredIngredients: Set<Ingredient> =
        mutableSetOf(Ingredient.SPAGHETTI, Ingredient.GROUND_BEEF, Ingredient.SAUSAGE, Ingredient.TOMATO_SAUCE)
    override var unrequiredIngredients: Set<Ingredient> =
        mutableSetOf(Ingredient.OLIVE, Ingredient.FRESH_ONION, Ingredient.ROMANO)
    override val name = "Spaghetti"
}