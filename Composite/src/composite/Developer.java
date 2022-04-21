package composite;

import java.util.Collections;
import java.util.List;

public class Developer extends Employee {
	public Developer(int id, String name) {
		super(id,name);
	}
	
	@Override
	public List<Employee> directs(){
		return Collections.EMPTY_LIST;
	}
}
