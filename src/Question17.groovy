class Question17 {
    static void main(String[] args) {
        Map<String,Integer> map1 = ["a": 1, "b": 2, "c": 3, "d": 4, "e": 5]
        Map<String,Integer> map2 = ["f": 6, "g": 7, "h": 8, "i": 9, "j": 10]
        Map map3 = map1 + map2
        println("New map:: ${map3}")

    }
}
