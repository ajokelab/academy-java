package com.bptn.course._accessmodifiersdemo;

class AccessModifiersSubclass extends AccessModifiers {
    public void accessFieldsAndMethods() {
                                                   // Accessing public field and method from the superclass
    	
        System.out.println("Accessing public field: " + publicField);
        publicMethod();           
                                                    // Accessing protected field and method from the superclass
        System.out.println("Accessing protected field: " + protectedField);
        protectedMethod(); 
        
                                                   // Trying to access private field and method from the superclass (will not compile)
        // System.out.println("Accessing private field: " + privateField);
       // privateMethod();    
        
                                                   // Accessing default field and method from the superclass (only works within the same package)
        System.out.println("Accessing default field: " + defaultField);
        defaultMethod();
    }
}