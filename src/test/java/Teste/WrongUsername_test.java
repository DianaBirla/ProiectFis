package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ExceptionsLogin.WrongPassword;
import ExceptionsLogin.WrongUsername;
import ExceptionsLogin.WrongUsernameandPassword;
import Login.JSONFile;
import Login.UsernameandPasswordComparator;

public class WrongUsername_test {
	WrongUsername j=new WrongUsername();
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
			upc.handle_login("dia", "diana");
		} catch (WrongPassword e) {
			e.printStackTrace();
		} catch (WrongUsername e) 
		{
			String mm=e.toString();
			assertEquals(mm,mesaj);
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
			upc.handle_login("bia", "bianca");
		} catch (WrongPassword e) {
			e.printStackTrace();
		} catch (WrongUsername e) 
		{
			String mm=e.toString();
			assertEquals(mm,mesaj);
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
			upc.handle_login("ada", "admin");
		} catch (WrongPassword e) {
			e.printStackTrace();
		} catch (WrongUsername e) 
		{
			String mm=e.toString();
			assertEquals(mm,mesaj);
			e.printStackTrace();
		} catch (WrongUsernameandPassword e) {
			e.printStackTrace();
		}
	}

}
