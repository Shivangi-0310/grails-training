class Question11 {
    static void main(String[] args) {

        println "Enter a number:: \n"
        int number = System.in.newReader().readLine() as int
        int i = 1

        10.times {println (i*number); i++}


    }
}
