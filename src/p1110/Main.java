package p1110;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		String a,b;
		char[] tmp = new char[2];
		Scanner sc = new Scanner(System.in);	
		int N = 0;
		int num = Integer.parseInt(sc.nextLine());
		a = String.valueOf(num);
		if(num < 10) {
			tmp[0] = '0';
			tmp[1] = (char)(num+48);
			a = "0"+a;
		}
		else tmp = String.valueOf(num).toCharArray();
		
		while(true) {
			char[] tmp2 = String.valueOf(((int)tmp[0]-48) + ((int)tmp[1]-48)).toCharArray();
			System.out.println(tmp2);
			
			tmp[0] = tmp[1];
			tmp[1] = tmp2[tmp2.length-1];
			b = String.valueOf(tmp);
			N++;
			if(a.equals(b))	break;
		}
		System.out.print(N);
	}
}
