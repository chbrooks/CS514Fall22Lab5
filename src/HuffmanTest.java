class HuffmanTest {
    Huffman huffman;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        huffman = new Huffman("movieReviews.txt");
    }

    @org.junit.jupiter.api.Test
    void getLetterFrequencies() {
        huffman.getLetterFrequencies();
        for (String key : huffman.letterCounts.keySet()) {
            System.out.printf("%s %d\n", key, huffman.letterCounts.get(key));
        }
    }

    @org.junit.jupiter.api.Test
    void buildTree() {
        huffman.buildTree();

    }

    @org.junit.jupiter.api.Test
    void getCodes() {
        huffman.buildTree();
        huffman.getCodes();
        for (String key : huffman.codes.keySet()) {
            System.out.printf("%s %s\n", key, huffman.codes.get(key));
        }
    }

    @org.junit.jupiter.api.Test
    void encode() {
        huffman.buildTree();
        huffman.getCodes();
        String message = "Hello World";
        String encoding = huffman.encode(message);
        System.out.println(encoding);
    }

    @org.junit.jupiter.api.Test
    void decode() {
        huffman.buildTree();
        huffman.getCodes();
        String message = "Hello World";
        String encoding = huffman.encode(message);
        System.out.println(encoding);
        String original = huffman.decode(encoding);
        System.out.println(original);

    }
}