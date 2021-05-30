


public class Shrowet implements EthiopianFood{
    String foodName = "Shrowet";
    String descriprion = "Shiro  is an Ethiopian-Eritrean stew. \nIts primary ingredient is powdered chickpeas or broad bean meal and often prepared with the addition of minced onions,\n garlic and, depending upon regional variation, ground ginger or chopped tomatoes and chili-peppers.";
    int price = 60;
    public void getFood(){
        System.out.print("\n\nName: "+foodName+"\nPrice: "+price+"\nDescription: "+descriprion);
    }
}