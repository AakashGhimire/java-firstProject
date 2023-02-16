package stringAssignment;

public class MaxMinOccourance {

	public static void main(String[] args) {

		String st = new String("watermelon");

		char[] ch = st.toCharArray();

		int length = ch.length;
		
		int[] count = new int[ch.length];
		
		System.out.println("Max occourance is: " + length);
		
		int max = -1;
		char result = ' ';
		
		for (int i = 0; i < length; i++) {

			count[ch.length - 1]++;

		}

		for (int i = 0; i < length; i++) {
			if (max < count[ch.length - 1]) {
				max = count[ch.length - 1];
				result = st.charAt(i);
			}
		}
		System.out.println("Max occourance is: " + result);

	}

}
