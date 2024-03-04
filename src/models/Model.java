package models;

public class Model {
    
    private float xAxis;
    private float yAxis;
    private int yaw;
    private String name;

    // Getters and setters
    public float getxAxis() { return xAxis; }
    public void setxAxis(float xAxis) { this.xAxis = xAxis; }
    public float getyAxis() { return yAxis; }
    public void setyAxis(float yAxis) { this.yAxis = yAxis; }
    public int getYaw() { return yaw; }
    public void setYaw(int yaw) { this.yaw = yaw; }
    public String getName() { return this.name; }
    public void setName(String name){ this.name = name; }


    public boolean checkNegativeValue(float value){
        if (value < 0){
            return true;
        }
        return false;
    }
    
    public void printInfo(){
        System.out.println("Size of X: " + getxAxis());
        System.out.println("Size of Y: " + getyAxis());
        System.out.println("Size of Yaw: " + getYaw());
    }
}
