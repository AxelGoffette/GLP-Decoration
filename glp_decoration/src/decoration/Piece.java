package decoration;

public abstract class Piece extends Appartement {
		
	public Piece(float length, float width, Appartement a) {
		super(length, width, a.getHeight());
	}

	public float surface(float length, float width) {
		return length*width;
	}
	
}