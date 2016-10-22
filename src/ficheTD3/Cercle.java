package ficheTD3;

public class Cercle {

	private float rayon;
	public Point centre = new Point();

	public Cercle(Point centre, float rayon) {

		this.centre = centre;
		this.rayon = rayon;

	}

	public Cercle(float rayon) {

		this(new Point(), rayon);
	}

	public float périmètre(float rayon) {

		return (float) (2 * rayon * Math.PI);
	}

	public Cercle symetrie(Point centre) {

		return new Cercle(centre.symertie(), rayon);
	}

	@Override
	public String toString() {
		return " rayon=" + rayon + ", centre=" + centre + ""; //meme remarque ici
	}

	public float getRayon() {
		return rayon;
	}

	public void setRayon(float rayon) {
		this.rayon = rayon;
	}

}
