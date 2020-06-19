package Service_program;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Service {


	
		private static final String USER_FOLDER = System.getProperty("user.dir");
	    public static final Path APPLICATION_HOME_PATH = Paths.get(USER_FOLDER);
	    private static final Path USERS_PATH1 = Service.getPathToFile("src/main/resources/Books.json");
	    private static final Path USERS_PATH2 = Service.getPathToFile("src/main/resources/Usernames_passwords.json");
	    private static final Path USERS_PATH3 = Service.getPathToFile("src/main/resources/CreareJsonImprumut.json");
	    private static final Path USERS_PATH4 = Service.getPathToFile("src/main/resources/lista_imprumut.json");
	    public static Path getPathToFile(String... path) {
	        return APPLICATION_HOME_PATH.resolve(Paths.get("", path));
	    }
	    
	    public static Path getPath1() {
	    	return USERS_PATH1;
	    }
	    public static Path getPath2() {
	    	return USERS_PATH2;
	    }
	    public static Path getPath3() {
	    	return USERS_PATH3;
	    }
	    public static Path getPath4() {
	    	return USERS_PATH4;
	    }

}
