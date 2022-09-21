
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class TestMultiplication {
	@Test
	 public void testMultiplication() {
		   Dollar five = new Dollar(5);
		   assertEquals(new Dollar(10), five.times(2));
		   assertEquals(new Dollar(15), five.times(3));
	 }
}
