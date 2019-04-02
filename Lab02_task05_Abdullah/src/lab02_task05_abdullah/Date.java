/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_task05_abdullah;

/**
 *
 * @author ABDULLAH
 */
public class Date {
    int d,m,y;
    public void setDate(int d1,int m1,int y1){
        if(d%2!=0 && d==7 ){
            
           if (d1<=31 && d1>=1){
        d=d1;
        }
        }
           else if(d1<=30 && d1>=1){
        d=d1;
        }
        else{
            System.out.println("Invalid date");
        }
        if (m1<=12 && m1>=1){
        m=m1;
        }
        else{
            System.out.println("Invalid month");
        }
        y=y1;
    }
    public String dispalyDate(){
        return d+"/"+m+"/"+y;
    }
    
}