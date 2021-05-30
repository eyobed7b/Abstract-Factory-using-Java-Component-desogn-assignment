
import java.util.*;
public class AbstractFactoryApp{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        AbstractFactory foodFactory = FactoryProducer.getFactory("FOOD");
        AbstractFactory foodtypeFactory = FactoryProducer.getFactory("FOODTYPE");
        System.out.print("Menu \n");
        System.out.print("1 Ktfo \n2 Shrowet \n3 Dorowet \n");
        String str1= sc.nextLine();
        if(str1.equalsIgnoreCase("1")){
            EthiopianFood food1 = foodFactory.getFood("KTFO");
            food1.getFood();
    } else if(str1.equalsIgnoreCase("2")){
            EthiopianFood food2 = foodFactory.getFood("SHROWET");
            food2.getFood();
 }
        else  if(str1.equalsIgnoreCase("3")){
            EthiopianFood food3 = foodFactory.getFood("DOROWET");
            food3.getFood();
        }

        System.out.print("\n\nSelect type of food \n1 Alcha \n2 Keywet \n");
        String str2= sc.nextLine();

        if(str1.equalsIgnoreCase("1")){
            EthiopianFoodType foodtype1 = foodtypeFactory.getFoodType("ALCHA");

            foodtype1.getFoodType();
        }else  if(str1.equalsIgnoreCase("2")){
            EthiopianFoodType foodtype2 = foodtypeFactory.getFoodType("KEYWET");
            foodtype2.getFoodType();

        }
       

     

        
      


   
    }
}