package foods

import Ingredient

class FoodSausagePotatoes : BaseFood(true) {
    override var requiredIngredients: Set<Ingredient> = mutableSetOf(Ingredient.SAUSAGE,Ingredient.POTATO,Ingredient.SWEET_POTATO)
    override var unrequiredIngredients: Set<Ingredient> = mutableSetOf()
    override val name = "Sausage & Potatoes"
}