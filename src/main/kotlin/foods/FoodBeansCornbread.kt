package foods

import Ingredient

class FoodBeansCornbread : BaseFood(false) {
    override var requiredIngredients: Set<Ingredient> = mutableSetOf(
        Ingredient.FLOUR,
        Ingredient.CORNMEAL,
        Ingredient.SUGAR,
        Ingredient.BAKING_POWDER,
        Ingredient.SALT,
        Ingredient.EGG,
        Ingredient.OIL,
        Ingredient.BEANS,
        Ingredient.CUMIN,
        Ingredient.POWDER_CHILI,
        Ingredient.MILK
    )
    override var unrequiredIngredients: Set<Ingredient> = mutableSetOf()
    override val name = "Beans & Cornbread"
}