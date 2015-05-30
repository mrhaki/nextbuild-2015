package nextbuild.spock

import spock.lang.Specification
import spock.lang.Subject

class ExceptionSpec extends Specification {

    @Subject
    private final List<String> names = []

    def "if we access an item from empty list an exception is thrown"() {
        when:
        names.first()

        then:
        final NoSuchElementException exception = thrown()
        exception.message.contains 'Cannot access first1() element'
    }
}
