/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_task08_abdullah;

/**
 *
 * @author ABDULLAH
 */
public class QuadEqn {
    int x,y,z;
    public void calculate(int a,int b,int c){
        x=a;
        y=b;
        z=c;
    }
    public String toString(){
        return x+"+"+y+"y+"+z;
    }
    public void root(){
        System.out.println(Math.sqrt(Math.sqrt(x*x)+Math.sqrt(y*y)+Math.sqrt(z*z)));
    }
}
