/**
 * 
 * Miquel Angel Montero Act5 11/01/2022 
 * 
 */
public class Act5 {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 4;
		int c = 6;
		int d = 8;
		
		b = c;
		c = a;
		a = d;
		d = b;
		
		System.out.println("a = "+a+"\nb = "+b+"\nc = "+c+"\nd = "+d);

	}

}
