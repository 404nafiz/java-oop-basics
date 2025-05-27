
package com.mycompany.method_overloading;


public class MyClass {
    
     public void load(int a,int b){
         int c=a+b;
         System.out.println(c);
     
     }
    public void load (int a ,int b,int c){
        System.out.println(a+b+c);
        
    }
    
    
    public void load2(int d){
        
        System.out.println(d);
    }
    public void load2(double d){
     System.out.println(d);
    }
    
}
