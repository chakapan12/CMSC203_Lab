import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	GradeBook gradeBook1;
	GradeBook gradeBook2;

	@BeforeEach
	void setUp() throws Exception {

		// Task #3 create first GradeBook object and call the add score method twice
		gradeBook1 = new GradeBook(5);
		gradeBook1.addScore(10.5);
		gradeBook1.addScore(12.5);

		// Task #3 create second GradeBook object and call the add score method three
		// times
		gradeBook2 = new GradeBook(5);
		gradeBook2.addScore(16.7);
		gradeBook2.addScore(18.0);
		gradeBook2.addScore(20.5);

	}

	@AfterEach
	void tearDown() throws Exception {
		// set two GradeBook object to null
		gradeBook1 = null;
		gradeBook2 = null;

	}

	// Task #4 create test the methods of GradeBook:
	@Test
	void testAddScore() {
		// compare content in scores array using toString method
		assertTrue(gradeBook1.toString().equals("10.5 12.5"));
		assertTrue(gradeBook2.toString().equals("16.7 18.0 20.5"));

		// compare the scoreSize
		assertEquals(2, gradeBook1.getScoreSize());
		assertEquals(3, gradeBook2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(23.00, gradeBook1.sum(), 0.001);
		assertEquals(55.2, gradeBook2.sum(), 0.001);
	}

	@Test
	void testMinimum() {
		assertEquals(10.5, gradeBook1.minimum(), 0.001);
		assertEquals(16.7, gradeBook2.minimum(), 0.001);

	}

	@Test
	void testFinalScore() {
		assertEquals(12.5, gradeBook1.finalScore(), 0.001);
		assertEquals(38.5, gradeBook2.finalScore(), 0.001);

	}

}
