package vn.ducquoc.cc.execute.cme.ycopysillyjavatest;

/*
********************************************
*                  JAVA TEST               *
* Test - Reverse string                    *
* Level: Intermediate                      *
* Time: 30 min                             *
********************************************
Note: You can Google for commands, syntax, format, Java docs. But you can't search for algorithm or solutions

1. Access https://www.compilejava.net/ . This website allow you to run simple Java application

2. Copy source code below to editor in Compilejava.net

3. Happy coding. You have 30 mins

4. Time up!!! Save your result to zip file.

PASTE THE CODE BELOW TO https://www.compilejava.net/
=============================================================================================================
*/

//**********************************************************************
// Welcome to Expert Java Developer Test
// If you experience any issues, please contact MyEmail (CME)
//**********************************************************************

/**
 Given string, return a reversed string.

 ** Example
 Input: "Hello World"
 Output: "dlroW olleH"

 Requirement: Not allow to use any method from Java API.

 */
public class StringReverseIntermediate {

    /* no main method provided (nor tests) - just copy to compilejava.net and create zip file to submit to us */
    public static String reverseString(String inputStr) {
        //I am not an "expert" nor "intermediate" and I don't want to search Google
        // for char array manipulation https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
        return inputStr == null ? null : new StringBuffer(inputStr).reverse().toString();
        //who cares if intermediate or not? It's wise to re-use good API. And not wasting 29 minutes of my life.

        //If you want to scare candidates and complain about their English, you can ask "power of number"
        // https://www.geeksforgeeks.org/smallest-power-of-2-greater-than-or-equal-to-n/
    }

}
