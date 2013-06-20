import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SortingTest {
	IntSortHandle intHandle;
	BubbleSorter sorter;

	@Before
	public void beforeAll() {
		intHandle = new IntSortHandle();
		sorter = new BubbleSorter(intHandle);

	}

	@Test
	public void sortsInts() {
		int[] ints = new int[4];
		ints[0] = 50;
		ints[1] = 34;
		ints[2] = 45;
		ints[3] = 1;
		
		int[] expected = new int[4];
		expected[0] = 1;
		expected[1] = 34;
		expected[2] = 45;
		expected[3] = 50;
		
		sorter.sort(ints);
		for(int i=0; i<4; i++)
			assertEquals(ints[i], expected[i]);
	}
}
