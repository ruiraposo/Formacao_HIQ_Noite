import java.util.Arrays;


public class Tester {

	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {1,2,3,4,5};
		
		System.out.println(array1 == array2);
		System.out.println(array1.equals(array2));
		System.out.println( Arrays.equals( array1, array2) );
		String a = null;
		System.out.println( a instanceof Object );
		
		Integer i = 10;
		Integer j = 11;
		Integer k = ++i;
		String s;
		System.out.println(j == k);
		System.out.println(j.equals(k));
		
		// ftp://hiq-fss01.hiqconsulting.org/
	}

}
