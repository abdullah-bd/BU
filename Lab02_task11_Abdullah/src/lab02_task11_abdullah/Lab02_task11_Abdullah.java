/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_task11_abdullah;

/**
 *
 * @author ABDULLAH
 */
public class Lab02_task11_Abdullah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RealNumber rn = new ComplexNumber();
        System.out.println(rn);
        
        System.out.println("--------------------");
        
        rn = new ComplexNumber(5, 7);
        System.out.println(rn);
        
        System.out.println("--------------------");
        ComplexNumber cn = new ComplexNumber();
        cn.check();
    }
}