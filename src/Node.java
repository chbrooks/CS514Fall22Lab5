import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Node implements Comparable<Node> {
    protected String data;
    protected double frequency;
    protected Node leftChild;
    protected Node rightChild;

    public Node(String inputData, double f) {
        this.data = inputData;
        this.frequency = f;
        leftChild = null;
        rightChild = null;
    }
/* step 2: */
    public int compareTo(Node other) {
      return 0;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    /* step 2 */
    public boolean isLeaf() {
        return false;
    }


     public void buildCodes(Map<String, String> codes) {
        buildCodes(codes, "");
    }

    /* step 4 */
    public void buildCodes(Map<String, String> codes, String codeSoFar) {

    }
    /* step 6. you do this part. */
    public String decode(Scanner inputScanner) {
        return "";
    }

}

