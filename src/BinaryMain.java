import java.util.*;

public class BinaryMain {
	
	public static void main(String[] args) {
		Scanner kwomp = new Scanner(System.in);
		
		System.out.println("Do you want to convert from binary to decimal or from decimal to binary? Type 1 for binary to decimal, or 2 for decimal to binary.");
		int answer = kwomp.nextInt();
		
		if(answer == 1) {
			System.out.println("What number would you like to convert?");
			kwomp.nextLine();
			String answer2 = kwomp.next();
			System.out.println("That number is equivalent to: " + makeDecimal(answer2));
		}
		else if(answer == 2) {
			System.out.println("What number would you like to convert?");
			kwomp.nextLine();
			String answer3 = kwomp.next();
			System.out.println("That number is equivalent to: " + makeBinary(answer3));
		}
		kwomp.close();
	}
	
	public static String makeBinary (String nume) {
		long temp;
		long result = 0;
		for (int i = 0; i < nume.length(); i++) {
			temp = nume.charAt(i)-48;
			for (int k = nume.length()-1; k > i; k--) {
				temp = temp*10;
			}
			result = result + temp;
		}

		long[] arr = new long[1000];
		boolean flag = true;
		int i = 0;
		while (flag) {
			arr[i] = result%2;
			result = result/2;
			if (result == 0) {
				flag = false;
			}
			i = i + 1;
		}
		
		String bin = "";
		
		for (int k = i-1; k>=0; k--) {
			bin = bin + arr[k];
		}
			
		return bin;
	}
		
	public static int makeDecimal (String nume) {
		int temp;
		int result = 0;
		for (int i = 0; i < nume.length(); i++) {
			temp = nume.charAt(i)-48;
			for (int k = nume.length()-1; k > i; k--) {
				temp = temp*2;
			}
			result = result + temp;
		}
		return result;
	}
}
