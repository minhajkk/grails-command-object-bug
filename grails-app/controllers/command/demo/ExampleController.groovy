package command.demo

class ExampleController {

    def action1(ExampleCommand1 command) {
        println command

        render (text:command.toString())
    }

    def action2(ExampleCommand2 command) {
        println command

        render (text:command.toString())
    }
}
