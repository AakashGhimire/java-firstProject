package exceptionHandeling;


//ExceptionHandeling is used to avoid program to terminate abnormally and continue further
// 5 keywords  == try,catch, finally, throw and throws
public class ExcentionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		int b = 10;
		int c = 0;
		
		System.out.println(a/b);
		
		try{
			
			System.out.println(a/c);
			
		}catch(ArithmeticException w) {
			System.out.println("exception handeled here");
			System.out.println("roshan " + w);
		}catch(Exception w) {
			System.out.println("exception handeled here");
			System.out.println("roshan " + w);
		}
		
		
		System.out.println("a - b = " + (a - b));

	}

}
