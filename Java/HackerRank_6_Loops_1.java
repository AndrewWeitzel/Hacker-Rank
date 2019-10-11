/*
    Objective
    In this challenge, we're going to use loops to help us do some simple
    math.

    Task:
    Given an integer, N, print its first 10 multiples. Each multiple N x i
    (where 1 ≤ i ≤ 10) should be printed on a new line in the form: N x i = 
    result.

    Input Format:
    A single integer, N.

    Constraints:
    2 ≤ N ≤ 20

    Output Format:
    Print 10 lines of output; each line i (where 1 ≤ i ≤ 10) contains the result of
    N x i in the form: N x i = result.

*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N >= 2 && N<=20){
            for(int i = 1; i < 11; i++){
                System.out.println(N + " x " + i + " = " + i*N);
            }
        }
        scanner.close();
    }
}


