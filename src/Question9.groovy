class Question9 {
    static void main(String[] args) {
        String s = "this string need to be split"
        println s.tokenize()
        println s.tokenize(" ")
        println s.split(" ")
        println s.split(/\s/)
        println s.tokenize(/\s/)


        String s1 = "are.you.trying.to.split.me.mister?"
        println s1.tokenize(".")
        println s1.split(".")

    }
}
