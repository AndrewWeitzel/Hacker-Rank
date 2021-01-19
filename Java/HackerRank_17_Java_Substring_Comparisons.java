/*
    
    Given a string, S, and an integer, K, complete the function so that it finds the 
    lexicographically smallest and largest substrings of length k.

    Input Format:
        The first line contains a string denoting S
        The second line contains an integer denoting K

    Output Format:
        Return the respective lexicographically smallest and largest substrings as a 
        single newline-separated string.

    Sample Input:
        welcometojava
        3
    Sample Output:
        ava
        wel
*/

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = s.substring(0,k);
        String temp;
        for(int i=0; i < s.length()-k+1; i++){
            temp = s.substring(i,i+k);
            if(smallest.compareTo(temp)>0){
                smallest=temp;
            }
        }
        largest = s.substring(0,k);
        for(int i=0; i < s.length()-k+1; i++){
            temp = s.substring(i,i+k);
            if(largest.compareTo(temp)<0){
                largest=temp;
            }
        }
        
        return smallest + "\n" + largest;
    }
s

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}