class Question5 {
    static void main(String[] args) {
        List list = [1, 2, 3, 4, 7, 87, 54, 33, 66, 65, 100]
        List oddList = []

        for (int i = 0; i < list.size(); i++) {

            if (i % 2 != 0) {
                oddList.add(list[i])
            }
        }

        println "List:: "+list
        println "List with odd numbers::: "+oddList

    }
}
