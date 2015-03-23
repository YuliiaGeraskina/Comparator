public class Rectangle extends Shape implements IShapes {
	protected int a;
	protected int b;

	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double getArea() {
		return (a * b);
	}

	@Override
	public String getShape() {
		return "Rectangle";
	}

	@Override
	public String getShapeParametrs() {
		String s;
		s = "a:" + Integer.toString(a) + "," + " b:" + Integer.toString(b);
		return s;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
