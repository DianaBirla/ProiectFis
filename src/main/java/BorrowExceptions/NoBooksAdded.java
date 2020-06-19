package BorrowExceptions;

public class NoBooksAdded  extends Exception{
	public NoBooksAdded () {
		super(String.format("Nu e nicio carte adaugata in lista"));
	}
}

