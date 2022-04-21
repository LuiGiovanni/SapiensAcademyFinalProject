package MethodFactory;

public class BananaMilkShake extends MilkShake {
	public BananaMilkShake(String milk) {
		name = "Banana Milk Shake";
		this.milk = milk;
		
		ingredients.add("Bananas");
	}
}
