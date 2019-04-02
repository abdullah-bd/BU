/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab02_task02;

/**
 *
 * @author Abdullah
 */
public class Lab02_task02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Vehicle car = new Vehicle();
System.out.println(car.toString());
car.moveUp();
System.out.println(car.toString());
car.moveLeft();
System.out.println(car.toString());
car.moveDown();
System.out.println(car.toString());
car.moveRight();
// see, output for following two lines are same because toString() is automatically called. So, you can omit toString when printing.
System.out.println(car.toString());
System.out.println(car); 
    }
}
