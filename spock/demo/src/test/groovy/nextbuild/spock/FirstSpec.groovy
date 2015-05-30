package nextbuild.spock

import spock.lang.Specification

class FirstSpec extends Specification {

    def "check if item is added to a list"() {
        given: 'Create an empty list'
        final List<String> names = []

        when: 'Added item to the list'
        names << 'Spock'

        then: 'Check if item is added'
        names.first() == 'spock'
    }

    def "check size of string"() {
        expect:
        'Spock'.size() == 5
    }

}
