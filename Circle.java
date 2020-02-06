/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author HP
 */
public class Circle {

    /**
     * @param args the command line arguments
     */
    public class circle extends shape
    {
        private double radius= 1.0;
        public circle()
        {
        }
        public circle(double radius)
        {
            this.radius= radius;
        }
        public circle(double radius, String color, boolean filled)
        {
            super(color,filled);
            this.radius= radius;
        }
        public double getRadius()
        {
            return radius;
        }
        public void setRadius(double radius)
        {
            this.radius= radius;
        }
        public double getArea()
        {
            double area= (radius*radius)*3.14;
            return area;
        }
        public double getPerimeter()
        {
            double per= 2*radius*3.14;
            return per;
        }
        @Override
        public String toString()
        {
            String st= "circle[color= " +getColor()+ ",filled= " +isFilled()+" ,radius= "+getRadius()+ " ,area="+getArea()+" ,perimeter="+ getPerimeter()+"]";
            return st;
        }
    }
    
}
