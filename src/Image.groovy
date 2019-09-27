class Image {
    static void main(String[] args) {
        File src = new File("/home/ttn/Documents/sampleImage.jpeg")

        new File("/home/ttn/Documents/image1.jpg").withOutputStream {
            out ->
                out.write(src.readBytes())
        }
    }
}
