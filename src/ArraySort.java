import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArraySort {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Build an array with an odd # of integers.\nEnter numbers one at a time, when finished type done.");
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		while(true) {
			Scanner in= new Scanner(System.in);
			String input = in.nextLine();
			try {
				   Integer.parseInt(input); 
				   
				 } catch (NumberFormatException e) {
				   break;
				 } 
			 int x = Integer.parseInt(input); 
			 myList.add(x);
		}
		
		while(myList.size() % 2 == 0) {
			System.out.println("Please enter one more integer:");
			Scanner in= new Scanner(System.in);
			String input = in.nextLine();
			try {
				   Integer.parseInt(input); 
				   
				 } catch (NumberFormatException e) {
				   System.out.println("Please try again.");
				 } 
			 int x = Integer.parseInt(input); 
			 myList.add(x);
		}
		
		
		printList(myList);
		System.out.println("");
		int result = bigFML(myList);
		System.out.println(result);
	}
	
	public static void printList(ArrayList<Integer> a) {
		Iterator<Integer> it = a.iterator(); 
        while (it.hasNext())
            System.out.print(it.next() + " ");
	}
	
	public static int bigFML (ArrayList<Integer> a){
		
		int first = 0;
		int last = a.size()-1;
		int middle = last /2;
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		newList.add(a.get(first));
		newList.add(a.get(middle));
		newList.add(a.get(last));
		
		Collections.sort(newList);
		
		return newList.get(2);
	}

}
