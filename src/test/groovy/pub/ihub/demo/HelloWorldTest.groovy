package pub.ihub.demo

import spock.lang.Specification



/**
 * @author liheng
 */
class HelloWorldTest extends Specification {

    def 'test getHello'() {
        expect:
        'Hello IHub' == new HelloWorld(text: 'IHub').hello
    }

}
