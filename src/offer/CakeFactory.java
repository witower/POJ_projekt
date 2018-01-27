package offer;

public class CakeFactory {
	public static Cake createCake(String name) {
        switch (name) {
            case "czekoladowy":
            	return new CakeChocolate();
            case "kawowy":
            	return new CakeCoffee();
            case "truskawkowy":
            	return new CakeStrawberry();
        	}
        throw new IllegalArgumentException("\nTort \"" + name + "\" nie jest dostepny.");
    }

}
