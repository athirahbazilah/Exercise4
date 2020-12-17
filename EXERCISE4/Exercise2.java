package ArrayOneDimensional;

public class Exercise2 {

	public static void main(String[] args) {
		// write a statement that declare a string array initialize with the following string: 
		//sunday, monday, tuesday, wednesday, thursday, friday, saturday
		//write a loop that display content of each element on the array that u declared
		
		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		//for loops
		for (int i = 0; i < days.length; i++) {
			System.out.println(days[i]);
		}
		
		//while loops
		System.out.println();
		int j = 0;
		while (j < days.length) {
			System.out.println(days[j]);
			j++;
		}
		
		//do while loops
		System.out.println();
		int k = 0;
		do {
			System.out.println(days[k]);
			k++;
		}while (k < days.length);

	}

}
