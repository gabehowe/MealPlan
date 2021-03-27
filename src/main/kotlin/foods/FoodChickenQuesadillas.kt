package foods

import Ingredient

class FoodChickenQuesadillas : BaseFood(true) {
    override var requiredIngredients: Set<Ingredient> =
        mutableSetOf(Ingredient.WHEAT_TORTILLAS, Ingredient.ROTISSERIE_CHICKEN, Ingredient.CHEDDAR)
    override var unrequiredIngredients: Set<Ingredient> = mutableSetOf(Ingredient.OLIVE,Ingredient.SALSA,Ingredient.FRESH_PEPPER)
    override val name = "Chicken Quesadillas"
}