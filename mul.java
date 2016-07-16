/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Table {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        		 
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		
		for(int i=1;i<=10;i++){
			//for(int j=1;j<=n;j++){
				System.out.print(" "+i*n+" ");
			}
			System.out.print("\n");
    }
}
