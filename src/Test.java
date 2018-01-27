import order.*;

public class Test {

	public static void main(String[] args) {
		System.out.println("Witamy w Cukierni!\n");
			
		Order Jenny = new Order();
		Jenny.add("czekoladowy", "ma³y", 3);
		Jenny.add("truskawkowy", "du¿y", 1);
		Jenny.add("kawowy", "œredni", 2);
		
		Jenny.setDelivery(33);
		
		
		
		Jenny.setDelivery("Jenny Brand", "PL 80-111, Gdañsk, Zielona 43c/1");

		
		System.out.println(Jenny);
		
		// A dlaczego nie w ten sposób, tylko factory
		//Jenny.add(new CakeChocolate("small"), 3);
		//Jenny.add(new CakeStrawberry("big"), 1);
		//Jenny.add(new CakeCoffee("medium"), 2);
		//Jenny.add(new CakeCoffee(Cake.Size.Medium), 2); //gdy Size by³ enumem
		
		//// Poni¿ej gdyby enumy
		//Order John = new Order();
		//Jenny.addCake(Chocolate, big, 2);
		//Jenny.addCake(Strawberry, small, 1);
		//Jenny.addCake(Coffee, medium, 3);
		
		
		System.out.println("Do zobaczenia wkrótce £asuchu!");
	}
}
