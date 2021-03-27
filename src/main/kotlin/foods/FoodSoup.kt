package foods

import Ingredient

class FoodSoup : BaseFood(false) {
    override var requiredIngredients: Set<Ingredient> = mutableSetOf(
        Ingredient.TOMATO_SAUCE,
        Ingredient.PUMPKIN_MUSH,
        Ingredient.SALT,
        Ingredient.BREAD,
        Ingredient.POWDER_GARLIC,
        Ingredient.OIL,
        Ingredient.BUTTER
    )
    override var unrequiredIngredients: Set<Ingredient> = mutableSetOf()
    override val name = "Soup (Pumpkin or Tomato)"
}