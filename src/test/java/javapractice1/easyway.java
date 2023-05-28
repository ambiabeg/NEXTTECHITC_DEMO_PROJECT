package javapractice1;

import java.util.ArrayList;
import java.util.HashMap;

public class easyway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int Mysize=6;
		HashMap<Integer, String>Size=new HashMap <Integer, String>();
		Size.put(6,"X-Small");
		Size.put(8, "Small");
		Size.put(10, "Medium");
		Size.put(12,  "Large");
		Size.put(14, "X-Large");
		
		if(Size.containsKey(Mysize)) {
			System.out.println("your size is "+Size.get(Mysize));
		}
		else {
			System.out.println("Sorry we do not have your size");
		}
		
		//month of the bill
		HashMap<String, Double>bill=new HashMap <String, Double>();
		bill.put("NOV", 10.59);
		bill.put("DEC",20.49);
		bill.put("JAN", 30.39);
		bill.put("FEB", 20.29);
		
		int n=bill.size(); //no of total months
		double total=0;//total of bill
		for(Double i:bill.values()) {
			total=total+i/n;
		}
		
		System.out.println("Average bill for "+n+" month is $" + total+".");
		

	}

}
