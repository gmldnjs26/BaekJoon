package p2941;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] arr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		while(str.length() > 2) {
			for(int i=0; i < arr.length; i++) {
				if(str.substring(0, 2).equals(arr[i])) {
					count++;
					str = str.substring(2);
					break;
				}
				else if(str.substring(1, 2).equals(arr[i])) {
					count = count +2;
					str = str.substring(3);
					break;
				}
				else if(str.substring(0, 3).equals(arr[i])) {
					count++;
					str = str.substring(3);
					break;
				}
				if(i == arr.length-1) {
					str = str.substring(1);
					count++;
					break;
				}
			}
		}
		if(str.length() == 2) {
			for(int i=0; i < arr.length; i++) {
				if(str.equals(arr[i])) {
					count++;
					break;
				}
				if(i == arr.length-1) count = count +2;
			}
			System.out.println(count);
		}
		else System.out.println(count+str.length());
					

	}
}
