import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class HuffmanTests {
    @Test(timeout = 10000)
    public void testFrequency() throws Exception {
        Huffman h = new Huffman();

        h.frequency("LocalTests/inputFiles/testMessage1.txt");
        String actual = new String(Files.readAllBytes(Paths.get("frequency.txt")));
        String expected = new String(Files.readAllBytes(Paths.get("LocalTests/correctOut/freq1.txt")));
        Assert.assertEquals(expected, actual);

    }
    @Test(timeout = 10000)
    public void testCodes() throws Exception{
        Huffman h = new Huffman();

        h.buildTree("LocalTests/inputFiles/freq1.txt");
        String actual = new String(Files.readAllBytes(Paths.get("codes.txt")));
        String expected = new String(Files.readAllBytes(Paths.get("LocalTests/correctOut/codes1.txt")));
        Assert.assertEquals(expected, actual);


    }

    @Test(timeout = 10000)
    public void testTree() throws Exception{
        Huffman h = new Huffman();

        h.buildTree("LocalTests/inputFiles/freq1.txt");
        String actual = new String(Files.readAllBytes(Paths.get("tree.txt")));
        String expected = new String(Files.readAllBytes(Paths.get("LocalTests/correctOut/tree1.txt")));
        Assert.assertEquals(expected, actual);


    }

    @Test(timeout = 10000)
    public void testEncode() throws Exception{
        Huffman h = new Huffman();

        h.encode("LocalTests/inputFiles/codes1.txt", "LocalTests/inputFiles/testMessage1.txt");
        String actual = new String(Files.readAllBytes(Paths.get("encode.bin")));
        String expected = new String(Files.readAllBytes(Paths.get("LocalTests/correctOut/encode1.bin")));
        Assert.assertEquals(expected, actual);


    }

    @Test(timeout = 10000)
    public void testDecode() throws Exception {
        Huffman h = new Huffman();

        h.decode("LocalTests/inputFiles/tree1.txt", "LocalTests/inputFiles/encode1.bin");
        System.out.println(h.treeRoot.letter);
        String actual = new String(Files.readAllBytes(Paths.get("decode.txt")));
        String expected = new String(Files.readAllBytes(Paths.get("LocalTests/correctOut/decode1.txt")));
        Assert.assertEquals(expected, actual);


    }

    @Test(timeout = 10000)
    public void testFrequency2() throws Exception {
        Huffman h = new Huffman();

        h.frequency("LocalTests/inputFiles/testMessage2.txt");
        String actual = new String(Files.readAllBytes(Paths.get("frequency.txt")));
        String expected = new String(Files.readAllBytes(Paths.get("LocalTests/correctOut/freq2.txt")));
        Assert.assertEquals(expected, actual);

    }
    @Test(timeout = 10000)
    public void testCodes2() throws Exception{
        Huffman h = new Huffman();

        h.buildTree("LocalTests/inputFiles/freq2.txt");
        String actual = new String(Files.readAllBytes(Paths.get("codes.txt")));
        String expected = new String(Files.readAllBytes(Paths.get("LocalTests/correctOut/codes2.txt")));
        Assert.assertEquals(expected, actual);


    }

    @Test(timeout = 10000)
    public void testTree2() throws Exception{
        Huffman h = new Huffman();

        h.buildTree("LocalTests/inputFiles/freq2.txt");
        String actual = new String(Files.readAllBytes(Paths.get("tree.txt")));
        String expected = new String(Files.readAllBytes(Paths.get("LocalTests/correctOut/tree2.txt")));
        Assert.assertEquals(expected, actual);


    }

    @Test(timeout = 10000)
    public void testEncode2() throws Exception{
        Huffman h = new Huffman();

        h.encode("LocalTests/inputFiles/codes2.txt", "LocalTests/inputFiles/testMessage2.txt");
        String actual = new String(Files.readAllBytes(Paths.get("encode.bin")));
        String expected = new String(Files.readAllBytes(Paths.get("LocalTests/correctOut/encode2.bin")));
        Assert.assertEquals(expected, actual);


    }

    @Test(timeout = 10000)
    public void testDecode2() throws Exception {
        Huffman h = new Huffman();

        h.decode("LocalTests/inputFiles/tree2.txt", "LocalTests/inputFiles/encode2.bin");
        String actual = new String(Files.readAllBytes(Paths.get("decode.txt")));
        String expected = new String(Files.readAllBytes(Paths.get("LocalTests/correctOut/decode2.txt")));
        Assert.assertEquals(expected, actual);


    }





}
