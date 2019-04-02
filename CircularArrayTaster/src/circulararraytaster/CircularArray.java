/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulararraytaster;

/**
 *
 * @author ABDULLAH
 */
public class CircularArray{
  
  private int start;
  private int size;
  private Object [] cir;
  
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
  public CircularArray(Object [] lin, int st, int sz){
    cir = new Object [lin.length];
      int k = st;
    for(int i = 0; i<sz; i++){
     cir[k] = lin[i];
     k = (k+1)%lin.length;
    }
    start = st;
    size = sz;
  }
  
  //Prints f index --> 0 t cir.length-1
  public void printFullLinear(){
      for(int k = 0; k<cir.length; k++){
         System.out.print(cir[k%cir.length]+",");
        }
        System.out.println("");
  }
  
  // Starts Printing f index start. Prints a total of size elements
  public void printForward(){
    int k = start;
    for(int i = 0; i<size; i++){
        if(cir[k]!= null){
        System.out.print(cir[k]+",");
        }else{
         break;   
        }
        k = (k+1)%cir.length;
    }
    System.out.println("");
  }
  
  
  public void printBackward(){
   int k = (size + start -1)%cir.length;
    for(int i= 0; i<size; i++){
        if(cir[k]!=null){ 
        System.out.print(cir[k]+",");
        }else{
            break;   
        }
         k--;
         if(k==-1){
             k = cir.length-1;
             }
    }
    System.out.println("");
  }
  
  // With no null cells
  public void linearize(){
    Object temp [] = new Object [size];
    int k = start; 
   for(int i = 0; i<size; i++){
         temp[i] = cir[k];
         k = (k+1)%cir.length;    
    }
   cir = temp;
   start = 0;
  }
  
  // Do not change the Start index
  public void resizeStartUnchanged(int newcapacity){
    Object temp [] = new Object [newcapacity];
      int k = start;
    int p = start;
    for(int i = 0; i<size; i++){
        temp[p] = cir[k];
        k = (k+1)%cir.length;
        p = (p+1)%temp.length;
        }
  }
  
  // Start index becomes zero
  public void resizeByLinearize(int newcapacity){
    Object temp []= new Object [newcapacity];
    int k = start;
    int p = start;
    for(int i = 0; i<size; i++){
     temp[p] = cir[k];
     k = (k+1)%cir.length;
     p = (p+1)%temp.length;
    }
    int m = start;
    for(int j = 0; j<size; j++){
        temp[j] = temp[m];
        m = (m+1)%temp.length;
    }
    start = 0;
  }
  
  /* pos --> position relative t start. Valid range of pos--> 0 t size.
   * Increase array length by 3 if size==cir.length
   * use resizeStartUnchanged() for resizing.
   */
  public void insertByRightShift(Object elem, int pos){
    int k = cir.length;
      if(size==cir.length){
         k = k+3; 
        }
       Object temp[] = new Object [k];
       int ns = size-pos;
       int f = (start+size-1)%cir.length;
       int t = (f+1)%cir.length;
       
       for(int i = 0; i<size; i++){
           temp[f] = temp[t];
           t = f;
           f--;
           if(f==-1){
           f = cir.length-1;
           }
       }
       int index = (start+pos)%cir.length;
       cir[index] = elem;
       size++;
        
  }
  
  public void insertByLeftShift(Object elem, int pos){
      int k = cir.length;
      if(size==cir.length){
         k = k+3; 
        }
       Object temp[] = new Object [k];
       int ns = size-pos;
       int f = (start+size-1)%cir.length;
       int t = (f+1)%cir.length;
      if(pos>=0){
          int y=start;
          for(int i=0;i<size;i++){
              temp[(y-1)%temp.length]=cir[y%cir.length];
              y++;
          }
          temp[pos]=elem;
          cir=temp;
          size++;
      }
      else{
          System.out.println("invalid index!!!");
      }
  }
  
  /* parameter--> pos. pos --> position relative t start.
   * Valid range of pos--> 0 t size-1
   */
  public void removeByLeftShift(int pos){
    if(pos>=0){
          int y=start;
          for(int i=0;i<size;i++){
              cir[y%cir.length]=cir[(y+1)%cir.length];
              y++;
          }
         cir[y%cir.length]=null;
          size--;
      }
      else{
          System.out.println("invalid index!!!");
      }
  }
  
  /* parameter--> pos. pos --> position relative t start.
   * Valid range of pos--> 0 t size-1
   */
  public void removeByRightShift(int pos){
      int ns = size-pos;
       int f = (start+size-1)%cir.length;
       int t = (f+1)%cir.length;
       
       for(int i = 0; i<size; i++){
           cir[f] = cir[t];
           t = f;
           f--;
           if(f==-1){
           f = cir.length-1;
           }
       }
       int index = (start+pos)%cir.length;
       cir[index] = null;
       size--;
  }
  
}