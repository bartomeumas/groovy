class CommandLineArgsTest {
    public static void main(def args) {
        println("Printing arguments: ")
        for (String arguments : args) {
            println(arguments)
        }
    }
}