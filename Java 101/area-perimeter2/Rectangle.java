package language.Classes;


public class Rectangle {
    private double length;
    private double width;

public  Rectangle(){
this(0.00,0.00);
}
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public static double  perimeterOfRectangle(double length, double width){
       double perimeterOfRectangle = 2*(length + width);
       return  perimeterOfRectangle;

    }
    public static double areaOfRectangle(double length, double width){
        double areaOfRectangle = (length * width);
        return areaOfRectangle;
    }
}
