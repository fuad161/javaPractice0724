package basic;

public class Geeks4GeeksPractice {
	
	static void println(Object o) {
		System.out.println(o);
	}
	static void print(Object o) {
		System.out.print(o);
	}
	static void printf(String s, Object... args) {
		System.out.format(s, args);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startNanoTime = System.currentTimeMillis();//System.nanoTime();
		execute();
		long endNanoTime = System.currentTimeMillis(); //System.nanoTime();

		String dashLine = "---------------------------------------";
		System.out.println("\n\n" + dashLine);
		String timeMsg = "execution time: " + (endNanoTime - startNanoTime);
		int spacePadding = (dashLine.length() - timeMsg.length() - 1) / 2;
		System.out.format("|%"+(timeMsg.length()+spacePadding)+"s%"+(spacePadding+1)+"s\n", timeMsg, " |");
		System.out.println(dashLine);

	}
	public static void execute() {
		println(upperCase2Lower("Fuad"));
	}
	//-----------------------------------------------------//
	
	static String upperCase2Lower(String s) {
        
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
