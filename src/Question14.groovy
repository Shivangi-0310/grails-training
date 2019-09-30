class Question14 {
    static void main(String[] args) {
        List list=1..100
        list.each {
            if(it % 3==0 && it % 5==0)
                println("FizzBuzz")
            else if (it % 3==0)
                println("Fizz")
            else if (it % 5==0)
                println("Buzz")
            else
                println(it + " ")
        }
    }
}
