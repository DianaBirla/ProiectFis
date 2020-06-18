package Client;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteBooks {
	private static   List<BookModel> list=new ArrayList<BookModel>();
	public void write(BookModel e) {
		list.add(e);
		
	}
	public static List<BookModel> get_list() {
		return list;
	}
	public static void set_list(List<BookModel> list1) {
		list=list1;
	}
}
