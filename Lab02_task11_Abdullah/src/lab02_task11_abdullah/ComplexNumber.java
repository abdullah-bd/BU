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
public class ComplexNumber  extends RealNumber{
    double ImaginaryPart;
  ComplexNumber(){
    this.ImaginaryPart=1.0;
    setRealValue(1.0);
  }
  ComplexNumber(double x, double y){
    this.ImaginaryPart=y;
    setRealValue(x);
  }
  public void check(){
    System.out.println("I'm in ComplexNumber class");
    ping();
    System.out.println("Checking ended.");
  }
  
  public String toString(){
    System.out.println(super.toString());
    return "ImaginaryPart:"+ImaginaryPart;
  }
}

