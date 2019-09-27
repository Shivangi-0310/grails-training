class FileCombination {
    void combineFileData()
    {
        def first = new File('/home/ttn/Documents/first.txt')
        new File('/home/ttn/Documents/sample/').eachFile() { file->
            first << file.text
        }
    }

    static void main(String[] args) {
        new FileCombination().combineFileData()
    }
}
