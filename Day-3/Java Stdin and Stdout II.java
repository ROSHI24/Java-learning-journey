/*
 * Problem: Java Stdin and Stdout II
 * Platform: HackerRank
 * Topic: Input and Output
 *
 * Concepts Learned:
 * - Scanner class
 * - nextInt(), nextLine(), nextDouble()
 * - If there is space in the sentence,then get input for space alone and proceed with new sentence
 * - Reading user input
 * - Printing output
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();       
        

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
