package facade_design_pattern;

public class Demonstration {
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangle();
	      shapeMaker.drawSquare();		
	}
}
