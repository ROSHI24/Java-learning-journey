/*
 * Problem: Java output formatting
 * Platform: HackerRank
 * Topic: output formatting
 *
 * Concepts Learned:
 %15s
 * - left alignment: - 
 * - min width of 15 characters
 * - s is string format
 %03d
 * - 0 is zero padding i.eis adding zeros
 * - 3 is width of 3 characters
 * - d is decimal number format
 %n is line break
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n",s1,x);
            }
            System.out.println("================================");

    }
}

