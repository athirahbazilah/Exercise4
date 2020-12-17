package ArrayOneDimensional;

public class Exercise1 {

	public static void main(String[] args) {
		
		// declare an array alpha of 15 element of type integer
		
		int[] alpha = new int[15];
		alpha[0] = 1;
		alpha[1] = 2;
		alpha[2] = 3;
		alpha[3] = 4;
		alpha[4] = 5;
		alpha[5] = 6;
		alpha[6] = 7;
		alpha[7] = 8;
		alpha[8] = 9;
		alpha[9] = 10;
		alpha[10] = 11;
		alpha[11] = 12;
		alpha[12] = 13;
		alpha[13] = 14;
		alpha[14] = 15;
		
		int[] beta = new int[20];
		
		//output the value of the tenth element of array alpha
		
		System.out.println(alpha[9]);
		
		//set hte value of the fifth element of array alpha to 35
		alpha[4] = 35;
		System.out.println(alpha[4]);
		
		// set the value of the ninth element of the array to the sum of the sixth and thirteenth element of the array alpha
		alpha[8] = alpha[5] + alpha[12];
		System.out.println("Sum = " + alpha[8]);
	}

}
