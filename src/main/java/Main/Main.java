package Main;
import java.awt.EventQueue;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;

import Login.*;
import Service_program.Service;
public class Main {
	private static LoginInterface frame=new LoginInterface();
	public static void main(String[] args) {
		try {
            if (!Files.exists(Service.getPath1()))
                FileUtils.copyURLToFile(Service.class.getClassLoader().getResource("Books.json"), Service.getPath1().toFile());
            if (!Files.exists(Service.getPath2()))
                FileUtils.copyURLToFile(Service.class.getClassLoader().getResource("Usernames_passwords.json"), Service.getPath2().toFile());
            if (!Files.exists(Service.getPath3()))
               FileUtils.copyURLToFile(Service.class.getClassLoader().getResource("CreareJsonImprumut.json"), Service.getPath3().toFile());
            if (!Files.exists(Service.getPath4()))
                FileUtils.copyURLToFile(Service.class.getClassLoader().getResource("lista_imprumut.json"), Service.getPath4().toFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSONFile jf=new JSONFile();
					WriteUsernamesPasswords up=new WriteUsernamesPasswords();
					up.WriteUsernamePass();
					frame = new LoginInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}