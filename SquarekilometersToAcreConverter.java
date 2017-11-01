
public class SquarekilometersToAcreConverter extends AreaConverter{

	 public SquarekilometersToAcreConverter() { }

	  public double convert(double inSquarekilometers) {
	    return inSquarekilometers*247.105;
	  }

	  public String toString(){
	    return "Squarekilometers To Acre Converter";
	  }

	  public void print(){
	    System.out.println(toString());
	  }
};
