import foods.*
 class MealOption {
     companion object {
         fun loadMeal(mealOption: MealOptions): BaseFood {
             val meal : BaseFood = when (mealOption) {
                 MealOptions.BEANS_AND_CORNBREAD -> FoodBeansCornbread()
                 MealOptions.BLTS -> FoodBLTs()
                 MealOptions.CHICKEN_QUESADILLAS -> FoodChickenQuesadillas()
                 MealOptions.CHICKEN_SANDWICHES -> FoodChickenSandwiches()
                 MealOptions.CHILI -> FoodChili()
                 MealOptions.FETTUCCINE_ALFREDO -> FoodAlfredo()
                 MealOptions.HAMBURGERS -> FoodBurgers()
                 MealOptions.LASAGNA -> FoodLasagna()
                 MealOptions.MAC_AND_CHEESE -> FoodMacCheese()
                 MealOptions.POTATOES_AND_SAUSAGE -> FoodSausagePotatoes()
                 MealOptions.SALAD -> FoodSalad()
                 MealOptions.SOUP -> FoodSoup()
                 MealOptions.SPAGHETTI -> FoodSpaghetti()
                 MealOptions.TACOS -> FoodTacos()
                 MealOptions.TACO_STUFFED_AVOCADOS -> FoodTacoAvocados()
             }
             return meal
         }
     }

     enum class MealOptions {
         BEANS_AND_CORNBREAD,
         BLTS,
         CHICKEN_QUESADILLAS,
         CHICKEN_SANDWICHES,
         CHILI,
         FETTUCCINE_ALFREDO,
         HAMBURGERS,
         LASAGNA,
         MAC_AND_CHEESE,
         POTATOES_AND_SAUSAGE,
         SALAD,
         SOUP,
         SPAGHETTI,
         TACOS,
         TACO_STUFFED_AVOCADOS,
     }
 }