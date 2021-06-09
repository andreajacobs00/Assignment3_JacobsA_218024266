/** runCustomer.java
  * Andrea Jacobs 21804266
  * 05 June 2021 */

package za.ac.cput;

import java.io.*;
import java.util.*;

public class runCustomer{
    public static void main(String[] args)
    {   
        Customer objectCustomer = new Customer();
                 
        // Serialization 
        try
        {   
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream("customer.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
              
            // Method for serialization of object
            out.writeObject(objectCustomer);
              
            out.close();
            file.close();
              
            System.out.println("Object has been serialized");
  
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
  
  
        Customer objectCustomer1 = null;
  
        // Deserialization
        try
        {   
            // Reading the object from a file
            FileInputStream file = new FileInputStream("stakeholder.ser");
            ObjectInputStream in = new ObjectInputStream(file);
              
            // Method for deserialization of object
            objectCustomer1 = (Customer) (List<Customer>) in.readObject();
            
            Iterable<Customer> cList = null;
                for(Customer c: cList)
                {
                    Customer.addElement(c.getFirstName() + ": " + c.getSurName() + ":" + c.getAddress() + 
                            ":" + c.getDateOfBirth() + ":" + c.getCredit() + ":" + c.getCanRent());
                }

            in.close();
            file.close();
              
            System.out.println("Object has been deserialized ");
            //Collections.sort(cList);
            System.out.println(cList);
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
          
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}