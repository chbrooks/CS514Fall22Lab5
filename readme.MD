Lab 5: Huffman coding.

Due 10/31, start of class.

In this lab, you'll work with three different data structures (Priority Queues, HashMaps, and Binary Trees) in order to develop a tool that can generate optimal compression and decompression for a text file.

To submit: Please check this lab back into your GitHib repo by the due date.

The lab will be graded according to the specifications grading method described in the syllabus.Specifically:

A completed, on-time lab is worth 2 points.

A lab that is late or incomplete is worth 1 point.

A lab that is missing is worth 0 points.

Background:
We're going to be implementing a technique known as Huffman coding. The basic idea is this:

Standard ASCII text uses 8 bits to store each letter. So a message of 100 characters requires 800 bits.

We can do better than this if we take advantage of the *frequency* of the letters in our message, and use fewer bits to encode common letters and more bits to encode rare letters.

Step 1:
We need to build up an estimate of the frequencies of different letters. To do this, we'll take a sample file as input and count all the characters in it. Implement the getLetterFrequencies() method in Huffman.java; it should open the file referred to by the inputFile member variable,
read in each character, and keep a count of all the characters using the letterCounts HashMap.

Step 2: 
Once we have these, we need to set up our BinaryTree class. BinaryTree uses the Node class as a helper class.
I've given you quite a bit of this - you implement isLeaf() and compareTo() in the Node class. You should use frequency to compare nodes.

Step 3:
Now we're ready to start creating a Huffman Tree. The basic idea is this:

We generate a Node for each letter/frequency combination, and insert those into the Priority Queue.

We then repeatedly dequeue the two lowest-frequency nodes, make a new parent node, and enqueue that.

More specifically:
1. We need to know the total count of all frequencies, so let's add a loop into buildTree to do that.
2. For each item in our letterCounts Map, create a Node and add that to the priority queue.

Now we're ready to build the Huffman Tree. 

While the queue has more than one element, 

- Remove the two lowest-frequency nodes. Create a new node that has these nodes as children. Its frequency should be the sum of its children's frequencies. 
- Add the new node back into the priority queue.

Step 4: Now that we have our tree built, we can use it to generate Huffman codes. We'll store these codes in the 'codes' Map, which maps a letter to its code.

The code for each letter is the path from the root to the leaf containing that letter. If we follow a left child, we add a '0' to the code, and if we follow the right child, we'll add a '1'.
To keep it simple, we'll store the code as a String - a more efficient representation would be a bitstring.

So what we'll do is a pre-order traversal of the tree. Every time we reach a leaf, we'll add the code to the codes Map.
If we're not at a leaf, we'll add a '0' to codeSoFar and traverse the left child,
and add a '1' and traverse the right child.

Step 5: Encoding. Now we're ready to encode a message. To do this, we iterate through our message and, for each letter, we look up the Huffman code in the codes Map.
Implement the encode method in Huffman.java. As part of that, keep track of the size of the original message (8 bits per character) and the encoded message (1 bit per element of the code.)

Step 6: Last, let's implement decode. To decode a message, we treat it as a stream of bits. We then traverse our Huffman tree with the stream; if we're at a leaf, emit the letter
stored at the leaf. Otherwise, if the next item in the stream is a 0, follow the left child.
Or, if it's a 1, follow the right child. 
