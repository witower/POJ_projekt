package offer;

public final class CakeCoffee extends Cake {

	public CakeCoffee() {
		
		name = "Tort kawowy";
		
		ingredients.add("krem kawowy");
		ingredients.add("ziarna kawy");
		ingredients.add("bia³y biszkopt");
		
		sizesPrices.put("ma³y", new Double(22.00));
		sizesPrices.put("œredni", new Double(27.00));
		sizesPrices.put("du¿y", new Double(32.00));
	}
}
