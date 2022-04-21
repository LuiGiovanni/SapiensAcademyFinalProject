package MethodFactory;

public abstract class MilkShakeStore {
	
	abstract MilkShake makeMilkShake(String type, String milk);
	
	MilkShake orderShake(String type, String milk) {
		MilkShake milkShake = makeMilkShake(type,milk);
		
		System.out.println("Making a " + milkShake.getName());
		
		
		milkShake.addMilk();
		milkShake.addIngredients();
		milkShake.blend();
		
		return milkShake;
	}
}
