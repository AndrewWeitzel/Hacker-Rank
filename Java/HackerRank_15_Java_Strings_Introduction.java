/*
    This exercise is to test your understanding of Java Strings. 
    
    The elements of a String are called characters. The number of characters in a String is 
    called the length, and it can be retrieved with the String.length() method.

    Given two strings of lowercase English letters, A and B, perform the following operations:

        1. Sum the lengths of A and B
        2. Determine if A is lexicographically larger than B (i.e.: does come before in the 
           dictionary?).
        3. Capitalize the first letter in A and B and print them on a single line, separated 
           by a space.
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println(A.length() + B.length());
        
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        A= A.substring(0,1).toUpperCase() + A.substring(1, A.length());
        B= B.substring(0,1).toUpperCase() + B.substring(1, B.length());
        
        System.out.println(A+" "+B);

    }
}



