package main;

public class InsertDeleteTwo {

	public static void main(String[] args) {
		
        int[] data = { 10, 20, 30, 40, 50 };
        
        int newValue = -10;
        
        int indexToInsert = 2;
		
		int[] newData = new int[data.length + 1];
		
		  for(int oi = 0, ci = 0; oi < data.length; oi++ )
		    { 
			    newData[ci++] = data[oi];
		        if( oi == indexToInsert ){
		            newData[ ci++ ] = newValue;
		            
		        }
		    }
		  
		  data = newData;
		  
		  for (int i : data) {
	            System.out.println(i);

	        }
	}

}

