package com;
import java.util.HashMap;
 
public class Employeedetails {
public static String show(){
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	
	map.put(1, "ram");
	map.put(2, "mark");
	map.put(3,"valli");
	map.put(3,"valli");
	System.out.println(map.put(1, "ram"));
	System.out.println(map.put(2, "mark"));
	System.out.println(map.put(3, "valli"));
	
	System.out.println(map.get(3));
	return map.get(3);


	
}
}
