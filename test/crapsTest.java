import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class crapsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLoseOnEmpty() {
		int[] rolls = {};
		assertFalse(Craps.craps(rolls));
	}

	@Test
	public void testWinOnSeven(){
		int[] rolls = {7};
		assertTrue(Craps.craps(rolls));
	}
	
	@Test
	public void testWinOnEleven(){
		int[] rolls = {11};
		assertTrue(Craps.craps(rolls));
	}
	
	@Test
	public void testLoseOnTwo(){
		int[] rolls = {2};
		assertFalse(Craps.craps(rolls));
	}
	
	@Test
	public void testLoseOnThree(){
		int[] rolls = {3};
		assertFalse(Craps.craps(rolls));
	}
	
	@Test
	public void testLoseOnTwelve(){
		int[] rolls = {12};
		assertFalse(Craps.craps(rolls));
	}
	
	@Test
	public void testWinOnSecondRoll(){
		int[] rolls = {6, 6};
		assertTrue(Craps.craps(rolls));
	}
	
	@Test
	public void testLoseOnSecondRoll(){
		int[] rolls = {6, 7};
		assertFalse(Craps.craps(rolls));
	}
	
	@Test
	public void testWinOnGetPointNumBeforeSeven(){
		int[] rolls = {6, 6, 7};
		assertTrue(Craps.craps(rolls));
	}
	
	@Test
	public void testLoseOnGetSevenBeforePointNum(){
		int[] rolls = {6, 5, 7, 6};
		assertFalse(Craps.craps(rolls));
	}
	
	@Test
	public void testLoseOnNotEnoughRolls(){
		int[] rolls = {6, 5, 4, 3, 2, 1, 8};
		assertFalse(Craps.craps(rolls));
	}
	
	@Test
	public void testWinOnMoreThanTwoRolls(){
		int[] rolls = {8, 5, 4, 3, 2, 1, 8, 7};
		assertTrue(Craps.craps(rolls));
	}
}
