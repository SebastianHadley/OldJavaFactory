
    
/**
Used to define the different attributed of the warehouse and allow factory to act on the warehouses data.
 * Sebastian Hadley
 * 25/09/2020
 */
import java.util.*;
public class Warehouse
{
                                
      private String name;    
      private String fruit;    
      private int maxCapacity,ajuice,pjuice,ojuice; 
      Scanner keyboard = new Scanner(System.in);
    /**
     * Constructor for objects of class Warehouse
     */
    public void setMaxCapacity(int maxCapacity)
    {
            this.maxCapacity = maxCapacity;
    }
    public String getName(){
        return name;
    }
    public int getaJuice(){
      return(0);  
    }
    public void setJuice(){
      switch(fruit){
      case "Apple": 
      ajuice = getMaxCapacity();
      break;
      case "Pear":
      pjuice = getMaxCapacity();
      break;
      case "Orange":
      ojuice = getMaxCapacity();
      break;
        }
    }
  
    public void setName(String name)
    {
        this.name = name;
    }
    public void setFruit(String fruit)
    {
        this.fruit = fruit;
    }
    public int getMaxCapacity()
    {
        return maxCapacity;
    }
    public String getFruit(){
        return fruit;
    }
}

 

