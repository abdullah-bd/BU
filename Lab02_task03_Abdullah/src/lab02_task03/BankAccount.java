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
public class BankAccount {
public String name, id, add;
  public double balance,interest;
  public String getName(){
    return name;
  }
  public void setName(String n){
    name = n;
  }
  public String getId(){
    return id;
  }
  public void setId(String i){
    id = i;
  }
  public String getAddress(){
    return add;
  }
  public void setAddress(String a){
    add = a;
  }
  public double getBalance(){
    return balance;
  }
  public void setBalance(double b){
    balance = b;
  }
  public void addInterest(){
    balance = balance+balance*.07;
  }
@Override
  public String toString(){
    return "Name:"+name+"--> Address:"+add+"--> Account Number:"+id+"--> Balance:"+balance;
  }
  
}