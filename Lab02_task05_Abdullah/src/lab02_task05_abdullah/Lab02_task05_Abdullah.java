/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_task05_abdullah;
import java.util.Scanner;
/**
 *
 * @author ABDULLAH
 */
public class Lab02_task05_Abdullah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day,month & year");
       Date d=new Date();
       d.setDate(sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println(d.dispalyDate());
    }
    
}
