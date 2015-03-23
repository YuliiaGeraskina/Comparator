
import java.util.Comparator;

public abstract class Shape implements IShapes, Comparable, Comparator {
	protected String name;

	public Shape() {

	}

	
}
class ShapeComparator implements Comparator<Object> {
	@Override
	public int compare(Object o1, Object o2) {
		Shape h1 = (Shape)o1;
		Shape h2 =(Shape)o2;
		if (h1.getArea() > h2.getArea())	return 1;
		else if (h1.getArea() < h2.getArea()) return -1;
		return 0; 
	}
	}
