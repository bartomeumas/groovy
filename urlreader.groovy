class URLReader {
    static void main(String[] args){
        println 'http://www.google.com'.toURL().text
        println 'http://www.facebook.com'.toURL().text

        def data = new URL('https://stackoverflow.com/questions/943873/connect-to-url-and-dump-webpage-in-groovy').getText()
        println data
    }
}