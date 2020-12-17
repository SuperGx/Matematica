
public class Photos {
	
	String path;
	int width;
	int height;
	public Photos(String path, int width, int height) {
		super();
		this.path = path;
		this.width = width;
		this.height = height;
	}
	public String getPath() {
		return path;
	}

	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	public int calculatePhotoSize()
	{
		return width * height;
	}

}
