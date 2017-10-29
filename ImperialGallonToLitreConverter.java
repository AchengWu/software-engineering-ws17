public class ImperialGallonToLitreConverter extends LiquidConverter
{
  public ImperialGallonToLitreConverter() { }

  public double convert(double inLitre) {
    return inLitre*4.54609;
  }

  public String toString(){
    return "Imperial Gallons to Litre Converter";
  }

  public void print(){
    System.out.println(toString());
  }
};