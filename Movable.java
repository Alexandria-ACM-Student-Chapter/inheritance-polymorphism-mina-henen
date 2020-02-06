/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

/**
 *
 * @author HP
 */
public class Movable {

    /**
     * @param args the command line arguments
     */
    public interface movable
    {
        public void moveUp();
        public void moveDown();
        public void moveRight();
        public void moveLeft();
    }
    public class movablePoint implements movable
    {
        protected int x;
        protected int y;
        protected int xSpeed;
        protected int ySpeed;
        public movablePoint(int x, int y, int xSpeed, int ySpeed)
        {
            this.x=x;
            this.y=y;
            this.xSpeed=xSpeed;
            this.ySpeed=ySpeed;
        }
        public String toString()
        {
            String st= "movable point[x="+x+ " ,y="+y+"]";
            return st;
        }
        public void moveUp()
        {
            y+=1;
        }
        public void moveDown()
        {
            y-=1;
        }
        public void moveRight()
        {
            x+=1;
        }
        public void moveLeft()
        {
            x-=1;
        }
    }
    public class movableCircle implements movable
    {
        private int radius;
        private movablePoint center;
        public movableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
        {
            center.x=x;
            center.y=y;
            center.xSpeed= xSpeed;
            center.ySpeed= ySpeed;
            this.radius= radius;
        }
        public String toString()
        {
            String st= "circle[center x="+center.x+ " ,center y="+center.y+", radius= "+radius+"]";
            return st;
        }
        public void moveUp()
        {
            center.y+=1;
        }
        public void moveDown()
        {
            center.y-=1;
        }
        public void moveRight()
        {
            center.x+=1;
        }
        public void moveLeft()
        {
            center.x-=1;
        }
    }
    
}
