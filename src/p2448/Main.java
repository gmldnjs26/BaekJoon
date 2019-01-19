package p2448;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String []a = new String[N];
		a[0] = "  *  "; // k = 0 �� ���� �̸� ����
		a[1] = " * * ";
		a[2] = "*****";
		for(int k=1; 3*(int)Math.pow(2, k) <= N; k++)	{
			int mid = 3*(int)Math.pow(2, k) / 2; // 2��n ���� ����� �ݺ� �Ǵϱ� mid ����
			for(int i = mid; i < N; i++) { // k-- ���� ģ������ �����ͼ� �������� �ΰ� �ٿ��� ���
				a[i] = a[i-mid] + " " + a[i-mid];  
			}
			String str = "";
			while(str.length() < mid) { // �� �� ���� ��ü ������ ���� �߰�
				str +=  " ";
			}
			for(int i=0; i < mid; i++) {
				a[i] = str+a[i]+str; // ��ü ������ �ݾ� ������ �յڷ� �߰�
			}
		}
		for(int i=0; i <N; i++) {
			System.out.println(a[i]);
		}
	}
}
