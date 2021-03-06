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
    assertEquals(-0.85,result,0.001);
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
	    assertEquals(2084482003,result,0.001);
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

  @Test public static void USGLTest2() { /*little double overflow test*/
	    UnitConverter test = new USGallonToLitreConverter();
	    double result = test.convert(Math.pow(2, 64));
	    assertEquals(Math.pow(10, 7)*6982092631899.066,result,0.001);
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
		  
  @Test public static void SHTest1() {
	    UnitConverter test = new SquarekilometersToHectareConverter();
	    double result = test.convert(20);
	    assertEquals(0.2,result,0.001);
		  }
		  
  @Test public static void SHTest2() {
	    UnitConverter test = new SquarekilometersToHectareConverter();
	    double result = test.convert(0.5);
	    assertEquals(0.005,result,0.001);
		  }

  @Test public static void SHTest3() {
	    UnitConverter test = new SquarekilometersToHectareConverter();
	    double result = test.convert(0.00123);
	    assertEquals(0.0000123,result,0.001);
		  }
  @Test public static void SATest1() {
	    UnitConverter test = new SquarekilometersToHectareConverter();
	    double result = test.convert(45);
	    assertEquals(0.45,result,0.001);
  		}
  
  @Test public static void SATest2() {
	    UnitConverter test = new SquarekilometersToHectareConverter();
	    double result = test.convert(501);
	    assertEquals(5.01,result,0.001);
		}
  //  uncommen value
  @Test public static void SATest3() {
	    UnitConverter test = new SquarekilometersToHectareConverter();
	    double result = test.convert(Math.pow(2, 28));
	    assertEquals(2684354.56,result,0.001);
		}
}
