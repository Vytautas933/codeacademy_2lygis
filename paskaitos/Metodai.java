import java.util.ArrayList;
import java.util.Arrays;

public class Metodai {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> skaiciai = new ArrayList(Arrays.asList(25,45,65));
		ArrayList<Integer> skaiciai2 = new ArrayList(Arrays.asList(25,37,29));
		
		System.out.println(smallestNumber(skaiciai2)); 
		System.out.println(average(skaiciai));
		System.out.println(middle("350"));
		System.out.println("Number of  Vowels in the string: " + Vowels("w3resource") );
		


	}
	
	
	
	
	
	
	public static Integer smallestNumber(ArrayList<Integer> numbers) {
		
		Integer smallestNumber = numbers.get(0);
		
		for(int i = 0; i<numbers.size(); i++) {
			if(numbers.get(i) < smallestNumber) {
				smallestNumber = numbers.get(i);
			}
		}
		
		
		return smallestNumber;
		
	}
	
	public static Integer average (ArrayList<Integer> numbers) {
		
		Integer sum = 0;
		
		
		for(int i = 0; i<numbers.size(); i++) {
			sum += numbers.get(i);
		}
		
		Integer averege = sum / numbers.size();
		
		
		return averege;
		
	}
	
	
	public static String middle(String middle) {
		
		int position;
		int length;
		
		if (middle.length() % 2 == 0) {
			
			position = middle.length() / 2 -1;
			length = 2;
		}else {
			position = middle.length() / 2;
			length = 1;
		}
		
		return middle.substring(position, position + length);
	}
	
	
	public static Integer Vowels(String sti) {
		
		int count = 0;
		for(int i =0; i < sti.length(); i++) {
			if(sti.charAt(i) == 'a' || sti.charAt(i) == 'e' || sti.charAt(i) == 'i'||
					sti.charAt(i) == 'o' || sti.charAt(i) == 'u') {
				count++;
			}
		}
		
		return count;
	}

}
