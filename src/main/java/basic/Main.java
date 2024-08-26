package basic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(IOFunction("FuAd"));
		
	}
	
	static String IOFunction(String s) {
        
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') 
				sb.append((char)('a' + s.charAt(i) - 'A'));
			else 
				sb.append(s.charAt(i));
		}
		return sb.toString();
    }
}
