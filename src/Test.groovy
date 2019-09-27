class Test {
    static void main(String... args) {
        if ('Test') {
            println "Test evaluated to true inside if"
        }
        if ("test") {
            println "test evaluated to true inside if"
        }
        if ('null') {
            println "null evaluated to true inside if"
        }
        if (null) {
            println "test evaluated to true inside if"
        }
        if ([]) {
            println "empty list evaluated to true inside if"
        }
        if ([null]) {
            println "list with null evaluated to true inside if"
        }
        if ([0, "hello"]) {
            println "list with content evaluated to true inside if"
        }
        if (0) {
            println "0 with content evaluated to true inside if"
        }
        if (100) {
            println "100 with content evaluated to true inside if"
        }
    }
}
