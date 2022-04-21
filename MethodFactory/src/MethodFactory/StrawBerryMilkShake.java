package MethodFactory;


public class StrawBerryMilkShake extends MilkShake {
	public StrawBerryMilkShake(String milk) {
		name = "Strawberry Milk Shake";
		this.milk = milk;
		
		ingredients.add("Strawberries");
	}
}
