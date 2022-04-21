package singleton;
import java.util.Map;
import java.util.HashMap;

public class ConfigManager {
	
	private static ConfigManager instance;
	
	/**
	 * This will be our Configuration Manager.
	 * type	 	 : Map
	 * Object	 : HashMap 
	 * Definition: I utilized generic<String, String> for this example, a simple key/value pair in our hash map for the db info
	 * as to not complicate the situation, but, this may be modified to fit the need required outside of Sapiens academy.
	 */
	@SuppressWarnings("serial")
	private Map<String, String> configMap = new HashMap<String, String>() {{
        put("host", "yugioh.db");
        put("port", "1337");
        put("user", "admin");
        put("password", "pa$$w0rD");
    }};
    
    /**
     * There's a private constructor as we don't want any object of this class created anywhere outside this class
     */
    private ConfigManager() {}
    
    public String update(String key, String value) {
    	return configMap.put(key, value);
    }
    
    public String get(String key) {
    	return configMap.get(key);
    }
    
    public static synchronized ConfigManager getInstance() {
    	if(instance == null) {
    		instance = new ConfigManager();
    	}
		return instance;
    	
    }
}

