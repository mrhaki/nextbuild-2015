package nextbuild.spock

import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Unroll

class DataDrivenSpec extends Specification {

    @Subject
    final List<String> names = []

    @Unroll
    def "check item added to empty list is first item in the list"() {
        when:
        names << item

        then:
        names.first() == item

        where:
        item << ['NextBuild', 'Spock', 'JDriven']
    }


    @Unroll
    def "check size of item #item added to list is #expectedLength"() {
        when:
        names << item

        then:
        names.first().size() == expectedLength

        where:
        item        | expectedLength
        'NextBuild' | 9
        'JDriven'   | 7
        'Spock'     | 5
    }
}
