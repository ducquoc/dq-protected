package vn.ducquoc.cc.execute.cme.staircase;

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
 * FYI, (2018) just copied from HackerRank: //hackerrank.com/challenges/staircase
 * //hackerrank.com/challenges/time-conversion
 * //hackerrank.com/challenges/birthday-cake-candles
 * <p></p>
 * Access https://www.compilejava.net/ and paste there like a pro! ( > 90% will be NPE not compatible HackerRank)
 *
 * @see //github.com/ducquoc/fresher-training/blob/master/hackerrank-java-examples/src/main/java/vn/ducquoc/hr/warmup10/Solution.java
 * @see //github.com/ducquoc/fresher-training/blob/master/hackerrank-java-examples/src/test/java/vn/ducquoc/hr/warmup10/SolutionTest.java
 */
@SuppressWarnings("unused")
public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= n-1-i) System.out.print("#");
                else System.out.print(" ");
            }
            System.out.println();//System.out.print("\n");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
