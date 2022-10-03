package com;
import java.util.HashMap;
public class Employeedetails {
public static void main(String args[]) {
	HashMap<Integer,String> hm=new HashMap<Integer,String> ();
	hm.put(1, "ram");
	hm.put(2, "mark");
	hm.put(3,"valli");
	System.out.println(hm.put(1, "ram"));
	System.out.println(hm.put(2, "mark"));
	System.out.println(hm.put(3, "valli"));
	
}
}
