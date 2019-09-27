class TestMultiples {
    void printMultipleOfNumber(int number) {
        int i = 1;
        println "First way:::"
        10.times {
            println(i * number);
            i++
        }
        println "Second way ::"

        (1..10).collect { println(it * number) }

        println "Third way ::"

        for(int j=1; j<=10; j++){
            println (number*j)

        }
    }

    static void main(String[] args) {
        new TestMultiples().printMultipleOfNumber(3)

    }
}
