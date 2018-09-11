package vn.ducquoc.cc.execute.cme.birthdaycakecandles;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.*;/* Java 8 */

/**
 * CME - <b>Contact My Email</b>: ducquoc.vn@gmail.com
 * <br></br>
 * FYI, (2018) just copied from HackerRank: //hackerrank.com/challenges/birthday-cake-candles
 * //hackerrank.com/challenges/time-conversion
 * //hackerrank.com/challenges/staircase
 * <p></p>
 * Access https://www.compilejava.net/ and paste there like a pro! ( > 90% will be NPE not compatible HackerRank)
 *
 * @see //github.com/ducquoc/fresher-training/blob/master/hackerrank-java-examples/src/main/java/vn/ducquoc/hr/warmup10/Solution.java
 * @see //github.com/ducquoc/fresher-training/blob/master/hackerrank-java-examples/src/test/java/vn/ducquoc/hr/warmup10/SolutionTest.java
 */
@SuppressWarnings("unused")
public class Solution {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int n = ar.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (ar[i] > max) max = ar[i];
        }
        int countHighest = 0;
        for (int i = 0; i < n; i++) {
            if (ar[i] == max) countHighest++;
        }

        return countHighest;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));//compatible old HackerRank

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
