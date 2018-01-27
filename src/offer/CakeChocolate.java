package offer;

public final class CakeChocolate extends Cake {
	
	public CakeChocolate(){
		
		name = "Tort czekoladowy";
		
		ingredients.add("krem czekoladowy");
		ingredients.add("polewa czekoladowa");
		ingredients.add("ciemny biszkopt");
		
		sizesPrices.put("ma³y", new Double(20.00));
		sizesPrices.put("œredni", new Double(25.00));
		sizesPrices.put("du¿y", new Double(30.00));
	}
}