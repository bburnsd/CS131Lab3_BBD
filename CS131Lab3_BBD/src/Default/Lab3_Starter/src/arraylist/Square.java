package Default.Lab3_Starter.src.arraylist;

public class Square {
protected double side;

public Square() {
	side = 0;
}//end Square

public Square(double s) {
	this.side=s;
}//end Square

public double getArea() {
	double area = this.side*this.side;
	return area;
}//end getArea

public String toString() {
	return "(Side : " + side + ")";
}//end toString
}
