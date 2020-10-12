import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	private GradeBook gBook1;
	private GradeBook gBook2;
	
	@BeforeEach
	void setUp() throws Exception {
		gBook1 = new GradeBook(5);
		gBook1.addScore(86.5);
		gBook1.addScore(93.0);
		
		gBook2 = new GradeBook(5);
		gBook2.addScore(63.5);
		gBook2.addScore(85.0);
		gBook2.addScore(99.0);
	}
	

	@AfterEach
	void tearDown() throws Exception {
		gBook1 = null;
		gBook2 = null;
	}

	@Test
	void testAddScore() {
	//	fail("Not yet implemented");
		
		assertTrue(gBook1.toString().equals("86.5 93.0"));
		assertTrue(gBook2.toString().equals("63.5 85.0 99.0"));
		
		
	}

	@Test
	void testSum() {
	//	fail("Not yet implemented");
		
		assertEquals(179.5, gBook1.sum(), .0001);
		assertEquals(247.5, gBook2.sum(), .0001);
	}

	@Test
	void testMinimum() {
	//	fail("Not yet implemented");
		
		assertEquals(86.5, gBook1.minimum(), .001);
		assertEquals(63.5, gBook2.minimum(), .001);
		
		assertEquals(2, gBook1.getScoreSize(), 0.001);
	    assertEquals(3, gBook2.getScoreSize(), 0.001);
	}

	@Test
	void testFinalScore() {
	//	fail("Not yet implemented");
		
		assertEquals(93.0, gBook1.finalScore(), .001);
		assertEquals(184.0, gBook1.finalScore(), .001);
	}
	


}
