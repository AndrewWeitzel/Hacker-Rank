/*
    Two strings, a and b, are called anagrams if they contain all the 
    same characters in the same frequencies. For example, the anagrams 
    of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

    Complete the function in the editor. If a and b are case-insensitive 
    anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.

    Input Format:
        The first line contains a string denoting a.
        The second line contains a string denoting b.

    Constraints:
        - 1 ≤ length(a), length(b) ≤ 50
        - Strings a and b consist of English alphabetic characters.
        - The comparison should NOT be case sensitive.

    Output Format:
        Print "Anagrams" if a and b are case-insensitive anagrams of each 
        other; otherwise, print "Not Anagrams" instead.

    Sample Input:
        anagram
        margana

    Sample Output:
        Anagrams

       
*/
import java.util.Scanner;

public class Solution {

        static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length()){
            return false;
        }
        else {
            char [] aString, bString;
            aString = a.toLowerCase().toCharArray();
            bString = b.toLowerCase().toCharArray();
            java.util.Arrays.sort(aString);
            java.util.Arrays.sort(bString);
            /* 
                had to use fully qualified names (java.util.Arrays...) 
                because the assignment would not allow imports
            */ 
            for(int i =0; i<a.length(); i++) {
                 if(aString[i] == bString[i]) {
                     continue;
                 }
                 else {
                     return false;
                 }
            }
            return true;
           
           /*
            or... no for loop solution
            return java.util.Arrays.equals(aString, bString);
            */
        }
    
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}