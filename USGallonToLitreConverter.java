public class USGallonToLitreConverter extends LiquidConverter
{
  public USGallonToLitreConverter() { }

  public double convert(double inLitre) {
    return inLitre*3.785;
  }

  public String toString(){
    return "US Gallons to Litre Converter";
  }

  public void print(){
    System.out.println(toString());
  }
};