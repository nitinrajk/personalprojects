package interviewdemo;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String args[]) {
		final String str1 = "This is the final String";
		String str2 = "Nitin";
		StringBuilder sb = new StringBuilder();
		sb.append(str2).append("-").append(str1);
		System.out.println(sb.toString());
		Family family = new Family();
		List<Child> childList = new ArrayList<Child>(1);
		Child child = new Child();
		child.setLastName("Kalakuntla");
		child.setFirstName("Ayaan");
		childList.add(child);
		family.setChildren(childList);
		testParent(family);
		
	}
	
	public static void testParent(Family family2) {
		for(Child children : family2.getChildren()) {
			System.out.println(children.getLastName());
		}
	}

}
