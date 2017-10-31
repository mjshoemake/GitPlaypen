package mjs.examples;

class MyTest {

    void logStuff() {
        println "Log msg #1."
        println "Log msg #2."
        println "Log msg #3."
        println "Log msg #4."
        println "Log msg #5."
        println "Log msg #6."
        println "Log msg #7."
    }

    static void main(String[] args) {
        MyTest test = new MyTest()
        logStuff()
        println "Done logging."
    }
}
