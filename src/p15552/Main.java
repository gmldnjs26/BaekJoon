package p15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String []args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // ���� ������� �ʿ��� ��� ���� ó���ӵ� ������
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(bf.readLine().trim());
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
		}
		bw.flush();
	}
}