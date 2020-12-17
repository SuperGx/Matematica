import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PhotosTests {

	Photos photos;
	@Before
	public void setUp() {
		photos = new Photos("Cale", 100, 50);
	}

	@Test
	public void testPath() {
		assertEquals("Cale", photos.getPath());
	}

	@Test
	public void testWidth() {
		assertEquals(100, photos.getWidth());
	}

	@Test
	public void testHeight() {
		assertEquals(50, photos.getHeight());
	}
}
