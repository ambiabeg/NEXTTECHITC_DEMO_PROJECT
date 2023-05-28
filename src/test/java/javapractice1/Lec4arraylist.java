package javapractice1;

import java.util.ArrayList;

public class Lec4arraylist {

	public static void main(String[] args) {
		
		// Arraylist is not fixed we can add or remove data as much as we can.
		// ArrayList size can be modified
		//syntax: ArrayList <datatype> variable name=new ArrayList<datatype>(); 
		
		//add 3 cars in arraylist
				ArrayList<String> Sportscar = new ArrayList<String>(); // Create an ArrayList
				Sportscar.add("Nissan");
				Sportscar.add("BMW");
				Sportscar.add("Jeep");
				for (int i=1; i<Sportscar.size(); i+=1){
				System.out.println(Sportscar.get(i));	
					
				}
					

	}

}
