package Default.Lab3_Starter.src.arraylist;

public class PointThreeD {
protected double xPoint;
protected double yPoint;
protected double zPoint;

public PointThreeD() {
	this.xPoint=0;
	this.yPoint=0;
	this.zPoint=0;
}//end PointThreeD

public PointThreeD(double x, double y, double z) {
	this.xPoint=x;
	this.yPoint=y;
	this.zPoint=z;
}//end PointThreeD

public String toString() {
	return "(x Point: " + xPoint + ", y Point: " + yPoint + ", z Point: " + zPoint + ")";
}//end toString
}
