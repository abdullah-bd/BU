/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab02_task02;

/**
 *
 * @author 14321005
 */
class Vehicle {
    int x=0,y=0;
  void moveUp(){
    y++;
  }
  public String toString(){
    String s="("+x+","+y+")";
    return s;
  }
  void moveDown(){
    y--;
  }
  void moveLeft(){
    x--;
  }
  void moveRight(){
    x++;
  }
}
