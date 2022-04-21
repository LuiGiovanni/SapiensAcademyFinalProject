package MethodFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class MilkShake {
	String name;
	String milk;
	List<String> ingredients = new ArrayList<>();
	
	
	public void addMilk() {
		System.out.printf("Adding the %s \n", milk);
	}
	
	public void addIngredients() {
		System.out.println("Adding the ingredients...");
		for (int i = 0; i < ingredients.size(); i++) {
			System.out.println(" " + ingredients.get(i));
		}
	}
	
	public void blend() {
		System.out.println("Blending...");
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "MilkShake{" + "ingredients = " + ingredients + '}';
	}
}
