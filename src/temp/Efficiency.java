package temp;

public class Efficiency {

	public static void main(String[] args) {

		
		int n = 90000;
		int count = 0;
		long startTime = 0L;
		long endTime = 0L;
		
	for (int z =0;z<6;z++){	
		
		startTime = System.currentTimeMillis();	
		
		
		
		int j =0;
		for (int i =0;i<n;i++){
						
			for (j =0;j<n-i;j++){
				
			int increment =0;
			
			increment = increment + ((j+3)/(j+3)+(i+1)/(i+1));
			
			
			increment = increment/increment;
			
			
			increment = increment +199999999;

			
			count = count + (increment-199999999);	
			
				if (count>2147483646 ){
					System.out.println("Count wrapping");
				}
			
			}
		}
		

		endTime = System.currentTimeMillis();

		System.out.println(endTime-startTime + " millS have passed");
		System.out.println("count :"+count);
		System.out.println();
		
		count=0;
	}
  }
	
	
	
	
	
	
	
	
}
