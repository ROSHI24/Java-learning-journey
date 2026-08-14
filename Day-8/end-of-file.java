/*
 * Problem: end-of-file
 * Platform: HackerRank
 * Topic: handling end of file
 *
 * Learned:
 * -hasNestline() that chceks for next full line instead of token
 * - in java8 .trim().isempty() to check if input is empty
 */
 import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);
    for(int i=1;sc.hasNextLine() ;i++){
        String str1 = sc.nextLine();
        if(str1.trim().isEmpty()){
            break;      }
        else{
            System.out.printf("%d %s\n",i,str1);
            }
    
    }
}
}

