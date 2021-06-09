/** runSupplierr.java
  * Andrea Jacobs 21804266
  * 05 June 2021 */

package za.ac.cput;

import java.io.*;
import java.util.*;

public class runSupplier{
    public static void main(String[] args)
    {   
        Supplier objectSupplier = new Supplier();
                 
        // Serialization 
        try
        {   
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream("supplier.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
              
            // Method for serialization of object
            out.writeObject(objectSupplier);
              
            out.close();
            file.close();
              
            System.out.println("Object has been serialized");
  
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
  
  
        Customer objectSupplier1 = null;
  
        // Deserialization
        try
        {   
            // Reading the object from a file
            FileInputStream file = new FileInputStream("stakeholder.ser");
            ObjectInputStream in = new ObjectInputStream(file);
              
            // Method for deserialization of object
            //objectSupplier1 = (Supplier) (List<Supplier) in.readObject();
            
            Iterable<Supplier> sList = null;
                for(Supplier s: sList)
                {
                    Customer.addElement(s.getName() + ": " + s.getProductType() + ":" + s.getProductDescription());
                }

            in.close();
            file.close();
              
            System.out.println("Object has been deserialized ");
            //Collections.sort(cList);
            System.out.println(sList);
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
    }
}