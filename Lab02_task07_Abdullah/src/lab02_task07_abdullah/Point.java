/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_task07_abdullah;

/**
 *
 * @author ABDULLAH
 */
public class Point {
    double a,b;
    public void distanceFromOrigin(double x,double y){
        a=x;
        b=y;
        double c=Math.sqrt(a*a+b*b);
        System.out.println("Distance from origin is "+c);
    }
}
