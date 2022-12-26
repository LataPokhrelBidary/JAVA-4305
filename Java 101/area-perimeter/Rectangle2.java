package language.Classes;

public class Rectangle2 {

        private double length;
        private double width;

        public  Rectangle2(){
            this.length = 0;
            this.width =0;
            System.out.println("Default constructor called. setting length and width of rectangle to be zero.");
        }

        public Rectangle2(double length, double width) {
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

    public double getArea() {
        double area = getLength() * getWidth();
        return area;
    }

    public double getPerimeter() {
        double peri = 2 * (getLength() + getWidth());
        return peri;
    }

        }



