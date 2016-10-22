package ficheTD3;

public class Segment {

	public Point A = new Point();
	public Point B = new Point();

	public Segment(Point A, Point B) {
		this.A = A;
		this.B = B;

	}

	public Segment(Point B) {

		this(new Point(), B);
	}

	public double distance(Point A, Point B) {

		return Math.sqrt(
				(Math.pow((B.getAbcisse() - A.getAbcisse()), 2) + Math.pow((B.getOrdonne() - A.getOrdonne()), 2)));
	}

	public Segment symetrie(Point A, Point B) {

		return new Segment((A.symertie()), (B.symertie()));
	}

	@Override
	public String toString() {
		return "" + A + "" + B + ""; // sans mettre explicitement toString()
	}

}
