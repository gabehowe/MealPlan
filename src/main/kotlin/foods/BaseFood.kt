package foods

import Ingredient

abstract class BaseFood(hasMeat: Boolean) {
    abstract var requiredIngredients: Set<Ingredient>
    abstract var unrequiredIngredients: Set<Ingredient>
    abstract val name : String
}