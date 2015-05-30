package nextbuild.spock

import spock.lang.Specification
import spock.lang.Subject

class StubSpec extends Specification {

    @Subject
    private final RecipeService recipeService = new RecipeService()

    private RecipeRepositoryService recipeRepositoryService = Stub()

    def setup() {
        recipeService.recipeRepositoryService = recipeRepositoryService
    }

    def "check count returns correct number for check on recipe title"() {
        given:
        recipeRepositoryService.allLongerThan(10) >> [
                new Recipe('NextBuild sample', 20),
                new Recipe('Other recipe', 20),
                new Recipe(/sample recipe/, 40)
        ]

        expect:
        recipeService.count('sample', 10) == 2
    }
}
