package Login;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteUsernamesPasswords {
	public void WriteUsernamePass() {
	JSONArray user_pass= new JSONArray();
	JSONObject obj1= new JSONObject();
	JSONObject obj2= new JSONObject();
	JSONObject obj3= new JSONObject();
	
	String pas=JSONFile.encrypt("diana");
	obj1.put("password",pas);
	obj1.put("username","diana");
	user_pass.add(obj1);
	
	pas=JSONFile.encrypt("bianca");
	obj2.put("password",pas);
	obj2.put("username","bianca");
	user_pass.add(obj2);
	
	pas=JSONFile.encrypt("admin");
	obj3.put("password",pas);
	obj3.put("username","admin");
	user_pass.add(obj3);
	
	try(FileWriter file =new FileWriter("src/main/resources/Usernames_passwords.json"))
	{
		file.write(user_pass.toString());
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
}
