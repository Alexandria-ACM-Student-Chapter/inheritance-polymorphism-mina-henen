/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author HP
 */
public class Rectangle {

   public class rectangle extends shape
    {
        private double width=1.0;
        private double length=1.0;
        public rectangle()
        {
        }
        public rectangle(double width,double length)
        {
            this.width= width;
            this.length= length;
        }
        public rectangle(double width,double length,String color,boolean filled)
        {
            super(color,filled);
            this.width= width;
            this.length= length;
        }
        public double getWidth()
        {
            return width;
        }
        public void setWidth(double width)
        {
            this.width= width;
        }
        public double getLength()
        {
            return length;
        }
        public void setLength(double length)
        {
            this.length= length;
        }
        public double getArea()
        {
            double area= length*width;
            return area;
        }
        public double getPerimeter()
        {
            double per= 2*(length+width);
            return per;
        }
        @Override
        public String toString()
        {
            String st= "rectangle[color= " +getColor()+ ",filled= " +isFilled()+" ,width= "+getWidth()+" ,length= "+getLength()+ " ,area="+getArea()+" ,perimeter="+ getPerimeter()+"]";
            return st;
        }
    
}
