package mjs.examples;

class MyTest {

    def multiply(int num1, num2) {
        return num1 * num2
    }

    static void main(String[] args) {
        def test = new MyTest()
        println multiply(5, 3)
    }
}
