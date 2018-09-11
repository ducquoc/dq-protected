package vn.ducquoc.cc.execute.cme.timeconversion;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;/* Java 8 */

/**
 * CME - <b>Contact My Email</b>: ducquoc.vn@gmail.com
 * <br></br>
 * FYI, (2018) just copied from HackerRank: //hackerrank.com/challenges/time-conversion
 * //hackerrank.com/challenges/birthday-cake-candles
 * //hackerrank.com/challenges/staircase
 * <p></p>
 * Access https://www.compilejava.net/ and paste there like a pro! ( > 90% will be NPE not compatible HackerRank)
 *
 * @see //github.com/ducquoc/fresher-training/blob/master/hackerrank-java-examples/src/main/java/vn/ducquoc/hr/warmup10/Solution.java
 * @see //github.com/ducquoc/fresher-training/blob/master/hackerrank-java-examples/src/test/java/vn/ducquoc/hr/warmup10/SolutionTest.java
 */
@SuppressWarnings("unused")
public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String timeText = s;//07:05:45PM -> 19:05:45
        String hourText = timeText.substring(0, 2);
        if (timeText.endsWith("AM")) {
            if ("12".equals(hourText)) {
                hourText = "00";
            }
        } else { // PM
            if (!"12".equals(hourText)) {
                hourText = String.valueOf(12 + Integer.valueOf(hourText));
            }
        }
        timeText = hourText + timeText.substring(2, timeText.length() - 2);
        return timeText;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {//silly copy & paste might not work outside HR
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//compatible old HackerRank

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }

}
