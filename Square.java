/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package square;

/**
 *
 * @author HP
 */
public class Square {
public class square extends rectangle
    {
        
        public square()
        {
            
        }
        public square(double side)
        {
            setWidth(side);
            setLength(side);
        }
        public square(double side,String color, boolean filled)
        {
            super.setFilled(filled);
            super.setColor(color);
            setWidth(side);
            setLength(side);
        }
        public double getSide()
        {
            return getWidth();
        }
        public void setSide(double side)
        {
            setWidth(side);
            setLength(side);
        }
        public void setWidth(double side)
        {
            setWidth(side);
            setLength(side);
        }
        public void setLength(double side)
        {
            setWidth(side);
            setLength(side);
        }
        public double getArea()
        {
            double area= getSide()*getSide();
            return area;
        }
        public double getPerimeter()
        {
            double per= 4*getSide();
            return per;
        }
        public String toString()
        {
            String st= "square[color= " +getColor()+ ",filled= " +isFilled()+" ,radius= "+getSide()+ " ,area="+getArea()+" ,perimeter="+ getPerimeter()+"]";
            return st;
        }
    
}
