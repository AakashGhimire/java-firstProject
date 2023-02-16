package exceptionHandeling;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		
		// its not compiling, that comes under CHECKED Exception, so write try/catch block
		try {
		Class.forName("com.mysql.jdbc.driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
