package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ExceptionsLogin.WrongPassword;
import ExceptionsLogin.WrongUsername;
import ExceptionsLogin.WrongUsernameandPassword;
import Login.JSONFile;
import Login.UsernameandPasswordComparator;

public class WrongUsernameandPassword_test {
	WrongUsernameandPassword j=new WrongUsernameandPassword();
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
			upc.handle_login("dede", "password");
		} catch (WrongPassword e) {
			e.printStackTrace();
		} catch (WrongUsername e) {
			e.printStackTrace();
		} catch (WrongUsernameandPassword e) {
			String mm=e.toString();
			assertEquals(mm,mesaj);
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
			upc.handle_login("ana", "word");
		} catch (WrongPassword e) {
			e.printStackTrace();
		} catch (WrongUsername e) {
			e.printStackTrace();
		} catch (WrongUsernameandPassword e) {
			String mm=e.toString();
			assertEquals(mm,mesaj);
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
			upc.handle_login("elena", "mircea");
		} catch (WrongPassword e) {
			e.printStackTrace();
		} catch (WrongUsername e) {
			e.printStackTrace();
		} catch (WrongUsernameandPassword e) {
			String mm=e.toString();
			assertEquals(mm,mesaj);
			e.printStackTrace();
		}
	}

}
