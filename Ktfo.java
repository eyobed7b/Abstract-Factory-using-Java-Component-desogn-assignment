

public class Ktfo implements EthiopianFood{
    
    String foodName = "Ktfo";
    String descriprion = "Ktfo is a traditional dish found in Eritrean and Ethiopian cuisine.\n It consists of minced raw beef, marinated in mitmita (a chili powder-based spice blend) \nand niter kibbeh (a clarified butter infused with herbs and spices). ";

    int price = 250;
    public void getFood(){
        System.out.print("\n\nName: "+foodName+"\nPrice:"+price+"\nDescription: "+descriprion);
    }
}