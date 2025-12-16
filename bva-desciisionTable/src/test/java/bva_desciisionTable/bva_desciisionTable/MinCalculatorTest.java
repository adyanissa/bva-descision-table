package bva_desciisionTable.bva_desciisionTable;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MinCalculatorTest {
    
	 @Test
	    void testCIsZero_shouldThrowException() {
	        // arrange
	        int a = 100; 
	        int b = 100;
	        int c = 0;
	        int d = 100;
	        int e = 100;

	      
	        assertThrows(IllegalArgumentException.class, () -> {
	        	MinCalculator.findMin(a, b, c, d, e);
	        });
	    }

	 @Test
	    void testCIsOne_shouldReturnMinimum() {
	       
		    int a = 100;   
	        int b = 100;
	        int c = 1;
	        int d = 100;
	        int e = 100;

	        // act
	        int result = MinCalculator.findMin(a, b, c, d, e);

	        // assert
	        assertEquals(1, result);  
	    }
	 @Test
	 void testCIsTwo_shouldReturnMinimum() {
	     int a = 100;
	     int b = 100;
	     int c = 2;  
	     int d = 100;
	     int e = 100;

	     int result = MinCalculator.findMin(a, b, c, d, e);

	     assertEquals(2, result);
	 }
	 @Test
	 void testCIsNominal_shouldReturnMinimum() {
	     int a = 100;
	     int b = 100;
	     int c = 500;  
	     int d = 100;
	     int e = 100;

	     int result = MinCalculator.findMin(a, b, c, d, e);

	     assertEquals(100, result);
	     }	     
	 @Test
	 void testCIsMaxMinusOne_shouldReturnMinimum() {
	     int a = 100;
	     int b = 100;
	     int c = 999;  
	     int d = 100;
	     int e = 100;

	     int result = MinCalculator.findMin(a, b, c, d, e);

	     assertEquals(100, result);
	 }
	 @Test
	 void testCIsMax_shouldReturnMinimum() {
	     int a = 100;
	     int b = 100;
	     int c = 1000;  
	     int d = 100;
	     int e = 100;

	     int result = MinCalculator.findMin(a, b, c, d, e);

	     assertEquals(100, result);
	 }
	 @Test
	 void testCIsAboveMax_shouldThrowException() {
	     int a = 100;
	     int b = 100;
	     int c = 1001;  
	     int d = 100;
	     int e = 100;

	     assertThrows(IllegalArgumentException.class, () -> {
	         MinCalculator.findMin(a, b, c, d, e);
	     });
	 }
	 @Test
	    void testEIsZero_shouldThrowException() {
	        // arrange
	        int a = 428;  
	        int b = 428;
	        int c = 428;
	        int d = 428;
	        int e = 0;

	      
	        assertThrows(IllegalArgumentException.class, () -> {
	        	MinCalculator.findMin(a, b, c, d, e);
	        });
	    }

	 @Test
	    void testEIsOne_shouldReturnMinimum() {
	        // arrange
		    int a = 428; 
	        int b = 428;
	        int c = 428;
	        int d = 428;
	        int e = 1;

	        // act
	        int result = MinCalculator.findMin(a, b, c, d, e);

	        // assert
	        assertEquals(1, result);   
	    }
	 @Test
	 void testEIsTwo_shouldReturnMinimum() {
	     int a = 428;
	     int b = 428;
	     int c = 428;  
	     int d = 428;
	     int e = 2;

	     int result = MinCalculator.findMin(a, b, c, d, e);

	     assertEquals(2, result);
	 }
	 @Test
	 void testEIsNominal_shouldReturnMinimum() {
	     int a = 428;
	     int b = 428;
	     int c = 428;  
	     int d = 428;
	     int e = 427;

	     int result = MinCalculator.findMin(a, b, c, d, e);

	     assertEquals(427, result);
	     }	     
	 @Test
	 void testEIsMaxMinusOne_shouldReturnMinimum() {
	     int a = 428;
	     int b = 428;
	     int c = 428;  
	     int d = 428;
	     int e = 999;

	     int result = MinCalculator.findMin(a, b, c, d, e);

	     assertEquals(428, result);
	 }
	 @Test
	 void testEIsMax_shouldReturnMinimum() {
	     int a = 428;
	     int b = 428;
	     int c = 428;  
	     int d = 428;
	     int e = 1000;

	     int result = MinCalculator.findMin(a, b, c, d, e);

	     assertEquals(428, result);
	 }
	 @Test
	 void testEIsAboveMax_shouldThrowException() {
	     int a = 428;
	     int b = 428;
	     int c = 428;  
	     int d = 428;
	     int e = 1001;

	     assertThrows(IllegalArgumentException.class, () -> {
	         MinCalculator.findMin(a, b, c, d, e);
	     });
	 }

	     
	 
	 
	 
}
