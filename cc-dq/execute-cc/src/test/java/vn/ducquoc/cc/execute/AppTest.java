package vn.ducquoc.cc.execute;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;/* Java 8 */

/**
 * Created by ducquoc.
 *
 * @see //github.com/ducquoc/fresher-training/blob/master/hackerrank-java-examples/src/test/java/vn/ducquoc/hr/warmup1/SolutionTest.java
 * @see //github.com/ducquoc/fresher-training/blob/master/hackerrank-java-examples/src/test/java/vn/ducquoc/hr/warmup10/SolutionTest.java
 * @see //github.com/ducquoc/fresher-training/blob/master/hackerrank-java-examples/src/test/java/vn/ducquoc/hr/euler012/SolutionTest.java
 */
@SuppressWarnings("unused")
public class AppTest {

    public static InputStream readResource(String resourcePath) {

        return Thread.currentThread().getContextClassLoader().getResourceAsStream(resourcePath);
    }

    public static String readInputStream(InputStream is) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(is));//YAGNI: ByteArrayOutputStream
        String expected = "", line = "";
        while((line = buff.readLine()) != null) {
            expected += line + System.getProperty("line.separator");
        }
        buff.close();
        return expected;
    }

    /**
     * Java 7 Files.readAllBytes() , Guava Files.toString(), commons-io FileUtils.readFileToString()
     */
    public static String readResourceAsString(String resourcePath) throws IOException {
        return readInputStream(readResource(resourcePath));
    }

    public String getOutputResultFromMainRunStdin(String resourcePath) {
        OutputStream outputContent = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(outputContent);
        System.setOut(ps); // google OutputCapture/SystemOutRule

        System.setIn(readResource(resourcePath));// file stdin: < PATH/input00.txt
        App.main(new String[0]);

        String output = outputContent.toString();
        System.setOut(null);
        System.setIn(null);

        return output;
    }

    @org.junit.Test(timeout=10000)
    public void test_run_app_output_stdout_input_stdin_00() throws Exception {

        //String actual = getOutputResultFromMainRunStdin("euler012/input00.txt");
        //String expected = readResourceAsString("euler012/output00.txt");
        //org.junit.Assert.assertEquals(expected.trim(), actual.trim());
        //setUp
        OutputStream outputContent = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(outputContent);
        System.setOut(ps); // google OutputCapture/SystemOutRule

        InputStream inputContent = Thread.currentThread().getContextClassLoader().getResourceAsStream("input00.txt");
        System.setIn(inputContent);

        //testTarget
        App solution = new App();
        solution.main(null);//new String[]{readInputStream(inputContent)};

        //assertion
        String actual = outputContent.toString();
        String expected = "ducquoc";// can read from file output00.txt;
        org.junit.Assert.assertEquals(expected, actual.trim());

        //tearDown
        System.setOut(null);
        System.setIn(null);
    }

}
