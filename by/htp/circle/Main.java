package by.htp.circle;

public class Main extends CirclesList{

	public static void main(String[] args) {
	
		  CirclesList newCircles=new CirclesList();
	        Circle c1 = new Circle(8, 3, 1);
	        Circle c2 =new Circle(6, 4, 5);
	        Circle c3 =new Circle(4, 9, 1);
	
	        newCircles.addCircle(c1);
	        newCircles.addCircle(c2);
	        newCircles.addCircle(c3);
	 
	        newCircles.maxMinSp();
	        newCircles.pointsBelongLine();
	        System.out.println(c1.toString());

	    }
	    
	}

