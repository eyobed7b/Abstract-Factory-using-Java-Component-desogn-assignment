

public class FactoryProducer{
    public static AbstractFactory getFactory(String choice){
         if(choice.equalsIgnoreCase("FOOD")) return new  FoodFactory();
         else if(choice.equalsIgnoreCase("FOODTYPE")) return new FoodTypeFactory();

         return null;
    }
}