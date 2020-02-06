/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.complex;
import java.lang.Math;

/**
 *
 * @author HP
 */
public class MyComplex {
    
    private double real, imag;
    public MyComplex()
    {
    }
    public MyComplex(double real, double imag)
    {
        this.real= real;
        this.imag= imag;
    }
    public double getReal()
    {
        return real;
    }
    public void setReal(double real)
    {
        this.real=real;
    }
    public double getImag()
    {
        return imag;
    }
    public void setImag(double imag)
    {
        this.imag=imag;
    }
    public void setValue(double real, double imag)
    {
        this.real= real;
        this.imag= imag;
    }
    public String toString()
    {
        String st= "("+getReal()+"+"+getImag()+"i)";
        return st;
    }
    public boolean isReal()
    {
        if(this.imag==0 && this.real!=0)
        {
            return true;
        }
        else
            return false;
    }
    public boolean isImaginagry()
    {
        if(this.imag!=0 && this.real==0)
        {
            return true;
        }
        else
            return false;
    }
    public boolean eqauls(double real, double imag)
    {
        if(this.real==real && this.imag==imag)
            return true;
        else
            return false;
    }
    public boolean eqauls(MyComplex another)
    {
        if(this.real==another.real && this.imag==another.imag)
            return true;
        else
            return false;
    }
    public double magnitude()
    {
        double m= (real*real)+(imag*imag);
        double mag= Math.sqrt(m);
        return mag;
    }
    public double argument()
    {
        double ang= Math.atan(imag/real);
        double rad= ang*(Math.PI/180);
        return rad;
    }
    public MyComplex add(MyComplex right)
    {
        MyComplex ans = null;
        ans.real= this.real + right.real;
        ans.imag= this.imag + right.imag;
        return ans;
    }
    public MyComplex subtract(MyComplex right)
    {
        MyComplex ans = null;
        ans.real= this.real - right.real;
        ans.imag= this.imag - right.imag;
        return ans;
    }
    public MyComplex multiply(MyComplex right)
    {
        MyComplex ans = null;
        ans.real= (this.real*right.real)-(this.imag*right.imag);
        ans.imag= (this.real*right.imag)+(this.imag*right.real);
        return ans;
    }
    public MyComplex conjugate()
    {
        MyComplex con= null;
        con.real=this.real;
        con.imag=this.imag*(-1);
        return con;
    }
    public MyComplex divide(MyComplex right)
    {
        MyComplex den= MyComplex.multiply(right);
    }
    
    
    


    
}
