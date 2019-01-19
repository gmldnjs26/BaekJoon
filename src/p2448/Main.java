package p2448;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String []a = new String[N];
		a[0] = "  *  "; // k = 0 일 경우는 미리 정의
		a[1] = " * * ";
		a[2] = "*****";
		for(int k=1; 3*(int)Math.pow(2, k) <= N; k++)	{
			int mid = 3*(int)Math.pow(2, k) / 2; // 2의n 으로 모양이 반복 되니깐 mid 설정
			for(int i = mid; i < N; i++) { // k-- 기존 친구들을 가져와서 양쪽으로 두개 붙여준 모양
				a[i] = a[i-mid] + " " + a[i-mid];  
			}
			String str = "";
			while(str.length() < mid) { // 앞 뒤 공백 전체 길이의 반이 추가
				str +=  " ";
			}
			for(int i=0; i < mid; i++) {
				a[i] = str+a[i]+str; // 전체 길이의 반씩 공백이 앞뒤로 추가
			}
		}
		for(int i=0; i <N; i++) {
			System.out.println(a[i]);
		}
	}
}
