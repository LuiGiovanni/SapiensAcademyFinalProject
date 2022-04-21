package FactorySimple;

public class MilkShakeStore {
	private MilkShakeFactory milkShakeFactory;
	
	MilkShakeStore(MilkShakeFactory milkShakeFactory) {
		this.milkShakeFactory = milkShakeFactory;
	}
	
	MilkShake orderShake(String type) {
		MilkShake milkShake;
		
		milkShake = milkShakeFactory.createMilkShake(type);
		
		milkShake.addMilk();
		milkShake.addIngredients();
		milkShake.blend();
		
		return milkShake;
	}
}
