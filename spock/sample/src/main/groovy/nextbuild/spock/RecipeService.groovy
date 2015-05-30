package nextbuild.spock

import groovy.transform.CompileStatic

@CompileStatic
class RecipeService {

    RecipeRepositoryService recipeRepositoryService

    Integer count(final String partOfTitle, final int moreThanMinutes) {

        final recipes = recipeRepositoryService.allLongerThan(moreThanMinutes)

        recipes?.count { Recipe recipe ->
            recipe.title ==~ /.*${partOfTitle}.*/
        } as Integer

    }
}
