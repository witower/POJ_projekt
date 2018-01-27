package offer;

public final class CakeCoffee extends Cake {

	public CakeCoffee() {
		
		name = "Tort kawowy";
		
		ingredients.add("krem kawowy");
		ingredients.add("ziarna kawy");
		ingredients.add("bia�y biszkopt");
		
		sizesPrices.put("ma�y", new Double(22.00));
		sizesPrices.put("�redni", new Double(27.00));
		sizesPrices.put("du�y", new Double(32.00));
	}
}
