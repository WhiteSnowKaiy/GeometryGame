package models;

public class Square extends Model{
    public float getArea(){
        if (checkNegativeValue(getxAxis()) == true && checkNegativeValue(getyAxis()) == true){
            return -1;
        }
        return getxAxis() * getyAxis();
    }
    
    public float getCircumference(){
        if (checkNegativeValue(getxAxis()) == true){
            return -1;
        }
        return 4*getxAxis();
    }
}
