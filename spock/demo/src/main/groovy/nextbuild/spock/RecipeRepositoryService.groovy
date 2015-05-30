package nextbuild.spock

import groovy.transform.CompileStatic

@CompileStatic
class RecipeRepositoryService {

    final List<Recipe> recipes = [
            new Recipe("Apple pie", 40),
            new Recipe("French fries", 35),
            new Recipe("Pancakes", 4)
    ]

    List<Recipe> allLongerThan(final int moreThanMinutes) {
        recipes.findAll { Recipe recipe ->
            recipe.timeInMinutes >= moreThanMinutes
        }
    }
}
