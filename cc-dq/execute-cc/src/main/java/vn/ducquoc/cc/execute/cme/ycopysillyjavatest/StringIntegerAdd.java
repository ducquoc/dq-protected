package vn.ducquoc.cc.execute.cme.ycopysillyjavatest;

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
 Given two strings representing integer numbers, return a string representing the sum of the two numbers.
 <br></br>
 ** Example
 Input: ("123", "30")
 Output: "153"
 <br></br>
 Assume that input numbers are all positive.
 <p></p>
 Originally a C++ interview question, but silly in JavaTest because of built-in like Integer.parseInt() . Better
 pick another from //github.com/yangshun/tech-interview-handbook/blob/master/algorithms/string.md

 @see //glassdoor.com/Interview/Given-two-strings-representing-integer-numbers-123-30-return-a-string-representing-the-sum-of-the-two-numbers-153-QTN_529092.htm
 @see //robertxj.blogspot.com/2014/03/given-two-strings-representing-integer.html
 */
@SuppressWarnings("unused")
public class StringIntegerAdd {

    /**
     * Java impl of old C++ approach: //github.com/codelucas/puzzles/blob/master/java_interview/StringNumAdd.java
     */
    static String addStringInteger(String s1, String s2) {
        //return String.valueOf(Integer.parseInt(s1) + Integer.parseInt(s2));
        return String.valueOf(Integer.valueOf(s1) + Integer.valueOf(s2));
    }

    /**
     * Bonus SQL "interview question" Binary Tree Nodes to scare newbies/interviewees - and still feel smart/academic
     * (but don't be a silly copycat - at least try test it yourself).
     *
     * @see //runscovey.wordpress.com/2016/06/21/binary-search-tree-bst-query-in-sql/
     * @see //stackoverflow.com/questions/41170071/get-root-inner-and-leaf-nodes-from-a-table
     */
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "30";
        System.out.println(addStringInteger(s1, s2));
    }

}
