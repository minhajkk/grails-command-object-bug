grails-command-object-bug
=========================

This repo is created for bug reported on Grails Jira @ [GRAILS-11691](https://jira.grails.org/browse/GRAILS-11691)

``` groovy 
| Running 2 unit tests... 1 of 2
--Output from test command object with uppercase field--
| Failure:  test command object with uppercase field(command.demo.ExampleControllerSpec)
|  java.lang.IllegalArgumentException: Can not set java.lang.String field command.demo.ExampleCommand1.OrderID to java.lang.Class
	at command.demo.ExampleCommand1._clinit__closure1(ExampleCommand1.groovy:19)
	at command.demo.ExampleControllerSpec.test command object with uppercase field(ExampleControllerSpec.groovy:15)
Can not set java.lang.String field command.demo.ExampleCommand1.OrderID to java.lang.Class
java.lang.IllegalArgumentException: Can not set java.lang.String field command.demo.ExampleCommand1.OrderID to java.lang.Class
	at command.demo.ExampleCommand1._clinit__closure1(ExampleCommand1.groovy:19)
	at command.demo.ExampleControllerSpec.test command object with uppercase field(ExampleControllerSpec.groovy:15)
```
