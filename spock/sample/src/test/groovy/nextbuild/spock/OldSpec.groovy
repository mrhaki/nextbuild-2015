package nextbuild.spock

import spock.lang.Specification

class OldSpec extends Specification {

    def "if we add an item to a list to the total size of the list is incremented by 1"() {
        given:
        final List<String> names = []

        when:
        names << 'NextBuild'

        then:
        names.size() == old(names.size()) + 2
    }
}
