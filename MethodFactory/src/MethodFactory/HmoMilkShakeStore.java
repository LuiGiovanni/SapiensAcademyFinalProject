package MethodFactory;

public class HmoMilkShakeStore extends MilkShakeStore {
	@Override
	MilkShake makeMilkShake(String type, String milk) {
		if(type.equals("Strawberry Milk Shake")) {
			return new StrawBerryMilkShake(milk);
		} else if (type.equals("Chocolate Milk Shake")) {
			return new ChocolateMilkShake(milk);
		} else if (type.equals("Banana Milk Shake")) {
			return new BananaMilkShake(milk);
		} else {
			return null;
		}
	}
}
