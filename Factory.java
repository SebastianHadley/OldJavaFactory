        
        
        /** Sebastian Hadley
        c3349472
        Factory class is  used to define most of the methods in the program and reduce the size of the main class, I was unable to figure out a way to program the 8th function for determining juice amounts but i left my work so far in.
        */
        
        
        import java.util.*;
        public class Factory
        {   
        private String name,fruit1,fruit2,fruit3; 
        private char size; 
        Scanner keyboard = new Scanner(System.in);//
        private int counter,option1,ajuice,pjuice,ojuice,aopjuice,apjuice,aojuice,pojuice,totaljuice,sum;
        private Warehouse warehouselist[];
        public Factory(){
        warehouselist = new Warehouse[3];
        for(int m = 0; m < 3; m++) warehouselist[m] = new Warehouse();
        }
        public void setName(String name)
        {
        this.name = name;
        }
        
        public String getName()
        {
        return name;
        }
        public void setSize(char size)
        {
        this.size = size;
        }
        public char getSize()
        {
        return size;
        }
        public void setWarehouse(){
        if (counter >= 3){
        System.out.println("No room for warehouse");}
        if (size == 'S'){
          counter++;
          System.out.println("Please Name Warehouse");
          warehouselist[0].setName(keyboard.nextLine());
          System.out.println("What fruit does the factory store");
          System.out.println("1 = apple, 2 = pear, 3 = orange");
          option1 = keyboard.nextInt();
          switch(option1){
              case 1: warehouselist[0].setFruit("Apple");
              break;
              case 2: warehouselist[0].setFruit("Pear");
              break;
              case 3: warehouselist[0].setFruit("Orange");
              break;
              default:
              System.out.println("Set to default fruit apples");
              warehouselist[0].setFruit("Apple");
              
            }  
          System.out.println("How many tonnes can it store");
          do{
                 System.out.println("must be a positive integer"); 
                 warehouselist[0].setMaxCapacity(keyboard.nextInt());
               
                }while(warehouselist[0].getMaxCapacity() < 0);
          
          }else if (size == 'M'){
          
          for (int l=0; l < 2; l++){
          counter++;
          System.out.println("Please Name Warehouse");
          warehouselist[l].setName(keyboard.next());
          System.out.println("What fruit does the factory store");
          System.out.println("1 = apple, 2 = pear, 3 = orange");
          option1 = keyboard.nextInt();
          switch(option1){
              case 1: warehouselist[l].setFruit("Apple");
              break;
              case 2: warehouselist[l].setFruit("Pear");
              break;
              case 3: warehouselist[l].setFruit("Orange");
              break;
              default:
              System.out.println("Set to default fruit apples");
              warehouselist[l].setFruit("Apple");
        
            }  
            while(warehouselist[0].getFruit() == warehouselist[1].getFruit()){
                System.out.println("Warehouses must not store same type of fruit");
                System.out.println("1 = apple, 2 = pear, 3 = orange");
                option1 = keyboard.nextInt();
                switch(option1){
                  case 1: warehouselist[l].setFruit("Apple");
                  break;
                  case 2: warehouselist[l].setFruit("Pear");
                  break;
                  case 3: warehouselist[l].setFruit("Orange");
                  break;
                  default:
                  System.out.println("Set to default fruit apples");
                  warehouselist[l].setFruit("Apple");
        
            }  
            }
          System.out.println("How many tonnes can it store");
          do{
             System.out.println("must be a positive integer"); 
             warehouselist[l].setMaxCapacity(keyboard.nextInt());
           
                }while(warehouselist[l].getMaxCapacity() < 0);
            }
        }else if (size == 'L')
          {
          for (int l=0; l < 3; l++){ 
              counter++;
              System.out.println("Please Name Warehouse");
              warehouselist[l].setName(keyboard.next());
              System.out.println("What fruit does the factory store");
              System.out.println("1 = apple, 2 = pear, 3 = orange");
              option1 = keyboard.nextInt();
              switch(option1){
              case 1: warehouselist[l].setFruit("Apple");
              break;
              case 2: warehouselist[l].setFruit("Pear");
              break;
              case 3: warehouselist[l].setFruit("Orange");
              break;
              default:
              System.out.println("Set to default fruit apples");
              warehouselist[l].setFruit("Apple");
              
            }  
             while(warehouselist[0].getFruit().equals(warehouselist[1].getFruit()) || warehouselist[0].getFruit().equals(warehouselist[2].getFruit())){
                System.out.println("Warehouses must not store same type of fruit");
                System.out.println("1 = apple, 2 = pear, 3 = orange");
                option1 = keyboard.nextInt();
                switch(option1){
                  case 1: warehouselist[l].setFruit("Apple");
                  break;
                  case 2: warehouselist[l].setFruit("Pear");
                  break;
                  case 3: warehouselist[l].setFruit("Orange");
                  break;
                  default:
                  System.out.println("Set to default fruit apples");
                  warehouselist[l].setFruit("Apple");
        
                }  
            }while(l > 1 && warehouselist[1].getFruit().equals(warehouselist[2].getFruit())){
                System.out.println("Warehouses must not store same type of fruit");
                System.out.println("1 = Apple, 2 = Pear, 3 = Orange");
                option1 = keyboard.nextInt();
                switch(option1){
                  case 1: warehouselist[l].setFruit("Apple");
                  break;
                  case 2: warehouselist[l].setFruit("Pear");
                  break;
                  case 3: warehouselist[l].setFruit("Orange");
                  break;
                  default:
                  System.out.println("Set to default fruit apples");
                  warehouselist[l].setFruit("Apple");
        
                }  
            }
            
          System.out.println("How many tonnes can it store");
          do{
             System.out.println("must be a positive integer"); 
             warehouselist[2].setMaxCapacity(keyboard.nextInt());
           
                }while(warehouselist[2].getMaxCapacity() < 0);
            }
        }
        }
        public int juiceAmount(){
        return totaljuice;
        }   
        public int ajuice()
        {
        return ajuice;
        }
        public int ojuice()
        {
        return ojuice;
        }
        public int pjuice(){
        return pjuice;
        }
        public int apjuice(){
        return apjuice;
        }
        public int pojuice(){
        return pojuice;
        }
        public int aojuice(){
        return aojuice;
        }
        public void setJuice()
        {
        if(counter == 1){
        if(warehouselist[0].getFruit().equals("Orange")){
        ojuice = warehouselist[0].getMaxCapacity();
        }else if(warehouselist[0].getFruit().equals("Apple")){
        ajuice = warehouselist[0].getMaxCapacity();
        }else if(warehouselist[0].getFruit().equals("Pear")){
        pjuice = warehouselist[0].getMaxCapacity();
        }
        
        }
        else if(counter == 2){
        if(warehouselist[0].getFruit().equals("Pear") && warehouselist[1].getFruit().equals("Orange")){
        if(warehouselist[0].getMaxCapacity() == warehouselist[1].getMaxCapacity()){
            pojuice = warehouselist[0].getMaxCapacity() + warehouselist[1].getMaxCapacity();
        }else if(warehouselist[0].getMaxCapacity() > warehouselist[1].getMaxCapacity()){
           pjuice = warehouselist[0].getMaxCapacity() - warehouselist[1].getMaxCapacity();
           pojuice = warehouselist[1].getMaxCapacity();
            
        }else if(warehouselist[1].getMaxCapacity() > warehouselist[0].getMaxCapacity()){
           ojuice = warehouselist[1].getMaxCapacity() - warehouselist[0].getMaxCapacity();
           pojuice = warehouselist[0].getMaxCapacity();
           
        }
        }else if(warehouselist[0].getFruit().equals("Orange") && warehouselist[1].getFruit().equals("Pear")){            
            if(warehouselist[0].getMaxCapacity() == warehouselist[1].getMaxCapacity()){
            pojuice = warehouselist[0].getMaxCapacity() + warehouselist[1].getMaxCapacity();
        
        }else if(warehouselist[0].getMaxCapacity() > warehouselist[1].getMaxCapacity()){
           ojuice = warehouselist[0].getMaxCapacity() - warehouselist[1].getMaxCapacity();
           pojuice = warehouselist[1].getMaxCapacity();
            
        }else if(warehouselist[1].getMaxCapacity() > warehouselist[0].getMaxCapacity()){
            pjuice = warehouselist[1].getMaxCapacity() - warehouselist[0].getMaxCapacity();
            pojuice = warehouselist[0].getMaxCapacity();
        
        }
         }else if((warehouselist[0].getFruit().equals("Pear") && warehouselist[1].getFruit().equals("Apple"))){
          if(warehouselist[0].getMaxCapacity() == warehouselist[1].getMaxCapacity()){
          apjuice = warehouselist[0].getMaxCapacity() + warehouselist[1].getMaxCapacity();
        }else if(warehouselist[0].getMaxCapacity() > warehouselist[1].getMaxCapacity()){
            pjuice = warehouselist[0].getMaxCapacity() - warehouselist[1].getMaxCapacity();
            apjuice = warehouselist[1].getMaxCapacity();
            
        }else if(warehouselist[1].getMaxCapacity() > warehouselist[0].getMaxCapacity()){
            ajuice = warehouselist[1].getMaxCapacity() - warehouselist[0].getMaxCapacity();
            apjuice = warehouselist[0].getMaxCapacity();
        
        
        }
        }else if((warehouselist[0].getFruit().equals("Apple") && warehouselist[1].getFruit().equals("Pear"))){
            if(warehouselist[0].getMaxCapacity() == warehouselist[1].getMaxCapacity()){
            apjuice = warehouselist[0].getMaxCapacity() + warehouselist[1].getMaxCapacity();
        
        }else if(warehouselist[0].getMaxCapacity() > warehouselist[1].getMaxCapacity()){
           ajuice = warehouselist[0].getMaxCapacity() - warehouselist[1].getMaxCapacity();
           apjuice = warehouselist[1].getMaxCapacity();
            
        }else if(warehouselist[1].getMaxCapacity() > warehouselist[0].getMaxCapacity()){
            pjuice = warehouselist[1].getMaxCapacity() - warehouselist[0].getMaxCapacity();
            apjuice = warehouselist[0].getMaxCapacity();
        
        }
        }else if((warehouselist[0].getFruit().equals("Apple") && warehouselist[1].getFruit().equals("Orange"))){ 
         if(warehouselist[0].getMaxCapacity() == warehouselist[1].getMaxCapacity()){
         aojuice = warehouselist[0].getMaxCapacity() + warehouselist[1].getMaxCapacity();
        }else if(warehouselist[0].getMaxCapacity() > warehouselist[1].getMaxCapacity()){
           ajuice = warehouselist[0].getMaxCapacity() - warehouselist[1].getMaxCapacity();
           aojuice = warehouselist[1].getMaxCapacity();
            
        }else if(warehouselist[1].getMaxCapacity() > warehouselist[0].getMaxCapacity()){
            ojuice = warehouselist[1].getMaxCapacity() - warehouselist[0].getMaxCapacity();
            aojuice = warehouselist[0].getMaxCapacity();
        
        }
        }else if((warehouselist[0].getFruit().equals("Orange") && warehouselist[1].getFruit().equals("Apple"))){
         if(warehouselist[0].getMaxCapacity() == warehouselist[1].getMaxCapacity()){
         aojuice = warehouselist[0].getMaxCapacity() + warehouselist[1].getMaxCapacity();
         
        }else if(warehouselist[0].getMaxCapacity() > warehouselist[1].getMaxCapacity()){
           ojuice = warehouselist[0].getMaxCapacity() - warehouselist[1].getMaxCapacity();
           aojuice = warehouselist[1].getMaxCapacity();
            
        }else if(warehouselist[1].getMaxCapacity() > warehouselist[0].getMaxCapacity()){
            ajuice = warehouselist[1].getMaxCapacity() - warehouselist[0].getMaxCapacity();
            aojuice = warehouselist[0].getMaxCapacity();
            
        
        }
        }
        }else{
            return;
        }
        }   
        public int aopjuice(){
         if(counter == 3){
             if(warehouselist[0].getMaxCapacity() == warehouselist[1].getMaxCapacity() &&  warehouselist[2].getMaxCapacity() == warehouselist[1].getMaxCapacity()  ){
                 aopjuice = warehouselist[0].getMaxCapacity() + warehouselist[1].getMaxCapacity() + warehouselist[2].getMaxCapacity();
        
        
            return aopjuice;   
        }
        }
        return 0 ;
        }
        public void getJuice()
        {
        System.out.println("Factory "+name+ ":");
            if(size == 'S'){
         System.out.println(+warehouselist[0].getMaxCapacity()+" tonnes of "+warehouselist[0].getFruit()+" juice");
          }else if(size == 'M'){
              
            }
          
        }
        public String[] getFruits()
        {
              if (size  == 'S'){
                  fruit1 = warehouselist[0].getFruit();
                  return new String[] {fruit1};
                }else if(size == 'M'){
                  fruit1 = warehouselist[0].getFruit();
                  fruit2 = warehouselist[1].getFruit();
                  return new String[] {fruit1, fruit2};
                }else{
                fruit1 = warehouselist[0].getFruit();
                fruit2 = warehouselist[1].getFruit();
                fruit3 = warehouselist[2].getFruit();
                return new String[] {fruit1, fruit2, fruit3};
              }
        }
        public void getWarehouses()
        {
            if (size == 'S'){
                System.out.println("Warehouse :  "+warehouselist[0].getName()+ " stores "+warehouselist[0].getFruit());
            }else if(size == 'M'){
               System.out.println("Warehouse :  "+warehouselist[0].getName()+ " stores "+warehouselist[0].getFruit());
               System.out.println("Warehouse :  "+warehouselist[1].getName()+ " stores "+warehouselist[1].getFruit());
            }else{
               System.out.println("Warehouse :  "+warehouselist[0].getName()+ " stores "+warehouselist[0].getFruit());
               System.out.println("Warehouse :  "+warehouselist[1].getName()+ " stores "+warehouselist[1].getFruit());
               System.out.println("Warehouse :  "+warehouselist[2].getName()+ " stores "+warehouselist[2].getFruit());
            }
        
        } 
        public void getWarehousesPlus()
        {
            if (size == 'S'){
               System.out.println("Warehouse :  "+warehouselist[0].getName()+ " stores "+warehouselist[0].getFruit()+" and max capacity "+warehouselist[0].getMaxCapacity());
            }else if(size == 'M'){
               System.out.println("Warehouse :  "+warehouselist[0].getName()+ " stores "+warehouselist[0].getFruit()+" and max capacity "+warehouselist[0].getMaxCapacity());
               System.out.println("Warehouse :  "+warehouselist[1].getName()+ " stores "+warehouselist[1].getFruit()+" and max capacity "+warehouselist[1].getMaxCapacity());
            }else if(size == 'L') {
               System.out.println("Warehouse :  "+warehouselist[0].getName()+ " stores "+warehouselist[0].getFruit()+" and max capacity "+warehouselist[0].getMaxCapacity());
               System.out.println("Warehouse :  "+warehouselist[1].getName()+ " stores "+warehouselist[1].getFruit()+" and max capacity "+warehouselist[1].getMaxCapacity());
               System.out.println("Warehouse :  "+warehouselist[2].getName()+ " stores "+warehouselist[2].getFruit()+" and max capacity "+warehouselist[2].getMaxCapacity());
            }else{
                return;
            }
        }
        public void getOrange()
        {
              for(int m = 0; m < counter;){
                if(warehouselist[m].getFruit().equals("Orange")){
                    System.out.println("Warehouse "+warehouselist[m].getName()+" has that fruit type, and is of factory "+name);
                    m++;
                    break;
                    }else if(warehouselist[m].getFruit() == null){
                    break;
                }else{
                    m++;
                }
            }
            return;
            
        }
        public void getApple()
        {
              for(int m = 0; m < counter; ){
                if(warehouselist[m].getFruit().equals("Apple")){
                    System.out.println("Warehouse "+warehouselist[m].getName()+" has that fruit type, and is of factory "+name);
                    m++;
                    break;
                } else if(warehouselist[m].getFruit() == null){
                    break;
                }else{
                    m++;
                }
            }
            return;
        
        }
        public void getPear()
        {
              for(int m = 0; m < counter; ){
                if(warehouselist[m].getFruit().equals("Pear")){
                    System.out.println("Warehouse "+warehouselist[m].getName()+" has that fruit type, and is of factory "+name);
                    m++;
                    break;
                }else if(warehouselist[m].getFruit() == null){
                    break;
                }else{
                    m++;
                }
            }
            return;
        }
        public String checkOrange()
        {
                fruit1 = "False";
            for(int m = 0; m < counter;){
                if(warehouselist[m].getFruit().equals("Orange")){
                   fruit1 = "Orange";
                   break;
               }else{
                 m++;    
                }
            }
            return fruit1;
        }
        public String checkApple()
        {
            fruit1 = "False";
            for(int m = 0; m < counter;){
                if(warehouselist[m].getFruit().equals("Apple")){
                   fruit1 = "Apple";
                   break;
               }else{
                 m++;    
                }
            }
            return fruit1;
        }
        public String checkPear()
        {
            fruit1 = "False";
            for(int m = 0; m < counter;){
                if(warehouselist[m].getFruit().equals("Pear")){
                   fruit1 = "Pear";
                   break;
               }else{
                 m++;    
                }
            }
            return fruit1;
        }
        public void addWarehouse(int m,String inputName,String inputfruit,int inputmaxcapacity)
        {
            setWarehouse1(warehouselist[m],inputName,inputfruit,inputmaxcapacity);
        }
        private void setWarehouse1(Warehouse m, String name, String fruit, int maxcapacity)
        {
           m.setName(name);
           m.setFruit(fruit);
           m.setMaxCapacity(maxcapacity);
    
        }
        public void setCounter(int inputwarehouse)
        {
         counter = inputwarehouse;   
        }
        public int getCounter()
        {
         return counter;   
        }
        public String Warehouse1Name()
        {
               return warehouselist[0].getName();
            }
        public String Warehouse2Name()
         {
               return warehouselist[1].getName();
        }
        public String Warehouse3Name()
        {
               return warehouselist[2].getName();
        }
        public String Warehouse1Fruit()
        {
            return warehouselist[0].getFruit();
        }
         public String Warehouse2Fruit()
        {
            return warehouselist[1].getFruit();
        }
         public String Warehouse3Fruit()
        {
            return warehouselist[2].getFruit();
        }
        public int Warehouse1size()
        {
            return warehouselist[0].getMaxCapacity();
        }
         public int Warehouse2size()
        {
            return warehouselist[1].getMaxCapacity();
        }
         public int Warehouse3size()
        {
            return warehouselist[2].getMaxCapacity();
        }
      
}
 
         
        
    

        
 




