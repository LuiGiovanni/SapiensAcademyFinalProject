package HasA;

import java.util.List;

public class Department {
	private String name;
	private HR hr;
	List<Professor> staff;
	
	Department(String name){
		this.name = name;
	}
	
	boolean payProfessor(Double amount) {
		boolean result = hr.payProfessor(amount);
		return result;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + "]";
	}

	public HR getHr() {
		return hr;
	}

	public void setHr(HR hr) {
		this.hr = hr;
	}
}
