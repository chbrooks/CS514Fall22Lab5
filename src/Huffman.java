import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Huffman {

    public BinaryTree huffmanTree;
    String inputFile;
    public Map<String, Integer> letterCounts;
    public Map<String, String> codes;

    public Huffman(String fName) {
        inputFile = fName;
        letterCounts = new HashMap<String, Integer>();
        codes = new HashMap<String, String>();
    }


    /* Step 1. Implement this. */
    public void getLetterFrequencies() {

    }

    public void buildTree() {
        PriorityQueue<Node> queue = new PriorityQueue<Node>();
        getLetterFrequencies();

        double total = 0;
        /* Step 3: get the total count of all letters. */


        /* Step 3: Create a leaf node for each letter and frequency and insert them into the queue. */

        /* Step 3: While the queue has more than one element,
           Remove the two lowest-frequency nodes. Create a new node that has these nodes as children.
           Its frequency should be the sum of its children's frequencies.
        Add the new node back into the priority queue. */


        huffmanTree = new BinaryTree(queue.poll());
    }

    /* step 4: you do buildCodes in the Node class. */
   public void getCodes() {
        if (huffmanTree.root == null) {
            return;
        } else {
            huffmanTree.root.buildCodes(codes);
        }
    }

    /* step 5. */
    /* let's assume that our original message will take 8 bits to encode each character. */
    public String encode(String message) {
        return "";
    }

    /* step 6: */
    /* to decode, we traverse the tree. You do decode in Node. */
    public String decode(String message) {
        /* let's start by creating a Scanner to help us consume the message */
        StringBuilder decodedMessage = new StringBuilder();
        Scanner messageScanner = new Scanner(message);
        messageScanner.useDelimiter("");
        while (messageScanner.hasNext()) {
            decodedMessage.append(huffmanTree.decode(messageScanner));
        }
        return decodedMessage.toString();
    }


}
