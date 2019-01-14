package p2839;

import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력(3이상 1000이하 수): ");
		int N = sc.nextInt(); // 배달할 설탕의 무게
		int q5, r5; // 5로 나눈 몫과 나머지
		int q3, r3; // 3로 나눈 몫과 나머지
		q5 = N/5;
		r5 = N%5;
		q3 = r5/3;
		r3 = r5%3;
		while(r3 != 0) {
			q5--;
			r5 = N - 5*q5;
			q3 = r5/3;
			r3 = r5%3;
			if(q5 == -1) break;
		}
		if(q5==-1) System.out.println(-1);
		else {
			System.out.println(q5);
			System.out.println(q3);
		}
	}
}
