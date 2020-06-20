package Teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Client.BookModel;
import Client.WriteBooks;

public class Write_BorrowedBook_test {
		private static List<BookModel> list=new ArrayList<BookModel>();
		@Test
		public void test0()
		{
			assertEquals(WriteBooks.get_list(),list);
		}
		
		@Test
		public void test1() 
		{
			BookModel bm=new BookModel("Cautand-o pe Alaska","Roman de dragoste","John Green","dragoste","2016","/im.png");
			list.add(bm);
			WriteBooks.write(bm);
			assertEquals(WriteBooks.get_list(),list);
		}
		@Test
		public void test2()
		{
			BookModel bm=new BookModel("Cautand-o pe Alaska","Roman de dragoste","John Green","dragoste","2016","/im.png");
			BookModel bm1=new BookModel("Ion","Iubire si pamant","Liviu Rebreanu","dragoste","2016","/im.png");
			list.add(bm);
			list.add(bm1);
			WriteBooks.write(bm);
			WriteBooks.write(bm1);
			assertEquals(WriteBooks.get_list(),list);
		}
		@Test
		public void test3()
		{
			BookModel bm=new BookModel("Cautand-o pe Alaska","Roman de dragoste","John Green","dragoste","2016","/im.png");
			BookModel bm1=new BookModel("Ion","Iubire si pamant","Liviu Rebreanu","dragoste","2016","/im.png");
			BookModel bm2=new BookModel("Baltagul","Moartea","Mihail Sadoveanu","drama","1980","/im.png");
			list.add(bm);
			list.add(bm1);
			list.add(bm2);
			WriteBooks.write(bm);
			WriteBooks.write(bm1);
			WriteBooks.write(bm2);
			assertEquals(WriteBooks.get_list(),list);
		}
		
}
