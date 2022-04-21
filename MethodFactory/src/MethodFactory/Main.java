package MethodFactory;

public class Main {

	public static void main(String[] args) {
		MilkShakeStore hmoStore = new HmoMilkShakeStore();
		
		MilkShake milkShake = hmoStore.orderShake("Strawberry Milk Shake", "Whole milk");
		System.out.println("Giovanni ordered " + milkShake.getName() + "\n");
		
	}

}
