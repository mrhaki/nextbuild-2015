package nextbuild.spock

import groovy.transform.Immutable
import groovy.transform.ToString

@ToString
@Immutable
class Recipe {

    String title
    int timeInMinutes

}
