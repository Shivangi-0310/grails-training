class Question6 {
    static void main(String[] args) {
        List list = [1, 2, 3, "element1", 0.3, [2, 4, 6], 0..10]
        println"classes of the elements::\n"
        for (l in list) {
            println(l.getClass())
        }

        println(list.get(6).get(5))
    }
}
