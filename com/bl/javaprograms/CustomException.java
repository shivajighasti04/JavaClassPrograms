package com.bl.javaprograms;

public class CustomException {
	static void validate (int age) throws MyException{    
       if(age < 18){  
   
        throw new MyException("age is not valid to vote");    
    }  
       else {   
        System.out.println("welcome to vote");   
        }   
     }    
  
    public static void main(String args[])  
    {  
        try  
        {  
            validate(17);  
        }  
        catch (MyException ex)  
        {  
            System.out.println("Caught the exception");  
     
            System.out.println("Exception occured: " + ex);  
        }  
	}
}
