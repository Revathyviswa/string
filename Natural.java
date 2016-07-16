/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package natural;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Natural {

   
    public static void main(String[] args) {
         int sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("the sum is"+sum);
    }
}
