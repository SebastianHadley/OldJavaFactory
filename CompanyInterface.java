
/**
Used to take input from the user, all 8 options are there although the 8th method doesn't work as i couldnt determine an appropriate method in time.
Sebastian hadley c3349742
25/09/2020

*/
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
public class CompanyInterface
{ 
            private int option,m;
            private int i = -1;
            private int counter,aptotal,atotal,ototal,ptotal,aototal,pototal,aoptotal;
            private String test;
            private int Warehouses;
            private Factory factorylist[];
            Scanner keyboard = new Scanner(System.in);
            private Scanner inputStream, outputStream ;
            public static void main(String[] args){
            CompanyInterface ci = new CompanyInterface();
            ci.run();
            }
            public CompanyInterface(){
            factorylist = new Factory[5];
            for(int m = 0; m < 5; m++) factorylist[m] = new Factory();
            }
            private void run()
            {
                 do
                    {
                 
                System.out.println("Menu");
                System.out.println("1 adds a new Factory");
                System.out.println("2 removes a factory");
                System.out.println("3 lists factory info");
                System.out.println("4 lists warehouses in a factory");
                System.out.println("5 lists warehouses by fruit");
                System.out.println("6 lists juice amounts");
                System.out.println("7 loads external data");
                System.out.println("8 creates a file with your data on it");
                option = keyboard.nextInt();
                switch (option)
                {
                case 1:addFactory();
                break;
                case 2:removeFactory();
                break;
                case 3:listFactories();
                break;
                case 4:listWarehouses();
                break;
                case 5:fruitWarehouses();
                break;
                case 6:JuiceTotal();
                break;
                case 7:loadFile();
                break;
                case 8:createFile();
                break;
                case-1: break;
                
                    }
                }   
                while (option!=-1);
            }
            public void loadFile()
            {
                    String line;
                    String[] arr;
                    String fileName = "ReginaCompany.txt";
                    //ReginaCompany.txt has fruits without plural while the assessment guide are plurals so i set my fruit up as plurals so depending on your sheet you may need to add an s to the fruit in regina company//
                    String warehouseName = "";
                    String Fruit = "";
                    int warehouseSize =0;
                    String size1;
                    try{
                        Scanner inputStream = new Scanner(new File (fileName));
              
                        while(inputStream.hasNextLine())
                        {
                            line = inputStream.nextLine();
                            arr = line.split(" ", 2);
                            
                            
                            switch (arr[0]){
                             case "null":
                             //doing nothing gives blank lines
                             break;
                             case "Factory":
                              i++;
                              line = inputStream.nextLine();
                              arr = line.split(" ", 2);
                              line = arr[1];
                              factorylist[i].setName(line);
                              
                             break;
                             case "Size":
                                 size1 = arr[1];
                                 char size = size1.charAt(0);
                                factorylist[i].setSize(size);
                              break;
                             case "Warehouses":
                                break;
                             case "Name":
                             warehouseName = arr[1];
                             break;
                             case "Fruit" :
                             Fruit = arr[1];
                             break;
                             case "MaxCapacity" : 
                             warehouseSize = Integer.parseInt(arr[1]);
                             counter = factorylist[i].getCounter();
                             factorylist[i].addWarehouse(counter,warehouseName,Fruit,warehouseSize);
                             counter++;
                             System.out.println("Factory "+(i+1)+" : "+factorylist[i].getName()+" Warehouse " +warehouseName);
                             factorylist[i].setCounter(counter);
                             break;
                        
                            }
                        }
                        System.out.println("-----Complete----");
                        inputStream.close();
                    }catch(Exception e){
                     System.out.println("Error in file. Error Message:/n" +e.toString());   
                    }
                    
            }
            public void createFile()
            {
                try
                {
                    File output = new File("JavaOutput.txt");
                    if(output.createNewFile()){
                         System.out.println("File Created: "+output.getName());   
                        }  
            }catch(Exception e){
                System.out.println("An error occured");
                e.printStackTrace();
            }
                try{
                    FileWriter myWriter = new FileWriter("JavaOutput.txt");
                    myWriter.write("Factories and warehouses : ");
                    for(m = 0;m < 5; m++){
                        if(factorylist[m].getCounter() == 1){
                          myWriter.write(" Factory "+factorylist[m].getName()+" is size "+factorylist[m].getSize()+" and has following warehouse ");
                          myWriter.write(" Warehouse "+factorylist[m].Warehouse1Name()+" stores  "+factorylist[m].Warehouse1size()+" tonnes of "+factorylist[m].Warehouse1Fruit());
                        }else if(factorylist[m].getCounter() == 2){
                          myWriter.write(" Factory "+factorylist[m].getName()+" is size "+factorylist[m].getSize()+" and has following warehouse");
                          myWriter.write(" Warehouse "+factorylist[m].Warehouse1Name()+" stores  "+factorylist[m].Warehouse1size()+" tonnes of "+factorylist[m].Warehouse1Fruit());
                          myWriter.write(" Warehouse "+factorylist[m].Warehouse2Name()+" stores  "+factorylist[m].Warehouse2size()+" tonnes of "+factorylist[m].Warehouse2Fruit());
                        }else if(factorylist[m].getCounter() == 3){
                         myWriter.write("Factory "+factorylist[m].getName()+" is size "+factorylist[m].getSize()+" and has following warehouse ");
                         myWriter.write(" Warehouse "+factorylist[m].Warehouse1Name()+" stores  "+factorylist[m].Warehouse1size()+" tonnes of "+factorylist[m].Warehouse1Fruit());
                         myWriter.write(" Warehouse "+factorylist[m].Warehouse2Name()+" stores  "+factorylist[m].Warehouse2size()+" tonnes of "+factorylist[m].Warehouse2Fruit());
                         myWriter.write(" Warehouse "+factorylist[m].Warehouse3Name()+" stores  "+factorylist[m].Warehouse3size()+" tonnes of "+factorylist[m].Warehouse3Fruit());
                        }
                    }
                    myWriter.close();
                }catch(Exception e){
                    System.out.println("an error occured");
                    e.printStackTrace();
                }
            }
            public String fileInfo()
            {
                for(m = 0;m < 5; m++){
                 factorylist[m].getWarehousesPlus();
                    }
                    return "";
            }
            public void addFactory()
            {  
                        Scanner console = new Scanner(System.in);
                        if (i > 3){
                          System.out.println("A maximum of 5 Factories can be contained");
                          return;
                        }
                             if (i == -1) {
                             System.out.println("Please Name Factory");
                              String fname = console.next();
                              factorylist[0].setName(fname);
                              System.out.println("What Size Is The Factory,S,M,L?");
                              System.out.println("1=S, 2=M 3=L");
                              option = keyboard.nextInt();
                              switch(option){
                                case 1: factorylist[0].setSize('S');
                                break;
                                case 2: factorylist[0].setSize('M');
                                break;
                                case 3: factorylist[0].setSize('L');
                                break;
                                default: factorylist[0].setSize('M');
                                System.out.println("Factory set to default medium");
                            
                            }
                              factorylist[0].setWarehouse();
          
                              i = 0 ;
                  
                            }
                               else if (i == 0){
                                 System.out.println("Please name Factory");
                                 String fname = console.next();
                                   if(factorylist[0] != null){
                                            while(factorylist[0].getName().equals(fname)){
                                             System.out.println("there is already a factory named "+fname+" please re enter name");
                                             fname = console.next();
                                            }
                                     }
                                  factorylist[1].setName(fname);
                                  System.out.println("What Size Is The Factory,S,M,L?");
                                  System.out.println("1=S, 2=M 3=L");
                                  option = keyboard.nextInt();
                              switch(option){
                                case 1: factorylist[1].setSize('S');
                                break;
                                case 2: factorylist[1].setSize('M');
                                break;
                                case 3: factorylist[1].setSize('L');
                                break;
                                default: factorylist[1].setSize('M');
                                System.out.println("Factory set to default medium");
                            
                            }
                            factorylist[1].setWarehouse();
          
                            i = 1;
                            for(m = 0; m < 1;m++){
                                   if(factorylist[1].getSize() == (factorylist[m].getSize())){
                                       if(Arrays.equals(factorylist[1].getFruits(),factorylist[m].getFruits())) {
                                           System.out.println("Factory is not unique");
                                           factorylist[1] = new Factory();
                                           
                                           i = 0;
                                           break;
                                        }
                                }
                                }
                    
                                 }else if (i == 1){
                                 System.out.println("Please name Factory");
                                 String fname = console.nextLine();
                                 factorylist[2] = new Factory();
                             if(factorylist[0] != null && factorylist[1] != null){
                             while(factorylist[1].getName().equals(fname) || factorylist[0].getName().equals(fname)){
                                 System.out.println("There is already a factory named that");
                                 fname = console.nextLine();
                                 
                                }
                                }
                            factorylist[2].setName(fname);
                            System.out.println("What Size Is The Factory,S,M,L?");
                            System.out.println("1=S, 2=M 3=L");
                            option = keyboard.nextInt();
                              switch(option){
                                case 1: factorylist[2].setSize('S');
                                break;
                                case 2: factorylist[2].setSize('M');
                                break;
                                case 3: factorylist[2].setSize('L');
                                break;
                                default: factorylist[2].setSize('M');
                                System.out.println("Factory set to default medium");
                            
                            }
                            factorylist[2].setWarehouse();
                            i = 2;
                                for(m = 0; m < 2; m++){
                                       if(factorylist[2].getSize() == factorylist[m].getSize()){
                                                if(Arrays.equals(factorylist[2].getFruits(),factorylist[m].getFruits())) {
                                                    System.out.println("Factory is not unique");
                                                        factorylist[2] = new Factory();
                                                        i = 1;
                                                        break;
                                    }
                                }
                            }
                        }else if (i == 2){
                              System.out.println("Please name factory");
                              String fname = console.nextLine();
                              factorylist[3] = new Factory();
                              if(factorylist[0] !=null && factorylist[1] !=null && factorylist[2] != null){
                                 while(factorylist[0].getName().equals(fname) || factorylist[1].getName().equals(fname) || factorylist[2].getName().equals(fname)){
                                     System.out.println("There is already a factory named that");
                                     fname = console.nextLine();
                                    }
                                }
                            factorylist[3].setName(fname);
                            System.out.println("What Size Is The Factory,S,M,L?");
                            System.out.println("1=S, 2=M 3=L");
                            option = keyboard.nextInt();
                            switch(option){
                                case 1: factorylist[3].setSize('S');
                                break;
                                case 2: factorylist[3].setSize('M');
                                break;
                                case 3: factorylist[3].setSize('L');
                                break;
                                default: factorylist[3].setSize('M');
                                System.out.println("Factory set to default medium");
                            
                          }
                          factorylist[3].setWarehouse();
                         
                          i = 3;
                          for(m = 0; m < 3; m++){
                               if(factorylist[3].getSize() == factorylist[m].getSize()){
                                                 if(Arrays.equals(factorylist[3].getFruits(),factorylist[m].getFruits())) {
                                           System.out.println("Factory is not unique");
                                           factorylist[3] = new Factory();
                                           i = 2;
                                           break;
                                        }
                                    }
                                }
                        }else if (i == 3){
                            System.out.println("Please name factory");
                            String fname = console.nextLine();
                            factorylist[4] = new Factory();
                            if(factorylist[0] !=null && factorylist[1] !=null && factorylist[2] != null && factorylist[3] != null){
                                 while(factorylist[0].getName().equals(fname) || factorylist[1].getName().equals(fname) || factorylist[2].getName().equals(fname) || factorylist[3].getName().equals(fname)){
                                     System.out.println("There is already a factory named that");
                                     fname = console.nextLine();
                                    }
                                }
                            factorylist[4].setName(fname);
                            System.out.println("What Size Is The Factory,S,M,L?");
                            System.out.println("1=S, 2=M 3=L");
                            option = keyboard.nextInt();
                            switch(option){
                            case 1: factorylist[4].setSize('S');
                            break;
                            case 2: factorylist[4].setSize('M');
                            break;
                            case 3: factorylist[4].setSize('L');
                            break;
                            default: factorylist[4].setSize('M');
                            System.out.println("Factory set to default medium");
                        
                            }
                            factorylist[4].setWarehouse();
                     
                            i = 4;
                            for(m = 0; m < 4; m++){
                                   if(factorylist[4].getSize() == factorylist[m].getSize()){
                                                    if(Arrays.equals(factorylist[4].getFruits(),factorylist[m].getFruits())) {
                                           System.out.println("Factory is not unique");
                                           factorylist[4] = new Factory();
                                           i = 3;
                                           break;
                                        }
                                    }   
                                }
                           }
            }
            public void removeFactory()
            {
                    String name;
                    System.out.println("Please enter name of factory to remove");
                    name = keyboard.next();
                    if (i == -1)
                    { 
                     System.out.println("There Are no Factories to remove");
                    }else if (i == 0){
                        if(factorylist[0].getName().equals(name)){
                        --i;
                        factorylist[0] = new Factory();
                    }
                    }else if (i == 1) 
                    { 
                        if (factorylist[0].getName().equals(name)){
                            factorylist[0] = factorylist[1];
                            factorylist[1] = new Factory();
                            --i;
                        }else if(factorylist[1].getName().equals(name)){
                            factorylist[1] = new Factory();
                            --i;
                    }
                        }else if(i == 2){
                             if (factorylist[0].getName().equals(name)){
                            factorylist[0] = factorylist[1];
                            factorylist[1] = factorylist[2];
                            factorylist[2] = new Factory();
                            --i;
                        }else if(factorylist[1].getName().equals(name)){
                            factorylist[1] = factorylist[2];
                            factorylist[2] = new Factory();
                            --i;
                        }else if(factorylist[2].getName().equals(name)){
                            factorylist[2] = new Factory();
                            --i;
                        }
                    }else if (i == 3){
                            if (factorylist[0].getName().equals(name)){
                            factorylist[0] = factorylist[1];
                            factorylist[1] = factorylist[2];
                            factorylist[2] = factorylist[3];
                            factorylist[3] = new Factory();
                            --i;
                        }else if(factorylist[1].getName().equals(name)){
                            factorylist[1] = factorylist[2];
                            factorylist[2] = factorylist[3];
                            factorylist[3] = new Factory();
                            --i;
                        }else if(factorylist[3].getName().equals(name)){
                            factorylist[3] = new Factory();
                            --i;
                        }
                    }else if(i == 4){
                            if (factorylist[0].getName().equals(name)){
                            factorylist[0] = factorylist[1];
                            factorylist[1] = factorylist[2];
                            factorylist[2] = factorylist[3];
                            factorylist[3] = factorylist[4];
                            factorylist[4] = new Factory();
                            --i;
                        }else if(factorylist[1].getName().equals(name)){
                            factorylist[1] = factorylist[2];
                            factorylist[2] = factorylist[3];
                            factorylist[3] = factorylist[4];
                            factorylist[4] = new Factory();
                            --i;
                        }else if(factorylist[2].getName().equals(name)){
                            factorylist[2] = factorylist[3];
                            factorylist[3] = factorylist[4];
                            factorylist[4] = new Factory();
                            --i;
                            
                        }else if(factorylist[3].getName().equals(name)){
                            factorylist[3] = factorylist[4];
                            factorylist[4] = new Factory();
                            --i;
                        }else if(factorylist[4].getName().equals(name)){
                            factorylist[4] = new Factory();
                            --i;
                        }
                    
                    }else {
                     System.out.println("factory does not exist");
                       
                    }
                    
        } 
        public void listFactories()
              {
                if (i == -1){
                     System.out.println("There are no factories to list");
                    }
                    else if (i == 0){
                        System.out.println("Factory 1 has name : " +factorylist[0].getName()+" and size : " +factorylist[0].getSize());
                        factorylist[0].getWarehouses();
                    }else if (i == 1){
                        System.out.println("Factory 1 has name : " +factorylist[0].getName()+" and size : " +factorylist[0].getSize());
                        factorylist[0].getWarehouses();
                        
                        System.out.println("Factory 2 has name : " +factorylist[1].getName()+" and size : " +factorylist[1].getSize());
                        factorylist[1].getWarehouses();
           
                    }else if (i == 2){
                        System.out.println("Factory 1 has name : " +factorylist[0].getName()+" and size : " +factorylist[0].getSize());
                        factorylist[0].getWarehouses();
                        
                        System.out.println("Factory 2 has name : " +factorylist[1].getName()+" and size : " +factorylist[1].getSize());
                        factorylist[1].getWarehouses();
                        
                        System.out.println("Factory 3 has name : " +factorylist[2].getName()+" and size : " +factorylist[2].getSize());
                        factorylist[2].getWarehouses();
           
                    }else if (i == 3){
                        System.out.println("Factory 1 has name : " +factorylist[0].getName()+" and size : " +factorylist[0].getSize());
                        factorylist[0].getWarehouses();
                        
                        System.out.println("Factory 2 has name : " +factorylist[1].getName()+" and size : " +factorylist[1].getSize());
                        factorylist[1].getWarehouses();
                        
                        System.out.println("Factory 3 has name : " +factorylist[2].getName()+" and size : " +factorylist[2].getSize());
                        factorylist[2].getWarehouses();
                        
                        System.out.println("Factory 4 has name : " +factorylist[3].getName()+" and size : " +factorylist[3].getSize());
                        factorylist[3].getWarehouses();
                    }else if (i == 4){
                        System.out.println("Factory 1 has name : " +factorylist[0].getName()+" and size : " +factorylist[0].getSize());
                        factorylist[0].getWarehouses();
                        
                        System.out.println("Factory 2 has name : " +factorylist[1].getName()+" and size : " +factorylist[1].getSize());
                        factorylist[1].getWarehouses();
                        
                        System.out.println("Factory 3 has name : " +factorylist[2].getName()+" and size : " +factorylist[2].getSize());
                        factorylist[2].getWarehouses();
                        
                        System.out.println("Factory 4 has name : " +factorylist[3].getName()+" and size : " +factorylist[3].getSize());
                        factorylist[3].getWarehouses();
                        
                        System.out.println("Factory 5 has name : " +factorylist[4].getName()+" and size : " +factorylist[4].getSize());
                            factorylist[4].getWarehouses();
                        
                        
                }
            
                
        }
        public void listWarehouses(){
                String name;
                System.out.println("Please enter name of factory");
                name = keyboard.next();
                    if(i > -1){
                    for(int m = 0; m < 5 ;){
                        if(factorylist[m].getName().equals(name)){
                             factorylist[m].getWarehousesPlus();
                             break;
                        }else if(factorylist[m].getName().equals(null)){
                            System.out.println("factory doesn't exist");
                            break;  
                        }else{
                            m++;
                         }
                    }
                }else{ 
                 System.out.println("No factory of such name exists");   
                }
      
        }
        public void fruitWarehouses(){
                    if(i == -1){
                        System.out.println("Please create factory first");
                
                    }
            
                     System.out.println("What fruit dare you looking for");
                     System.out.println("1 = apples, 2 = pears, 3 = oranges");
                     option = keyboard.nextInt();
                        switch(option)
                    {
                             case 1: 
                             test = "False";
                             m = 0;
                             for(m = 0; m < 5;){
                             if(factorylist[m].checkApple() == "Apple"){
                                 test = "True";
                                 break;
                                }else{
                                 m++;   
                                }
                            }
                            if(test == "True"){
                             for(m = 0; m < 5; m++){
                                 factorylist[m].getApple();    
                                }
                            }else{
                             System.out.println("No Warehouses with that fruit exist");   
                            }
                             break;
                             case 2: 
                             test = "False";
                             m = 0;
                             for(m = 0; m < 5;){
                             if(factorylist[m].checkPear().equals("Pear")){
                                 test = "True";
                                 break;
                                }else{
                                 m++;   
                                }
                            }
                            if(test == "True"){
                             for(m = 0; m < 5; m++){
                                 factorylist[m].getPear();    
                                }
                                }else{
                             System.out.println("No Warehouses with that fruit exist");   
                            }
                             break;
                             case 3: 
                             test = "False";
                             m = 0;
                             for(m = 0; m < 5;){
                             if(factorylist[m].checkOrange() == "Orange"){
                                 test = "True";
                                 break;
                                }else{
                                 m++;   
                                }
                            }
                            if(test == "True"){
                             for(m = 0; m < 5; m++){
                                 factorylist[m].getOrange();    
                                }
                            }else{
                             System.out.println("No Warehouses with that fruit exist");   
                            }
                             break;
                             default:
                             System.out.println("Please enter appropriate value");
                             break;
                    }
        }
        public void JuiceTotal(){
            for(m = 0; m < 5;){
               factorylist[m].setJuice();
               m++;
            }

            
        }
}
            