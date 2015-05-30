package nextbuild.spock

import spock.lang.Specification
import spock.lang.Subject

class MockSpec extends Specification {

    @Subject
    private final RecipeService recipeService = new RecipeService()

    private RecipeRepositoryService recipeRepositoryService = Mock()

    def setup() {
        recipeService.recipeRepositoryService = recipeRepositoryService
    }

    def "use minutes param to invoke repository to find recipes"() {
        when:
        recipeService.count('sample', 10)

        then:
        1 * recipeRepositoryService.allLongerThan(10)
    }

    def "check count returns correct number for check on recipe title"() {
        when:
        final Integer found = recipeService.count('sample', 10)

        then:
        1 * recipeRepositoryService.allLongerThan(10) >> [
                new Recipe('NextBuild sample', 20),
                new Recipe('Other recipe', 20),
                new Recipe(/sample recipe/, 40)
        ]

        found == 2

    }
}
