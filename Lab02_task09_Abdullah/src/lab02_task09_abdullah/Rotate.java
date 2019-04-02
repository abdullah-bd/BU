/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_task09_abdullah;

/**
 *
 * @author ABDULLAH
 */
public class Rotate {
    int [] y=new int [4];
    int j=3;
    public void rightShift(int x[]){
        for(int i=10-1;i>=6;i--){
            y[j]=x[i];
            j--;
        }
        for(int i=10-1-4;i>=0;i--){
            x[i+4]=x[i];
        }
        for(int i=0;i<=3;i++){
            x[i]=y[i];
        }
        for(int i=0;i<10;i++){
            System.out.print(x[i]);
        }
          System.out.println("");
    }
}
