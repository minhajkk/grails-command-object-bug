package command.demo

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(ExampleController)
class ExampleControllerSpec extends Specification {

    void "test command object with uppercase field"() {
        when: "OrderID is passed in params"
        controller.params.OrderID = "1238383X333"
        controller.action1()

        then:
        response.status == javax.servlet.http.HttpServletResponse.SC_OK
    }

    void "test command object with camelcase field"() {

        when: "OrderID is passed in params"
        controller.params.orderID = "1238383X333"
        controller.action2()

        then:
        response.status == javax.servlet.http.HttpServletResponse.SC_OK
    }
}
