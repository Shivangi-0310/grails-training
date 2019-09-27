class Question1 {
    static void main(String[] args) {

        List list = [];
        list[11] = "myelement"
        println(list[11])
        println(list)
        println(list.get(5))

        List range=1..10
        for(r in range){
            if(r%2==0){
                print(r+"  ")
            }
        }

    }
}
