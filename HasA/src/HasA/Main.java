package HasA;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department cs = new Department("Computer Science");
		cs.setHr(new HR("Leopold Strauss"));
		boolean resPayment = cs.payProfessor(20_000.00);
		  
		System.out.println(cs.getHr());
		System.out.println("Payment transaction: " + resPayment);
		System.out.println();
		
		Professor prof1 = new Professor("Miguel",001);
		prof1.setAccount(new Account("001"));
		prof1.addDepartment(cs);
		prof1.showDepartments();
		
		System.out.println(prof1.getAccount());
		
		// prof1 = null
		// System.out.println(prof1.getAccount());		 
		
	}

}
