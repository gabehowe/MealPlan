import foods.*
 class MealOption {
     companion object {
         fun loadMeal(mealOption: MealOptions): BaseFood {
             val meal : BaseFood = when (mealOption) {
                 MealOptions.FETTUCCINE_ALFREDO -> FoodAlfredo()
                 MealOptions.HAMBURGERS -> FoodBurgers()
                 MealOptions.SALAD -> FoodSalad()
                 MealOptions.SPAGHETTI -> FoodSpaghetti()
                 MealOptions.LASAGNA -> FoodLasagna()
                 MealOptions.BEANS_AND_CORNBREAD -> FoodBeansCornbread()
                 MealOptions.CHILI -> FoodChili()
                 MealOptions.POTATOES_AND_SAUSAGE -> FoodSausagePotatoes()
                 MealOptions.MAC_AND_CHEESE -> FoodMacCheese()
                 MealOptions.TACOS -> FoodTacos()
                 MealOptions.CHICKEN_QUESADILLAS -> FoodChickenQuesadillas()
                 MealOptions.TACO_STUFFED_AVOCADOS -> FoodTacoAvocados()
                 MealOptions.CHICKEN_SANDWICHES -> FoodChickenSandwiches()
                 MealOptions.BLTS -> FoodBLTs()
                 MealOptions.SOUP -> FoodSoup()
             }
             return meal
         }
     }

     enum class MealOptions {
         FETTUCCINE_ALFREDO,
         HAMBURGERS,
         SALAD,
         SPAGHETTI,
         LASAGNA,
         BEANS_AND_CORNBREAD,
         CHILI,
         POTATOES_AND_SAUSAGE,
         MAC_AND_CHEESE,
         TACOS,
         CHICKEN_QUESADILLAS,
         TACO_STUFFED_AVOCADOS,
         CHICKEN_SANDWICHES,
         BLTS,
         SOUP
     }
 }