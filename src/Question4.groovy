class Question4 {
    static void main(String[] args) {
        List list1 = [11, 12, 13, 18]
        List list2 = [13, 18, 15]
        List list3 = [16, 19]
        if(!list2.intersect(list1)) {
            println("lists intersect")
        }
        if(!list2.intersect(list3))
        println("lists intersect")

    }
}
