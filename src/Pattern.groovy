class Pattern {
    static void printPatternAccordingToNumber(int number){
        int i, j, max=1  ;
        for(i=1;i<=number;i++)
        {
            for(j=1;j<=max;j++)
            {
                print( "*")
            }
            println( " ")
            max=max*2;
        }
    }

    static void main(String[] args) {

        println "Enter the number for pattern:: \n"
        int number = System.in.newReader().readLine() as int

        printPatternAccordingToNumber(number)
    }
}
