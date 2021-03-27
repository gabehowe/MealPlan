package foods

import Ingredient

class FoodBurgers : BaseFood(true) {
    override var requiredIngredients: Set<Ingredient> =
        mutableSetOf(
            Ingredient.GROUND_BEEF,
            Ingredient.HAMBURGER_BUNS,
            Ingredient.CHEDDAR,
            Ingredient.PICKLES,
            Ingredient.TOMATO,
            Ingredient.SPINACH,
            Ingredient.SALT,
            Ingredient.POWDER_GARLIC,
            Ingredient.POWDER_ONION
        )
    override var unrequiredIngredients: Set<Ingredient> = mutableSetOf(
        Ingredient.LETTUCE,
        Ingredient.A1_SAUCE,
        Ingredient.KETCHUP,
        Ingredient.MUSTARD,
        Ingredient.BACON
    )
    override val name = "Hamburgers"
}