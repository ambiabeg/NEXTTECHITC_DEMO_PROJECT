package javapractice1;

import java.util.HashMap;

public class Lec5HashMap {


	public static void main(String[] args) {
		
	
		// HashMap<datatype,datatype>variable name=new HashMap<datatype,datatype>();
		
		//store three fruit name of Bangladesh
		HashMap<String, String> Fruit=new HashMap<String, String>();
		Fruit.put("Bangladesh","Mango");
		Fruit.put("Bangladesh", "guava");
		Fruit.put("Bangladesh","orang");
		
		//Fruit.get("Fruit");
		System.out.println(Fruit);
	
		//create 3 student names and IDs
		HashMap<String, Integer> Student=new HashMap<String, Integer>();
		Student.put("Dola", 110);
		Student.put("Lou", 123);
		Student.put("Tina", 220);
		System.out.println("HashMap:"+Student);
		
		Student.remove("Tina");
		System.out.println("BrilLiant student:" +Student);
		Student.remove("Tina"); Student.remove("Lou");
		System.out.println(Student);
		
		
		//months and days
		String []months= {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP","OCT", "NOV", "DEC"};
		HashMap <String,Integer> monthday=new HashMap <String, Integer>();
		monthday.put("JAN", 31);
		monthday.put("FEB", 28);
		monthday.put ("MAR", 31);
		monthday.put("APR",30);
		monthday.put("May", 31);
		monthday.put("JUN",30);
		monthday.put("JUL", 31);
		monthday.put("AUG", 31);
		monthday.put("SEP",30);
		monthday.put("OCT", 31);
		monthday.put("NOV",30);
		monthday.put("DEC",31);
		
		//int n=5;//no of month will give
		//for(String i:monthday.keySet()) {
			//if (i==months[n-1])
				//System.out.println(months[n-1]+" is the "+n+" number of month of the year and has "+monthday.get(i)+" days.");
		
		
		int Mysize=17;
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
		

	}

}
