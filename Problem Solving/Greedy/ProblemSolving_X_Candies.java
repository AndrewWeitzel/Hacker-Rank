/*
    Alice is a kindergarten teacher. She wants to give some candies 
    to the children in her class. All the children sit in a line and 
    each of them has a rating score according to his or her performance 
    in the class.  Alice wants to give at least 1 candy to each child. 
    If two children sit next to each other, then the one with the higher 
    rating must get more candies. Alice wants to minimize the total 
    number of candies she must buy.

    For example, assume her students' ratings are [4, 6, 4, 5, 6, 2]. 
    She gives the students candy in the following minimal amounts: 
    [1, 2, 1, 2, 3, 1]. She must buy a minimum of 10 candies.

    Function Description:

        Complete the candies function in the editor below. It must return 
        the minimum number of candies Alice must buy.

        candies has the following parameter(s):

            - n: an integer, the number of children in the class
            - arr: an array of integers representing the ratings of each 
              student

    Input Format:

    The first line contains an integer, n, the size of arr.
    Each of the next n lines contains an integer arr[i] indicating the 
    rating of the student at position i.

    Constraints:
        1 ≤ n ≤ 10^5
        1 ≤ arr[i] ≤ 10^5


    Output Format:

        Output a single line containing the minimum number of candies 
        Alice must buy.
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the candies function below.
    static long candies(int n, int[] arr) {
        Array.sort(arr);
        int tempArr = new int[arr.length];
        for(i = 0; i < arr.length/2; i++){
            tempArr[i]= arr[i];
            for(j = arr.length; j > arr.length/2; j--){
                tempArr[j]= arr[j];
            }
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        long result = candies(n, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
