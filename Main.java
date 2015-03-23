import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Shape[] list = {
				new Rectangle(1 + (int) (Math.random() * 50),
						1 + (int) (Math.random() * 50)),
				new Rectangle(1 + (int) (Math.random() * 50),
						1 + (int) (Math.random() * 50)),
				new Triangle(1 + (int) (Math.random() * 50),
						1 + (int) (Math.random() * 50),
						1 + (int) (Math.random() * 50)),
				new Circle(1 + (int) (Math.random() * 50)) };

		StringBuilder sb;
		Arrays.sort(list, new ShapeComparator());
		for (Shape s : list) {
			sb = new StringBuilder();
			sb.append(s.getShape());
			sb.append("[" + s.getShapeParametrs() + "]");
			sb.append(": ");
			sb.append(s.getArea());
			s.getArea();

			System.out.println(sb.toString());

		}
		
	}

}
