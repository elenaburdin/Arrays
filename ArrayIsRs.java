package main;

public class ArrayIsRs {
	public static void main(String[] args) {

	Integer[] data = { 100, 200, 300, 400, null };
	
	data = leftSideNull(data);
	System.out.print( "The null value is first : " );
	for (Integer i : data) {
		System.out.print(i+" ");
	}

	data = rightSideNull(data);
	System.out.print( "\nThe null value is last : " );
	for (Integer i : data) {
		System.out.print(i+" ");

	}
}
	
	
	// Moving the null value from the last position to the first
		public static Integer[] leftSideNull(Integer[] array){

			for (int i = array.length - 1; i > 0; ) {
	            array[i--] = array[i];
	            array[i] = null;
	            }
	            return array;
		}
		
		
		// Moving the null value from the first position to the last
		public static Integer[] rightSideNull(Integer[] array){
			
			for (int i = 0; i < array.length - 1; ) {
	            array[i++] = array[i];
	            array[i] = null;
	            }
	            return array;
	    }

	}