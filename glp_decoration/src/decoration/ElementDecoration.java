package decoration;

public class ElementDecoration {
	
	private float length;
	private float width;
	private float height;
	
	public ElementDecoration(float length, float width, float height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public float getLength() {
		return length;
	}

	public float getWidth() {
		return width;
	}

	public float getHeight() {
		return height;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "ElementDecoration [length=" + length + ", width=" + width + ", height=" + height + "]";
	}

}
