package main;

public class ArrayBubbleSortApp {

	public static void main(String[] args) {
		
		int[] data = { -20, 0, 20, -50, 50 };
		//int[] data = { 60, 0, 20, -50, 50 };
		
		data = sort(data, true);
		System.out.println(true);
        for (int d : data) {
			System.out.println(d);
		}
        
        System.out.println();
        
    	data = sort(data, false);
		System.out.println(false);
        for (int d : data) {
			System.out.println(d);
		}
        
		
	}
	

	public static int[] sort(int[] array, boolean desc) {

		// bubble sort
				int temp;

				for(int j = 0; j < array.length - 1; j++) {
				for(int i = 0; i < array.length - 1; i++) {
				if (desc) {
					if( array[i] > array[i+1] ) {						
						temp = array[i];
						array[i] = array[i+1];
						array[i+1] = temp;
					} 		
				} else {
					if( array[i] < array[i+1] ) {
						temp = array[i];
						array[i] = array[i+1];
						array[i+1] = temp;
					}
					
			     }	
				
	     } 
				
				

	}
				return array;
	
	}
	
}

