/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fact;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Fact {

    
    public static void main(String[] args) {
       int n, fact=1;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
           fact=fact*i;
           
       }
        System.out.println("the factorial" +fact);
    }
}
