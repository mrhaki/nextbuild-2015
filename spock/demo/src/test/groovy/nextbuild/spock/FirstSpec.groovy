package nextbuild.spock

import spock.lang.Specification

class FirstSpec extends Specification {

    def "when I add an item to a list the first item should be that item"() {
        setup:
        final List<String> names = ['Eindhoven']

        when:
        names << 'NextBuild'

        then:
        names.size() == old(names.size()) + 1
    }
}
