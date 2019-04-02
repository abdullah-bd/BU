/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_task03;

/**
 *
 * @author ABDULLAH
 */
public class Lab02_task03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    BankAccount ba1 = new BankAccount();
    ba1.setName("ba1");
    ba1.setId("010101010101");
    ba1.setAddress("Mohakhali 1");
    ba1.setBalance(35001.0);
    ba1.addInterest();
    
    BankAccount ba2 = new BankAccount();
    
    ba2.setName("ba2");
    ba2.setId("122010012452");
    ba2.setAddress("Banani 2");
    ba2.setBalance(30545.0);
    
    BankAccount ba3 = new BankAccount();
    
    ba3.setName("ba3");
    ba3.setId("12201004513");
    ba3.setAddress("Badda");
    ba3.setBalance(2500545.0);
    ba3.addInterest();
    
    System.out.println(ba1.toString());
    System.out.println(ba2.toString());
    System.out.println(ba3.toString());
    
  }
}
