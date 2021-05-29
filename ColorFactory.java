

public class ColorFactory extends AbstractFactory{
    public Shape getShape(String shapeType){
        
        return null;
    }
    Color getColor ( String colorType){
        if(colorType == null){
            return null;
        }
        if(colorType.equalsIgnoreCase("Red")){
            return new Red();
        }else if (colorType.equalsIgnoreCase("GREEN")){
            return new Green();
        }else if (colorType.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}