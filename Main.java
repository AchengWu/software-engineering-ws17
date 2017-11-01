class Main {
  public static void main(String[] args)
  {
    String conversion = args[0];
    double value = Double.parseDouble(args[1]);
    double convalue;
    
    switch (conversion.toLowerCase()) {
    case "dollartoeuro":
    	UnitConverter DollarConverter = new DollarToEuroConverter();
    	convalue = DollarConverter.convert(value);
    	System.out.println(DollarConverter.toString() + " has converted " + value + " USD to " + convalue + " EUR!");
        break;
        
    case "poundtoeuro":
    	UnitConverter PoundConverter = new PoundToEuroConverter();
    	convalue = PoundConverter.convert(value);
    	System.out.println(PoundConverter.toString() + " has converted " + value + " Pound to " + convalue + " EUR!");
        break;
        
    case "usgallontolitre": case "usgallonstolitres":
    	UnitConverter USGallonConverter = new USGallonToLitreConverter();
    	convalue = USGallonConverter.convert(value);
    	System.out.println(USGallonConverter.toString() + " has converted " + value + " US gallons to " + convalue + " litres!");
        break;
        
    case "imperialgallontolitre": case "imperialgallonstolitres":
    	UnitConverter ImperialGallonConverter = new ImperialGallonToLitreConverter();
    	convalue = ImperialGallonConverter.convert(value);
    	System.out.println(ImperialGallonConverter.toString() + " has converted " + value + " Imperial gallons to " + convalue + " litres!");
        break;
    case "squarekilometertohectare": case "squarekilometerstohectares":
    	UnitConverter SquarekilometersHectareConverter = new SquarekilometersToHectareConverter();
    	convalue = SquarekilometersHectareConverter.convert(value);
    	System.out.println(SquarekilometersHectareConverter.toString() + " has converted " + value + " Squaremeters to " + convalue + " Hectare!");
        break;
    case "squarekilometertoacre": case "squarekilometerstoacres":
    	UnitConverter SquarekilometersAcreConverter = new SquarekilometersToAcreConverter();
    	convalue = SquarekilometersAcreConverter.convert(value);
    	System.out.println(SquarekilometersAcreConverter.toString() + " has converted " + value + " Squaremeters to " + convalue + " Hectare!");
        break;
    };
        

    /*
     * TODO
     *
     * use desired conversion here
     *
    */

    
    /*double aLotOfDollars = 10000;
   double aLotOfEuros = myConverter.convert(aLotOfDollars);*/
    
  }
}
