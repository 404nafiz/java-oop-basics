

package com.mycompany.method_overloading;


public class Method_Overloading {

    public static void main(String[] args) {
        MyClass object=new MyClass();
        
        object.load(10, 10);
        object.load(10, 20, 10);
         object.load2(30);
        object.load2(30);
    }
}
