package FactorySimple;

import java.util.Arrays;

public class ChocolateMilkShake extends MilkShake {
	public ChocolateMilkShake() {
		this.ingredients = Arrays.asList("Milk", "Chocolate");
	}
	
	public static String name() {
		return "Chocolate Milk Shake";
	}
}
