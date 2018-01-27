package offer;

public final class CakeStrawberry extends Cake {

	public CakeStrawberry() {

		name = "Tort truskawkowy";
		
		ingredients.add("krem truskawkowy");
		ingredients.add("truskawki");
		ingredients.add("bia�y biszkopt");
		
		sizesPrices.put("ma�y", new Double(25.00));
		sizesPrices.put("�redni", new Double(30.00));
		sizesPrices.put("du�y", new Double(35.00));
	}
}
