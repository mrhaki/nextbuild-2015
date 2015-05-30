package nextbuild.spock
import spock.lang.Specification

class DataDrivenSpec extends Specification {

    //@Unroll
    def "when item #item is added it must be the first for empty list"() {
        given:
        final List<String> names = []

        when:
        names << item

        then:
        names.first().size() == expectedLength

        where:
        item        | expectedLength
        'Spock'     | getExpectedLengthFromMethod()
        'NextBuild' | 9
        'JDriven'   | 6
    }

    private int getExpectedLengthFromMethod() {
        5
    }
}
