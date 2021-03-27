package foods

import Ingredient

class FoodMacCheese : BaseFood(false) {
    override var requiredIngredients: Set<Ingredient> = mutableSetOf(
        Ingredient.MACARONI,
        Ingredient.CHEDDAR,
        Ingredient.BREAD_CRUMBS,
        Ingredient.BUTTER,
        Ingredient.SALT,
        Ingredient.BLACK_PEPPER,
        Ingredient.MILK
    )
    override var unrequiredIngredients: Set<Ingredient> = mutableSetOf()
    override val name = "Macaroni & Cheese"
}