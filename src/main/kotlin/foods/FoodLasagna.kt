package foods

import Ingredient

class FoodLasagna : BaseFood(true) {
    override var requiredIngredients: Set<Ingredient> = mutableSetOf(
        Ingredient.GROUND_BEEF,
        Ingredient.LASAGNE,
        Ingredient.RICOTTA,
        Ingredient.MOZZARELLA,
        Ingredient.TOMATO_SAUCE,Ingredient.SALT,Ingredient.BLACK_PEPPER
    )
    override var unrequiredIngredients: Set<Ingredient> = mutableSetOf(Ingredient.FRESH_GARLIC, Ingredient.ROMANO)
    override val name = "Lasagna"
}