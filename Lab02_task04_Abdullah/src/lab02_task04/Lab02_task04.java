/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_task04;
import java.util.Scanner;
/**
 *
 * @author ABDULLAH
 */
public class Lab02_task04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
       int x=sc.nextInt();
       int [] a=new int[x];
       for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
       }
       int [] b=new int[x];
       for(int i=0;i<b.length;i++){
        b[i]=sc.nextInt();
       }
       for(int i=0;i<a.length;i++){
           System.out.print(5*a[i]-b[i]+" ");
       }
        System.out.println("");
    }
    
}
