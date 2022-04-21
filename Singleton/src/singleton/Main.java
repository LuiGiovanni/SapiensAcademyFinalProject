package singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigManager configManager1 = ConfigManager.getInstance();
	    ConfigManager configManager2 = ConfigManager.getInstance();
	    
	    // this password is now the new password for both instances of ConfigManager.
	    configManager1.update("password", "NEwAndImPr0vED");
	  
	    String password = configManager2.get("password");
	    
	    System.out.println(configManager1.get("password"));
	    System.out.println(password);
	    
	    // This returns true because we are not creating a new object, we are having two references to the same object.
	    System.out.println(configManager1.equals(configManager2));
	    
	    // If we try to create a new object of ConfigManager, we will have issues, even the IDE won't let us because we made our
	    // constructor private, so it is invisible. You can uncomment the next line to see this.
	    //ConfigManager test = new ConfigManager();
	}

}
