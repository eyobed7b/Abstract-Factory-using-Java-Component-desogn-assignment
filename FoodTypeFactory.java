

public class FoodTypeFactory extends AbstractFactory{
    public EthiopianFood getFood(String food){
        
        return null;
    }
    EthiopianFoodType getFoodType ( String foodtype){
        if(foodtype == null){
            return null;
        }
        if(foodtype.equalsIgnoreCase("KEYWET")){
            return new Keywet();
        }else if (foodtype.equalsIgnoreCase("ALCHA")){
            return new Alchawet();
        }

        return null;
    }
}