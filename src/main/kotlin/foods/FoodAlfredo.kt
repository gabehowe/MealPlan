package foods

import Ingredient

class FoodAlfredo(
) : BaseFood(false) {
    override var requiredIngredients: Set<Ingredient> = mutableSetOf(
        Ingredient.FETTUCCINE,
        Ingredient.HEAVY_CREAM,
        Ingredient.BUTTER,
        Ingredient.ROMANO,
        Ingredient.SALT,
        Ingredient.BLACK_PEPPER
    )
    override var unrequiredIngredients: Set<Ingredient> = mutableSetOf(Ingredient.LEMON_JUICE,Ingredient.NUTMEG)
    override val name = "Fettuccine Alfredo"
}