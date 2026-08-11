/*
 * Problem: Java loops II
 * Platform: HackerRank
 * Topic: loops
 *
 * Concepts Learned:
 * - for loop concept
 * - power concept done by built in function Java in java.lang.math class
 * - initialisation concept 
 mpow= power multiplied with b
 tpow = total after the mpow step 
 total = 'a' combined with tpow
 */

import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        int a,b,n,mpow=0,total=0;
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            int tpow=0;
            for(int j =0;j<=n-1;j++){
                int pow= (int)Math.pow(2,j);
                mpow = pow*b;
                tpow= tpow+mpow;
                total = a+ tpow;
                System.out.printf("%d ",total);
        }
        System.out.println("");
         
               
        }
        in.close();
}
}

