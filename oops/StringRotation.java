package oops;

import java.util.Arrays;
import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int len = str.length();
		String firstCharString = "";
		int n = in.nextInt();
		for (int i = 1; i<=n; i++) {
			char dir;
			int rotate;
			dir = in.next().charAt(0);
			rotate = in.nextInt();
			if (dir =='l' || dir == 'L')
				firstCharString += str.charAt(rotate);
			else if (dir == 'R' || dir =='r')
				firstCharString += str.charAt(len-rotate);
		}
		char cstr[] = firstCharString.toCharArray();
		Arrays.sort(cstr);
		firstCharString = new String(cstr);
		for (int i = 0;i<=len-n; i++) {
			char sstr[] = str.substring(i,i+n).toCharArray();
			Arrays.sort(sstr);
			if (firstCharString.equalsIgnoreCase(new String(sstr))) {
				System.out.println("YES");
				System.exit(0);
			}
		}
		System.out.println("NO");
	}

}
