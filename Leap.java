/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leap;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Leap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%4==0)
                {
                    System.out.println("the number is leap");   
                }
else
        {
            System.out.println("THE NUMBER IS NOT LEAP");
        }
    }
}
