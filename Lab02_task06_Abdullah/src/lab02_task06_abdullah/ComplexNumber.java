/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_task06_abdullah;

/**
 *
 * @author ABDULLAH
 */
public class ComplexNumber {
    int x,y;
    public void setCN(int a,int b){
        x=a;
        y=b;
    }
    public void IncreaseValue(){
        x=x+2;
        y=y+2;
    }
    @Override
    public String toString(){
        String s = x+"x"+"+"+y+"i";
        return s;
    }
}
