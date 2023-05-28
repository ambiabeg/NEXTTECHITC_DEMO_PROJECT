package javapractice1;

public class Lec1ifelse {

	public static void main(String[] args) {
		
	
		/* time uses 24 hours timing form.
		 * any time from range 0.00-11.59 will be followed by AM
		 * any time from range 12.00-23.59 will be folloowed by PM
		 */

		double currentTime=16.15; //enter current time here.
		double noonTime=12.00;
		
		if(currentTime<noonTime){
			System.out.println(currentTime + " AM");
			
		}
		
		else {
			System.out.println(currentTime + " PM");
			
			
		}
		 
		
		
	}

}
