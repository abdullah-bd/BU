/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_05_linklist;

/**
 *
 * @author ABDULLAH
 */
public class LinkedList {
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    Node h = new Node(a[0],null);    
      head = h;                          
    for(int i=1;i<a.length;i++){   
      Node n = new Node(a[i],null);              
      h.next = n;                             
      h = h.next;                    
    }             
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
      head=h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
      System.out.println("I will count nodes!");
      int c=0;
    for(Node x=head;x!=null;x=x.next){
        c++;
    }
    return c; // please remove this line!
  }
  
  /* prints the elements in the list */
  public void printList(){
      System.out.println("I will print nodes!");
    for(Node n=head;n!=null;n=n.next){
        System.out.println(n.element);
    }   
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    System.out.println("I will print element of "+idx+" index!");
      int c=0;
    for(Node x=head;x!=null;x=x.next){
        c++;
    }
    Node ref=head;
    if(idx<0 || idx>=c){
        //throw new nullPointerException();
        return null;
    }
    else{
        for(int i=0;i<idx;i++){
            ref=ref.next;
        }
    }
    return ref; // please remove this line!
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    int c=0;
    for(Node n=head;n!=null;n=n.next){
    c++;
    }
    Node x=head;
    if(idx<0||idx>=c){
      return null;
    }else{
      for(int i=0;i<idx;i++){
        x=x.next;
      }
      return x.element;
    }
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
      System.out.println("this will set "+elem+" at index "+idx);
        int c=0;
    for(Node x=head;x!=null;x=x.next){
        c++;
    }
    Node ref=head;
    if(idx<0 || idx>=c){
        //throw new nullPointerException();
        return null;
    }
      else{  Node x=head;
    for(int i=0;i<idx;i++){
        x=x.next;
    }
    Object a=x.element;
    x.element=elem;
    return a; // please remove this line!
              }
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){     ////hoi nai eta complete kora!!!  :(
        int c=0,n = 0;
    for(Node x=head;x!=null;x=x.next){
        if(elem.equals(x.element)){
            n=c;
        }
        else{
            n=-1;
            c++;
        }
    }
     return n;// please remove this line!
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    boolean b=false;
    for(Node x=head;x!=null;x=x.next){
     if(elem.equals(x.element)){
       b=true;
     }
    }
    return b;
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
      return head;
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    Node tl=null;
    Node nn=null;;
    for(Node n=head;n!=null;n=tl){
      tl= n.next ;
      n.next=nn;
      nn=n;
    }
    return nn;
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
      int c=0;
    for(Node n=head;n!=null;n=n.next){
      c=c+1;
    }
    if(idx<0||idx>c){
    }else{
        Node nn= new Node(elem,null);
      if(idx==0){
        nn.next=head;
        head=nn;
      }else{
        Node pred=nodeAt(idx-1);
                                //System.out.println(pred.element);
        nn.next=pred.next;
        pred.next=nn;
      }
    }
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){int count=0;
    for(Node x=head;x!=null;x=x.next){
      count=count+1;
    }
    if(index<0||index>count){
      return null;
    }else{
        Node rn=null;
      if(index==0){
        rn=head;
        head=head.next;
        
        
      }else{
        Node pred=nodeAt(index-1);
        rn=pred.next;
        pred.next=pred.next.next;                       
        
      }
        Object e=rn.element;
        rn.next=null;
        rn.element=null;
        rn=null;
        
       return e; 
    }
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
     Node tl=null;
     Node temp=head;
     Node h=head.next;
    for(tl=head;tl.next!=null;tl=tl.next){
      
      }
    tl.next=temp;
    temp.next=null;
    head=h;
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
    Node temp=null;
    
    Node tl=null;
    for(tl=head;tl.next!=null;tl=tl.next){
      temp=tl;
      }
    
    tl.next=head;
    temp.next=null;
    head=tl;
  }
  }