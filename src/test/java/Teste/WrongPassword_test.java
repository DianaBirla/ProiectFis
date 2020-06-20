package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ExceptionsLogin.WrongPassword;
import ExceptionsLogin.WrongUsername;
import ExceptionsLogin.WrongUsernameandPassword;
import Login.JSONFile;
import Login.UsernameandPasswordComparator;

public class WrongPassword_test {
	WrongPassword j=new WrongPassword();
	private String mesaj=j.toString();
	@Test
	public void test1() {
		try {
			JSONFile jf=new JSONFile();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		
		UsernameandPasswordComparator upc=new UsernameandPasswordComparator();
		try {
			upc.handle_login("diana", "password");
		} catch (WrongPassword e) {
			String mm=e.toString();
			assertEquals(mm,mesaj);
			e.printStackTrace();
		} catch (WrongUsername e) {
			e.printStackTrace();
		} catch (WrongUsernameandPassword e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test2() {
		try {
			JSONFile jf=new JSONFile();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		
		UsernameandPasswordComparator upc=new UsernameandPasswordComparator();
		try {
			upc.handle_login("bianca","buleu");
		} catch (WrongPassword e) {
			String mm=e.toString();
			assertEquals(mm,mesaj);
			e.printStackTrace();
		} catch (WrongUsername e) {
			e.printStackTrace();
		} catch (WrongUsernameandPassword e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test3() {
		try {
			JSONFile jf=new JSONFile();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		
		UsernameandPasswordComparator upc=new UsernameandPasswordComparator();
		try {
			upc.handle_login("admin", "alabala");
		} catch (WrongPassword e) {
			String mm=e.toString();
			assertEquals(mm,mesaj);
			e.printStackTrace();
		} catch (WrongUsername e) {
			e.printStackTrace();
		} catch (WrongUsernameandPassword e) {
			e.printStackTrace();
		}
	}
	

}
