package nextbuild.spock

import spock.lang.Specification

class SetupSpec extends Specification {

    private List<String> names

    def setup() {
        names = []
    }

    def "check names contains a new item when added"() {
        when:
        names << 'Spock'

        then:
        names.first() == 'Spock'
    }

    def "check names size is 1 when a new item is added to a new list"() {
        when:
        names << 'Spock'

        then:
        names.size() == 1
    }
}
