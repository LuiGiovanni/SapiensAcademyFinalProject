package FactorySimple;

public class MilkShakeFactory {
	MilkShake createMilkShake(String type) {
		MilkShake milkShake;
		if(StrawBerryMilkShake.name().equals(type)) {
			milkShake = new StrawBerryMilkShake();
		} else if (ChocolateMilkShake.name().equals(type)) {
			milkShake = new ChocolateMilkShake();
		} else if (BananaMilkShake.name().equals(type)) {
			milkShake = new BananaMilkShake();
		} else {
			throw new RuntimeException("The passed milk shake type is not available with us...");
		}
		
		return milkShake;
	}
}
