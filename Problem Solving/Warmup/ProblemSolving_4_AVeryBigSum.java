/*
    Calculate and print the sum of the elements in an array, keeping 
    in mind that some of those integers may be quite large.

    Function Description:

      Complete the aVeryBigSum function in the editor below. It must 
      return the sum of all array elements.

    aVeryBigSum has the following parameter(s):

      ar: an array of integers .

    Input Format:

      The first line of the input consists of an integer n.
      The next line contains n space-separated integers contained 
      in the array.

    Output Format:

      Print the integer sum of the elements in the array.

    Constraints:
      1 ≤ n ≤ 100
      1 ≤ ar[i] ≤ 10^10


*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long bigSum = 0;
        for(int i = 0; i < ar.length; i++) {
            bigSum += ar[i];
        }
        return bigSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] ar = new long[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong(arItems[i]);
            ar[i] = arItem;
        }

        long result = aVeryBigSum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

