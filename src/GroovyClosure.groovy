class GroovyClosure {
    public static void main(String[] args) {

        def isContainedInList = {
            a, b -> a.contains(b)
        }

        def a = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        def num = 3

        println(a.class.name)
        println(":::: ${isContainedInList(a, num)}")
    }
}
