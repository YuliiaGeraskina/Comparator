public class Triangle extends Shape implements IShapes {
	protected int a;
	protected int b;
	protected int c;

	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public double getArea() {
		int p = a + b + c;
		return (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
	}

	@Override
	public String getShape() {
		return "Triangle";
	}

	@Override
	public String getShapeParametrs() {
		String s;
		s = "a:" + Integer.toString(a) + "," + " b:" + Integer.toString(b)
				+ "," + " c:" + Integer.toString(c);
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
