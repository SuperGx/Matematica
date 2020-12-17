import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PhotosTests2 {

	Photos photos;
	@Before
	public void setUp() {
		photos = new Photos("Cale", 100, 50);
	}


	@Test
	public void testSize() {
		assertEquals(5000, photos.calculatePhotoSize());
	}

}
