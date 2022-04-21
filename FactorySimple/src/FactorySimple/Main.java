package FactorySimple;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MilkShakeFactory milkShakeFactory = new MilkShakeFactory();
		MilkShakeStore store 			  = new MilkShakeStore(milkShakeFactory);
		
		MilkShake milkShake = store.orderShake("Banana Milk Shake");
		
	}

}
