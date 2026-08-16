/*
 * Problem: Initializer block
 * Platform: HackerRank
 * Topic: parallelogram area
 *
 * Concepts Learned:
 * - importing scanner
 */
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int B = sc.nextInt();
       int H = sc.nextInt();
       if(B>0 && H>0){
        System.out.print(B*H);
       }
       else{
        System.out.print("java.lang.Exception: Breadth and height must be positive");
       }
    }
}
