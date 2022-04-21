package HasA;

public class HR {
	String name;
	
	public HR(String name) {
		this.name = name;
	}
	
	boolean payProfessor(double amount) {
		System.out.println("The payment was made successfully for the amount of "+amount);
		return true;
	}

	@Override
	public String toString() {
		return "HR [name=" + name + "]";
	}
}
