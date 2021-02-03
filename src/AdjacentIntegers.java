import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class AdjacentIntegers {
	
	public static void main(String[] args) {
		System.out.println("Build an array of integers, program will check for 3 adjacent values.\nEnter numbers one at a time, when finished type done.");
		boolean build = true;
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		while(build = true) {
			Scanner in= new Scanner(System.in);
			String input = in.nextLine();
			try {
				   Integer.parseInt(input); 
				   
				 } catch (NumberFormatException e) {
				   build = false;
				   break;
				 } 
			 int x = Integer.parseInt(input); 
			 myList.add(x);
		}
		
		printList(myList);
		System.out.println("");
		System.out.println(hasAdjacent(myList));
	}
	
	public static void printList(ArrayList<Integer> a) {
		Iterator<Integer> it = a.iterator(); 
        while (it.hasNext())
            System.out.print(it.next() + " ");
	}
	
	public static boolean hasAdjacent(ArrayList<Integer> a) {
		
		boolean res = false;
		
		Collections.sort(a);
		
		for (int i = 0; i < a.size()-2; i++) {
			if((a.get(i)+1 == a.get(i+1)) && (a.get(i+1)+1 == a.get(i+2))) {
				res=true;
				break;
			}
		}
		
		return res;
	}

}
