package main;

public class InsertDelete {

	public static void main(String[] args) {
		
		int[] data = { 10, 20, 30, 40, 50 };
		
		int indexToDelete = 2;
		
		int[] newData = new int[data.length - 1];
		
		  for(int oi = 0, ci = 0; oi < data.length; oi++ )
		    {
		        if( oi != indexToDelete ){
		            newData[ ci++ ] = data[ oi ];
		            
		        }
		    }
		  
		  data = newData;
		  
		  for (int i : data) {
	            System.out.println(i);

	        }
	}

}
