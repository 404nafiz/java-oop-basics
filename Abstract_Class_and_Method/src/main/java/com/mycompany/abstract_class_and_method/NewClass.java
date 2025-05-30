
package com.mycompany.abstract_class_and_method;
abstract class NewClass {
    void mass(){
    System.out.println("This is my new class");
    }
    abstract void abstract_method(); 
    
    
}
class Help extends NewClass{

void abstract_method(){
    System.out.println("from abstract method");
}
    
        
    

}
