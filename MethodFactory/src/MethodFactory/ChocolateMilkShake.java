package MethodFactory;

public class ChocolateMilkShake extends MilkShake {
	public ChocolateMilkShake(String milk) {
		name = "Chocolate Milk Shake";
		this.milk = milk;
		
		ingredients.add("Chocolate");
	}
}
