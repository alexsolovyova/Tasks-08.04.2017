package by.htp.circle;




	import static java.lang.Math.PI;


	public class Circle {
	    private double x;
	    private double y;
	    private double r;
	    public Circle(double x,double y,double r){
	        this.r=r;
	        this.x=x;
	        this.y=y;
	    }
	    public double getR() {
	        return r;
	    }

	    public void setR(double r) {
	        this.r = r;
	    }

	    public double getX() {
	        return x;
	    }

	    public void setX(double x) {
	        this.x = x;
	    }

	    public double getY() {
	        return y;
	    }

	    public void setY(double y) {
	        this.y = y;
	    }


	    public double findS(){
	    
	        return PI*r*r;
	    }
	    public double findP(){
	     
	        return 2*PI*r;
	    }

	    @Override
	    public String toString() {
	        return "Circle{" +
	                "x=" + x +
	                ", y=" + y +
	                ", r=" + r +
	                ", per="+findP()+
	                ", area="+findS()+
	                '}';
	    }
	}

