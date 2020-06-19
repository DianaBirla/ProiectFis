package Client;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReaderFeedback {
	private String titlu;
	private boolean feedback;
	private int nr;

public int get_number()
{
	JSONParser parser = new JSONParser();
	try (Reader reader = new FileReader("src/main/resources/CreareJsonImprumut.json")) 
	{
		JSONArray jsonArray = (JSONArray) parser.parse(reader);
		Iterator<JSONObject> it = jsonArray.iterator();
		while (it.hasNext()) 
		{
			JSONObject obj = it.next();
			nr++;
			
		}
		} catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ParseException e) 
		{
			e.printStackTrace();
		}
	return nr;
}
public void get_feedback(int count)
{
	JSONParser parser = new JSONParser();
	int aux=0;
	try (Reader reader = new FileReader("src/main/resources/CreareJsonImprumut.json")) 
	{
		JSONArray jsonArray = (JSONArray) parser.parse(reader);
		Iterator<JSONObject> it = jsonArray.iterator();
		while (it.hasNext()&&aux!=count) 
		{
			JSONObject obj = it.next();
			titlu=(String) obj.get("Titlu");
			feedback=(boolean) obj.get("Respinge");
			aux++;
		}
		} catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ParseException e) 
		{
			e.printStackTrace();
		}
}

public String get_titlu() {
	return titlu;
}
public boolean get_feedback() {
	return feedback;
}
}

