public class Circle extends Shape implements IShapes {
	protected int r;

	public Circle(int r) {
		this.r = r;
	}
	@Override
	public double getArea() {
		return (Math.PI * r * r);
	}
	@Override
	public String getShape() {
		return "Circle";
	}
	@Override
	public String getShapeParametrs() {
		String s;
		s = "r:" + Integer.toString(r);
		return s;
	}

}
