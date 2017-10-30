import TinyTestJ.Test;
import static TinyTestJ.Assert.*;

public class TestSuite {
  @Test public static void DETest1() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(10000);
    assertEquals(8500,result,0.001);
  }
  @Test public static void DETest2() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(-1);
    assertEquals(1,result,0.001);
  }
  
  @Test public static void DETest3() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(-50);
    assertEquals(-42.5,result,0.001);
	  }
  
  @Test public static void PETest1() {
	    UnitConverter test = new PoundToEuroConverter();
	    double result = test.convert(0);
	    assertEquals(0,result,0.001);
		  }
  
  @Test public static void PETest2() {
	    UnitConverter test = new PoundToEuroConverter();
	    double result = test.convert(Math.pow(2, 64));
	    assertEquals(2084482003291790000,result,0.001);
		  }
  
  @Test public static void PETest3() {
	    UnitConverter test = new PoundToEuroConverter();
	    double result = test.convert(150);
	    assertEquals(169.5,result,0.001);
		  }
  
  @Test public static void USGLTest1() {
	    UnitConverter test = new USGallonToLitreConverter();
	    double result = test.convert(0);
	    assertEquals(0,result,0.001);
		  }

  @Test public static void USGLTest2() {
	    UnitConverter test = new USGallonToLitreConverter();
	    double result = test.convert(Math.pow(2, 32));
	    assertEquals(16256451215.36,result,0.001);
		  }

  @Test public static void USGLTest3() {
	    UnitConverter test = new USGallonToLitreConverter();
	    double result = test.convert(50);
	    assertEquals(189.25,result,0.001);
		  }
  
  @Test public static void IGLTest1() {
	    UnitConverter test = new ImperialGallonToLitreConverter();
	    double result = test.convert(0);
	    assertEquals(0,result,0.001);
		  }

  @Test public static void IGLTest2() {
	    UnitConverter test = new ImperialGallonToLitreConverter();
	    double result = test.convert(Math.pow(2, 32));
	    assertEquals(19525307874.67264,result,0.001);
		  }

  @Test public static void IGLTest3() {
	    UnitConverter test = new ImperialGallonToLitreConverter();
	    double result = test.convert(0.00000125);
	    assertEquals(0.00000568261,result,0.001);
		  }
}
