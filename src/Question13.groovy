class Question13 {
    static void main(String[] args) {
        String string = "this program prints number of occurences of char in string"
        Map map = [:]
        for (int i = 0; i < string.length(); i++) {
            if (map.containsKey(string.charAt(i))) {
                map.put(string.charAt(i), map.get(string.charAt(i)) + 1)
            } else
                map.put(string.charAt(i), 1)
        }
        println(map)

    }
}
