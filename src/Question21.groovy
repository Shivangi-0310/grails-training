class Question21 {
    static void main(String[] args) {
        Map<String, Map<String, Integer>> m = ["Computing"  : ["Computing": 600, "Information Systems": 300],
                                               "Engineering": ["Civil": 200, "Mechanical": 100],
                                               "Management" : ["Management": 800]]
        println("Total university departments:: ")
        println(m.size())

        println("Total programs in computing department:: ")
        println(m.get("Computing").size())

        println("Total students are enrolled in the civil engineering program:: ")
        println(m.get("Engineering").get("Civil"))

    }
}
