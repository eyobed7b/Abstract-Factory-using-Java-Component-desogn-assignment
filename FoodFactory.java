

public class FoodFactory extends AbstractFactory{
    public EthiopianFood getFood(String food){
        if(food == null){
            return null;
        }
        if(food.equalsIgnoreCase("KTFO")){
            return new Ktfo();
        }else if (food.equalsIgnoreCase("DOROWET")){
            return new Dorowet();
        }else if (food.equalsIgnoreCase("SHROWET")){
            return new Shrowet();
        }

        return null;
    }
    EthiopianFoodType getFoodType ( String foodtype){
        return null;
    }
}