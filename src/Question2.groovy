class Question2 {
    static void main(String[] args) {

        List list = [1, 1, 2, 5, 6, 8, 9, 8, 9, 8, 1, 2, 3, 4, 5]
        Set set = list.toSet()
        println("List output::  " + list)
        println("Set output::  " + set)
        List outputList = []

        println "first::\n"
        for (l in list) {
            if (!outputList.contains(l)) {
                outputList.add(l)
            }
        }
        println("OutputList ::  " + outputList)

        println "\nsecond::"

        println("Unique List :: "+ list.unique())
    }
}
