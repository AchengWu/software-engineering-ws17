
public class SquarekilometersToHectareConverter extends AreaConverter{
	 public SquarekilometersToHectareConverter() { }

	  public double convert(double inSquarekilometers) {
	    return inSquarekilometers*0.01;
	  }

	  public String toString(){
	    return "Squarekilometers To Hectare Converter";
	  }

	  public void print(){
	    System.out.println(toString());
	  }

};
