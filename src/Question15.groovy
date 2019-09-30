class Question15 {
    static void main(String[] args) {
        List<Integer> list = []
        int choice
        while (true) {
            println("Enter Choice  \n 1. for push \n 2. for pop  \n 3.to get top \n 4 . for display  \n5. for exit")
            choice = System.in.newReader().readLine() as int

            if (choice == 1) {
                println("Enter element to push")
                int element = System.in.newReader().readLine() as int
                list.push(element)
            } else if (choice == 2) {
                list.pop()
            } else if (choice == 3) {
                println(list.last())
            } else if (choice == 4) {
                println(list)
            } else
                break


        }

    }
}
