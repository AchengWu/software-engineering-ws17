public class PoundToEuroConverter extends CurrencyConverter
{
  public PoundToEuroConverter() { }

  public double convert(double inPound) {
    return inPound*1.13;
  }

  public String toString(){
    return "Pound to Euro Converter";
  }

  public void print(){
    System.out.println(toString());
  }
};
