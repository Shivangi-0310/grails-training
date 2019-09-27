class OddNumberedFile {

    public static void main(String[] args) {
        File input = new File("/home/ttn/Documents/first.txt")
        File output = new File("/home/ttn/Documents/oddline.txt")
        int i = 1;
        input.eachLine {
            line ->
                if(i % 2 ==1){
                    output << i + line+"\n"
                }
                i++;
        }
    }
}