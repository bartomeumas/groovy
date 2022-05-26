class FileIO {
    static void main(String[] args){
        new File("testforfileIO.txt").eachLine{
            line -> println "$line"
        }

        new File("testforfileIO.txt").withWriter('utf-8') {
            writer -> writer.writeLine("Oh no you overwrote everything :C")
        }

        File file = new File("testforfileIO.txt")
        file.append('You appended to the test file c:')

        println(file.text)
    }
}