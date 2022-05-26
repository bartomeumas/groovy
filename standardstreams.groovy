class GroovyStandarStreams {
    static void main(String[] args) {
        def myName = "Tomeu"
        println("My name is $myName")
        println("What is your name?")
        def userName = System.console().readLine()
        println("Hello " + userName)
    }
}