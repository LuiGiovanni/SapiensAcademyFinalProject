package composite;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer giovanni = new Developer(3523, "Giovanni");
		Developer grecia   = new Developer(1535, "Grecia");
		Developer luke     = new Developer(2187, "Luke");
		Developer codiwan  = new Developer(1337, "Codiwan");
		Developer kyle     = new Developer(1995, "Kyle");
		
		Manager bob	= new Manager(0001, "Bob");
		bob.add(kyle);
		bob.add(codiwan);
		bob.add(luke);
		
		Manager jose = new Manager(0002, "Jose");
		jose.add(giovanni);
		jose.add(grecia);
		jose.add(bob);
		
		List<Employee> org = new ArrayList<>();
		org.add(jose);
		org.add(bob);
		org.add(giovanni);
		org.add(grecia);
		org.add(luke);
		org.add(codiwan);
		org.add(kyle);
		
		for(Employee e : org) {
			System.out.printf("%s manages %s %n", e.getName(), e.directs());
		}
	}

}
