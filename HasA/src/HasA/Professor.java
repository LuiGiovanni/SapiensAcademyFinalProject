package HasA;

import java.util.ArrayList;
import java.util.List;

class Professor {
	private String name;
	private int id;
	Account account;
	List<Department> listDepartments = new ArrayList<>();
 
	//Assign professor name
	Professor(String name, int id) {
		this.name = name;
		this.id   = id;
	}
	
	public void addDepartment(Department dep) {
		listDepartments.add(dep);
	}
	
	public void removeDepartment(Department dep) {
		listDepartments.remove(dep);
	}
	
	public void showDepartments() {
		System.out.printf("Professor: %s. Departments: ",this.name);
		for(Department dep: listDepartments) {
			System.out.println(dep);
		}
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}	
	
	public int getId() {
		return id;
	}
	 
}
