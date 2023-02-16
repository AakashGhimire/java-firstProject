package inheritanceEx2;

public class MainBook {

	public static void main(String[] args) {
		
		Book book = new Book();
		book.setBookId(1);
		book.setBookName("Java");
		book.setBookPrice(1200);
		book.setBookType("V1");
		
		System.out.println("Annual addition " + book.getBookId());

	}

}
