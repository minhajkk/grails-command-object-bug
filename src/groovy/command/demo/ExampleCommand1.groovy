package command.demo

import grails.validation.Validateable
import groovy.transform.ToString

/**
 * Created with IntelliJ IDEA.
 * User: minhaj
 * Date: 8/29/14
 * Time: 5:32 PM
 * To change this template use File | Settings | File Templates.
 */
@Validateable
@ToString(includeNames = true, includeFields = true)
class ExampleCommand1 {
    String OrderID

    static constraints = {
        OrderID(nullable:false)
    }

}
